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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import lpv.tp.chatbot.classes.BarraMenu;
import lpv.tp.chatbot.classes.Botao;
import lpv.tp.chatbot.classes.BotaoRadio;
import lpv.tp.chatbot.classes.ComponentePesquisado;
import lpv.tp.chatbot.classes.PainelSplit;
import lpv.tp.chatbot.classes.Rotulo;
import lpv.tp.chatbot.classes.VerticalBox;
import lpv.tp.chatbot.ui.Mensagem;
import lpv.tp.chatbot.ui.Mensagem.TipoMensagem;
import lpv.tp.chatbot.watson.IntegracaoWatson;

public class ChatBotController {
	
	@FXML private VBox chatPane;
	@FXML private TextField msgField;
	@FXML private Button btnEnviar;
	@FXML private ScrollPane scrollPane;
	@FXML private AnchorPane barraDeTitulo;
	
	private HashMap<String, ComponentePesquisado> componentes;
	
	private static double chatPaneWidth = 0;
	private static Scene mainScene;

	private IntegracaoWatson integracaoWatson;
	
	@FXML
	public void initialize() {
		chatPaneWidth = chatPane.getPrefWidth();
		componentes = new HashMap<String, ComponentePesquisado>();
		
		componentes.put("Button", new Botao());
		componentes.put("MenuBar", new BarraMenu());
		componentes.put("RadioButton",new BotaoRadio());
		componentes.put("VBox", new VerticalBox());
		componentes.put("Label", new Rotulo());
		componentes.put("SplitPane", new PainelSplit());
		
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
		
		// Mensagem gen√©rica, n√£o se trata de um componente
		if (messageResponse.getOutput().getEntities().isEmpty()) {
			msg.adicionarConteudo(messageResponse.getOutput().getGeneric().get(0).getText());
			chatPane.getChildren().add(msg);
		}
		else { // Resposta sobre um componente
			msg.adicionarConteudoExpandivel("DescriÁ„o", componentes.get(messageResponse.getOutput().getEntities().get(0).getValue()).descricao());
			msg.adicionarConteudoExpandivel("CÛdigo", componentes.get(messageResponse.getOutput().getEntities().get(0).getValue()).exemplo());
			msg.adicionarConteudoExpandivel("Exemplo", componentes.get(messageResponse.getOutput().getEntities().get(0).getValue()).componente());

			msg.adicionarConteudo(messageResponse.getOutput().getGeneric().get(1).getText());
			chatPane.getChildren().add(msg);
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
	

}//class ChatBotController
