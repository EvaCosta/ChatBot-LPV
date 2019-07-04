package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AreaTexto extends ComponentePesquisado{

	public AreaTexto() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder();
		conteudo.append("/* Exemplo de como criar um componente JavaFx TextArea.*/");
		conteudo.append("\n");
		conteudo.append(" TextArea meuTextArea = new TextArea();");
		conteudo.append("\n");
		conteudo.append("/* Aqui voc� definira o texto que aparecer� dentro do seu\n componente.*/");
		conteudo.append("\n");
		conteudo.append(" meuTextArea.setText(\"Conte�do que eu quero exibir em meuTextArea\");");
		conteudo.append("\n");
		conteudo.append("/* Voc� pode permitir que o usu�rio do seu programa edite o conte�do\n de seu componente TextArea ou n�o.*/");
		conteudo.append("\n");
		conteudo.append(" meuTextArea.setEditable(true);\n/*Caso n�o queira permitir a edi��o troque o true por false.*/");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("public class TextArea\r\n" + 
				"estende o TextInputControl\r\n" + 
				"\r\n" + 
				"Componente de entrada de texto que permite que um usu�rio insira v�rias linhas "
				+ "\nde texto simples. Ao contr�rio das vers�es anteriores do JavaFX, o suporte "
				+ "\npara entrada de linha �nica n�o est� dispon�vel como parte do controle "
				+ "\nTextArea, no entanto, esse � o �nico prop�sito do controle TextField. "
				+ "\nAl�m disso, se voc� quiser uma forma de edi��o de rich text, h� "
				+ "\ntamb�m o controle HTMLEditor.\r\n" + 
				"\r\n" + 
				"TextArea suporta a no��o de mostrar o texto do prompt para o usu�rio "
				+ "\nquando n�o h� texto j� na TextArea (seja por meio do usu�rio "
				+ "\nou definido programaticamente). Essa � uma maneira �til de "
				+ "\ninformar o usu�rio sobre o que � esperado na �rea de texto, "
				+ "\nsem precisar recorrer a dicas de ferramentas ou r�tulos "
				+ "\nna tela.\r\n" + 
				"\r\n" + 
				"");
	}

	@Override
	public Node componente() {
		TextArea meuTextArea = new TextArea();
		meuTextArea.setText("Conte�do que eu quero exibir em meuTextArea");
		meuTextArea.setEditable(true);
		return meuTextArea;
	}

}//class AreaTexto
