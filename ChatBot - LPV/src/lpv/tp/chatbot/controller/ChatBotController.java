package lpv.tp.chatbot.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import lpv.tp.chatbot.classes.ConteudoPesquisado;
import lpv.tp.chatbot.classes.Imagem;

public class ChatBotController {
	
@FXML  private TextArea exibirTextoId;
	
	@FXML
	public void initialize() {
		ConteudoPesquisado conteudo = new Imagem();
		exibirTextoId.setText(conteudo.toString());
		exibirTextoId.setFont(new Font("Arial Italic", 15));
	}
	
}//class ChatBotController 
