package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;

public class Alerta extends ComponentePesquisado{

	public Alerta() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder();
		conteudo.append("\n");
		conteudo.append("/*\n* Exemplo de como criar um componente JavaFx Alert.\n*/");
		conteudo.append("\n");
		conteudo.append("Alert meuAlert = new TextAlert(); /*Voc� deve dar um nome ao seu componente e inicia-lo.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Aqui voc� definira o t�tulo do seu componente.\n*/");
		conteudo.append("\n");
		conteudo.append("meuAlert.setTitle(\"Titulo do meu Alerta\");");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Aqui voc� definir� o conte�do que aparecer� dentro do cabe�alho de seu Alert.\n*/");
		conteudo.append("\n");
		conteudo.append("meuAlert.setHeaderText(\"Conte�do do cabe�alho do meu alerta.\"); /*Voc� pode deixa-lo vazio caso queira.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Aqui voc� definir� o conte�do que aparecer� dentro do corpo de seu Alert.\n*/");
		conteudo.append("\n");
		conteudo.append("meuAlert.alert.setContentText(\"Conte�do do corpo do meu alerta.\"); /*Voc� pode deixa-lo vazio caso queira.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n * Voc� pode definir o tipo de seu alertas os tipos dispon�veis s�o acessados atraves das enumera��es da classe.");
		conteudo.append("\n");
		conteudo.append("* AlertType, os quais s�o AlertType.CONFIRMATION, AlertType.ERROR, AlertType.INFORMATION, AlertType.NONE, AlertType.WARNING.\n*/");
		conteudo.append("\n");
		conteudo.append("meuAlert.setAlertType(AlertType.CONFIRMATION); /*Exemplo de um alert do tipo CONFIRMATION.*/");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString

	@Override
	public Label descricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node componente() {
		return null;
	}

}//class CaixaDeSelecao 
