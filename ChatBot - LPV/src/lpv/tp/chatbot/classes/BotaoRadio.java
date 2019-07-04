package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

public class BotaoRadio extends ComponentePesquisado {
	
	public BotaoRadio(){
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx RadioButton.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" RadioButton meuRadioButton = new RadioButton(); /*Cria o bot�o r�dio*/");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/* Faremos um bot�o r�dio com o texto \"Concordo com os termos de uso\"*/");
		exemploCodigo.append("\nmeuRadioButton2.setText(\"Concordo com os termos de uso\");");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*O bot�o r�dio pode disparar um evento de clique o tratamento pode ser feito da seguinte forma*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("meuRadioButton.setOnAction(new EventHandler<ActionEvent>() {\n");
		exemploCodigo.append("	@Override\n	public void handle(ActionEvent event) {\n");
		exemploCodigo.append("		/*Aqui vai o c�digo da fun��o que deve ser executada*/\n	}\n});");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebView exemplo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node componente() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
