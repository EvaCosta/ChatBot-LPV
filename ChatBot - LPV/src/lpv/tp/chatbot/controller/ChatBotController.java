package lpv.tp.chatbot.controller;

import java.util.HashMap;

import com.ibm.watson.assistant.v2.model.MessageResponse;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import lpv.tp.chatbot.classes.AreaTexto;
import lpv.tp.chatbot.classes.BarraMenu;
import lpv.tp.chatbot.classes.Botao;
import lpv.tp.chatbot.classes.BotaoDeAlternancia;
import lpv.tp.chatbot.classes.BotaoRadio;
import lpv.tp.chatbot.classes.CampoTexto;
import lpv.tp.chatbot.classes.ComponentePesquisado;
import lpv.tp.chatbot.classes.Imagem;
import lpv.tp.chatbot.classes.PainelSplit;
import lpv.tp.chatbot.classes.Rotulo;
import lpv.tp.chatbot.classes.VerticalBox;
import lpv.tp.chatbot.thread.ThreadVerificarConexao;
import lpv.tp.chatbot.ui.Mensagem;
import lpv.tp.chatbot.ui.Mensagem.TipoMensagem;
import lpv.tp.chatbot.watson.IntegracaoWatson;

public class ChatBotController {

	@FXML private VBox chatPane;
	@FXML private TextField msgField;
	@FXML private Button btnEnviar;
	@FXML private ScrollPane scrollPane;
	@FXML private AnchorPane barraDeTitulo;
	@FXML private Ellipse iconeConexao;
	
	private ColorAdjust corBlur;
	private GaussianBlur blurEffect;
	
	private boolean conectado;
	private static boolean blur = false;
	private HashMap<String, ComponentePesquisado> componentes;

	private static double chatPaneWidth = 0;
	private static Scene mainScene;

	private IntegracaoWatson integracaoWatson;
	private String corIconeDesconectado = "#F44336";
	private String corIconeConectado = "#8bc34a";

	@FXML
	public void initialize() {
		chatPaneWidth = chatPane.getPrefWidth();
		componentes = new HashMap<String, ComponentePesquisado>();

		componentes.put("Button", new Botao());

		componentes.put("MenuBar", new BarraMenu());
		componentes.put("RadioButton",new BotaoRadio());
		componentes.put("Vbox", new VerticalBox());
		componentes.put("Label", new Rotulo());
		componentes.put("SplitPane", new PainelSplit());
		componentes.put("TextArea", new AreaTexto());
		componentes.put("TextField", new CampoTexto());
		componentes.put("ImageView", new Imagem());
		componentes.put("ToggleButton", new BotaoDeAlternancia());
											 
		msgField.addEventHandler(KeyEvent.KEY_PRESSED, (e)->{
			if(e.getCode() == KeyCode.ENTER){
				mainScene = msgField.getScene();
				enviarMensagem();
			}
		});

		chatPane.heightProperty().addListener((observable, oldVal, newVal)->{

			scrollPane.setVvalue((double)newVal);

		});

		msgField.requestFocus();

		integracaoWatson = new IntegracaoWatson();

		Platform.runLater(() -> {
			mainScene = msgField.getScene();
			printResposta(integracaoWatson.enviarMensagem(""));
		});

		new ThreadVerificarConexao(this).start();
		
		adicionarTratadorEventoBlur();
	}

	private void adicionarTratadorEventoBlur() {
		corBlur = new ColorAdjust(0, 1, -0.5, 0);
		blurEffect = new GaussianBlur(50);
		
		scrollPane.addEventHandler(MouseEvent.MOUSE_ENTERED, (event) -> {
			if(blur) desligarBlur();
		});

		scrollPane.addEventHandler(MouseEvent.MOUSE_EXITED, (event) -> {
			if(!conectado && !blur) ligarBlur();
		});
	}

	@FXML
	public void btnEnviar(ActionEvent e){
		Button btn = (Button)e.getSource();
		mainScene = btn.getScene();
		enviarMensagem();

	}

	private void enviarMensagem(){
		if(msgField.getText().length() > 0 && !msgField.getText().matches("\\s*")){

			chatPane.getChildren().add(new Mensagem(TipoMensagem.PERGUNTA, new Label(msgField.getText().trim())));

			printResposta(integracaoWatson.enviarMensagem(msgField.getText()));
		}
		msgField.setText("");
		msgField.requestFocus();

	}

	private void printResposta(MessageResponse messageResponse) {
		System.out.println(messageResponse);

		Mensagem msg = new Mensagem(TipoMensagem.RESPOSTA);

		// Mensagem genÃ©rica, nÃ£o se trata de um componente
		if (messageResponse.getOutput().getEntities().isEmpty()) {
			msg.adicionarConteudo(messageResponse.getOutput().getGeneric().get(0).getText());
			chatPane.getChildren().add(msg);
		}
		else { // Resposta sobre um componente
		msg.adicionarConteudoExpandivel("Descrição", 				componentes.get(messageResponse.getOutput().getEntities().get(0).getValue()).descricao());
		msg.adicionarConteudoExpandivel("Código", false,
				componentes.get(messageResponse.getOutput().getEntities().get(0).getValue()).exemplo());
		msg.adicionarConteudoExpandivel("Exemplo", false, 
				componentes.get(messageResponse.getOutput().getEntities().get(0).getValue()).componente());

																								   
			chatPane.getChildren().add(msg);
			printResposta(integracaoWatson.enviarMensagem(""));
		}

	}

	public static double getChatPaneWidth() {
		return chatPaneWidth;
	}

	public static void setChatPaneWidth(double width) {
		chatPaneWidth = width;
	}
 


	public static Scene getMainScene() {
		return mainScene;
	}

	public void exibirProblemaConexao() {
		
		System.err.println("entrei");
		iconeConexao.setFill(Color.web(corIconeDesconectado));
		msgField.setText("Parece que você está sem internet :(");
		msgField.setStyle("-fx-text-inner-color: " + corIconeDesconectado);
		msgField.applyCss();
		msgField.setEditable(false);
		btnEnviar.setDisable(true);


		if(conectado)ligarBlur();
		
		conectado = false;
		


	}
	

	private void desligarBlur() {
		if(!blur) return;
		chatPane.setEffect(null);
		blur = false;
	}

	private void ligarBlur() {
		if(blur) return;
		
		corBlur.setInput(blurEffect);
		chatPane.setEffect(corBlur);
		blur = true;

	}




	public void exibirConexaoAtiva() {
		if(conectado) return;
		iconeConexao.setFill(Color.web(corIconeConectado));
		msgField.setEditable(true);
		msgField.setText("");
		btnEnviar.setDisable(false);
		msgField.setStyle("-fx-text-inner-color: #000");

		
		desligarBlur();
		conectado = true;

		// scene.setFill(scene.getFill() == Color.BLACK ? null : Color.BLACK);

	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}



}//class ChatBotController
