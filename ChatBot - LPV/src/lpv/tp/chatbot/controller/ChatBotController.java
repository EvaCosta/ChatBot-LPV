package lpv.tp.chatbot.controller;

import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ibm.watson.assistant.v2.model.MessageResponse;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import lpv.tp.chatbot.classes.Botao;
import lpv.tp.chatbot.classes.ComponentePesquisado;
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
		
		// Mensagem genérica, não se trata de um componente
		if (messageResponse.getOutput().getEntities().isEmpty()) {
			msg.adicionarConteudo(messageResponse.getOutput().getGeneric().get(0).getText());
			chatPane.getChildren().add(msg);
		}
		else { // Resposta sobre um componente
			msg.adicionarConteudoExpandivel("Descrição", componentes.get(messageResponse.getOutput().getGeneric().get(0).getText()).descricao());
			msg.adicionarConteudoExpandivel("Código", componentes.get(messageResponse.getOutput().getGeneric().get(0).getText()).exemplo());
			msg.adicionarConteudoExpandivel("Exemplo", componentes.get(messageResponse.getOutput().getGeneric().get(0).getText()).componente());

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
	

}//class ChatBotController
