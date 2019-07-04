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
		conteudo.append("/* Aqui você definira o texto que aparecerá dentro do seu\n componente.*/");
		conteudo.append("\n");
		conteudo.append(" meuTextArea.setText(\"Conteúdo que eu quero exibir em meuTextArea\");");
		conteudo.append("\n");
		conteudo.append("/* Você pode permitir que o usuário do seu programa edite o conteúdo\n de seu componente TextArea ou não.*/");
		conteudo.append("\n");
		conteudo.append(" meuTextArea.setEditable(true);\n/*Caso não queira permitir a edição troque o true por false.*/");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("public class TextArea\r\n" + 
				"estende o TextInputControl\r\n" + 
				"\r\n" + 
				"Componente de entrada de texto que permite que um usuário insira várias linhas "
				+ "\nde texto simples. Ao contrário das versões anteriores do JavaFX, o suporte "
				+ "\npara entrada de linha única não está disponível como parte do controle "
				+ "\nTextArea, no entanto, esse é o único propósito do controle TextField. "
				+ "\nAlém disso, se você quiser uma forma de edição de rich text, há "
				+ "\ntambém o controle HTMLEditor.\r\n" + 
				"\r\n" + 
				"TextArea suporta a noção de mostrar o texto do prompt para o usuário "
				+ "\nquando não há texto já na TextArea (seja por meio do usuário "
				+ "\nou definido programaticamente). Essa é uma maneira útil de "
				+ "\ninformar o usuário sobre o que é esperado na área de texto, "
				+ "\nsem precisar recorrer a dicas de ferramentas ou rótulos "
				+ "\nna tela.\r\n" + 
				"\r\n" + 
				"");
	}

	@Override
	public Node componente() {
		TextArea meuTextArea = new TextArea();
		meuTextArea.setText("Conteúdo que eu quero exibir em meuTextArea");
		meuTextArea.setEditable(true);
		return meuTextArea;
	}

}//class AreaTexto
