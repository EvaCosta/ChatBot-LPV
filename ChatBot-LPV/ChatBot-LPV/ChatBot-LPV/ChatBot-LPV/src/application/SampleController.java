package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import lpv.chatbot.classes.ConteudoPesquisado;
import lpv.chatbot.classes.Imagem;
import lpv.chatbot.classes.Label;

public class SampleController {
	
	@FXML  private TextArea exibirTextoId;
	
	@FXML
	public void initialize() {
		ConteudoPesquisado conteudo = new Imagem();
		exibirTextoId.setText(conteudo.toString());
		exibirTextoId.setFont(new Font("Arial Italic", 15));
	}
	
}//class SampleController 
