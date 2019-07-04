package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Rotulo extends ComponentePesquisado{

	public Rotulo() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx Label.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" /*Você deve da um nome ao seu label e inicia-lo.*/\nLabel meuLabel = new Label();");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Daremos um exemplo de como definir um tipo \n*de fonte ao seu Label e seu tamanho.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" /*Aqui definimos o tipo da fonte como Verdana Bold e \n*seu tamanho como 20*/\nmeuLabel.setFont(new Font(\"Verdana Bold\", 20));");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como inserir no Label o texto que deseja \n*exibir no console*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" meuLabel.setText(\"Conteúdo que eu desejo exibir\");");
		exemploCodigo.append("\n");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("public class Label\r\n" + 
				"estende etiquetado\r\n" + 
				"\r\n" + 
				"Label é um controle de texto não editável. Um rótulo é útil para exibir texto necessário "
				+ "\npara caber em um espaço específico e, portanto, pode precisar usar reticências "
				+ "\nou truncamento para dimensionar a seqüência de caracteres. Os rótulos também são úteis "
				+ "\nporque podem ter mnemônicos que, se usados, enviarão foco para o Controle listado como "
				+ "\no destino da propriedade labelFor.");
	}

	@Override
	public Node componente() {
		Label meuLabel = new Label();
		meuLabel.setFont(new Font("Verdana Bold", 20));
		meuLabel.setText("Conteúdo que eu desejo exibir");
		return meuLabel;
	}

}//class Botao
