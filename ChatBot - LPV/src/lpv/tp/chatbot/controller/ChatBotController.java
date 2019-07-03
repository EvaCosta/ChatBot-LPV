package lpv.tp.chatbot.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import lpv.tp.chatbot.ui.Mensagem;
import lpv.tp.chatbot.ui.Mensagem.TipoMensagem;
import lpv.tp.chatbot.watson.IntegracaoWatson;

public class ChatBotController {
	IntegracaoWatson integracaoWatson;
	@FXML private VBox chatPane;
	@FXML private TextField msgField;
	@FXML private Button btnEnviar;
	@FXML private ScrollPane scrollPane;
	
	private static double chatPaneWidth = 0;
	private static Scene mainScene;


	@FXML
	public void initialize() {
		chatPaneWidth = chatPane.getPrefWidth();
		
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
			
			Mensagem msg = new Mensagem(TipoMensagem.RESPOSTA);
			msg.adicionarConteudoExpandivel("sadsad", new Label("fdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefew"), new Button("dsdwedwe"));
			msg.adicionarConteudoExpandivel("sadsad", new Label("fdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefewfdffwefew"), new Button("dsdwedwe"));
			
			chatPane.getChildren().add(msg);
			//integracaoWatson = new IntegracaoWatson(msgField.getText());
		}
		msgField.setText("");
		msgField.requestFocus();
	
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
