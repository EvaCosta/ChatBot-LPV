package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CampoTexto extends ComponentePesquisado{

	public CampoTexto() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder();
		conteudo.append("/*Voc� deve dar um nome ao seu componente e inicia-lo.*/\nTextField meuTextField = new TextField();");
		conteudo.append("\n");
		conteudo.append("/*Aqui voc� definira o texto que aparecer� dentro do seu componente.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextField.setText(\"Conte�do que eu quero exibir em meuTextField\");");
		conteudo.append("\n");
		conteudo.append("/*Voc� pode permitir que o usu�rio do seu programa edite o conte�do \n de seu componente TextField ou n�o.*/");
		conteudo.append("\n");
		conteudo.append("/*Caso n�o queira permitir a edi��o troque o true por false.*/\nmeuTextField.setEditable(true); ");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("public class TextField\r\n" + 
				"estende o TextInputControl\r\n" + 
				"\r\n" + 
				"Componente de entrada de texto que permite ao usu�rio inserir uma �nica linha de texto n�o formatado. Ao contr�rio das vers�es anteriores do JavaFX, o suporte para entrada de v�rias linhas n�o est� dispon�vel como parte do controle TextField, no entanto, esse � o �nico prop�sito do controle TextArea. Al�m disso, se voc� quiser uma forma de edi��o de rich text, h� tamb�m o controle HTMLEditor.\r\n" + 
				"\r\n" + 
				"O TextField suporta a no��o de mostrar o texto do prompt ao usu�rio quando n�o h� texto no TextField (por meio do usu�rio ou programaticamente). Essa � uma maneira �til de informar o usu�rio sobre o que � esperado no campo de texto, sem precisar recorrer a dicas de ferramentas ou r�tulos na tela.");
	}

	@Override
	public Node componente() {
		TextField meuTextField = new TextField();
		meuTextField.setText("Conte�do que eu quero exibir em meuTextField");
		return meuTextField;
	}

}//class CampoTexto
