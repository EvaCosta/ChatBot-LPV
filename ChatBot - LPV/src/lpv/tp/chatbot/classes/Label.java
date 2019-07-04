package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.web.WebView;

public class Label extends ComponentePesquisado{

	public Label() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx Label.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" Label meuLabel = new Label(); /*Você deve da um nome ao seu label e inicia-lo.*/");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Daremos um exemplo de como definir um tipo de fonte ao seu Label e seu tamanho.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" meuLabel.setFont(new Font(\"Verdana Bold\", 20));/*Aqui definimos o tipo da fonte como Verdana Bold e seu tamanho como 20*/");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Exemplo de como inserir no Label o texto que deseja exibir no console*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" meuLabel.setText(\"Conteúdo que eu desejo exibir\");");
		exemploCodigo.append("\n\n");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public javafx.scene.control.Label descricao() {
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

}//class Botao
