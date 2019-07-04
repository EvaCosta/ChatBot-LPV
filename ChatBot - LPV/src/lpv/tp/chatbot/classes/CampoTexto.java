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
		conteudo.append("/*Você deve dar um nome ao seu componente e inicia-lo.*/\nTextField meuTextField = new TextField();");
		conteudo.append("\n");
		conteudo.append("/*Aqui você definira o texto que aparecerá dentro do seu componente.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextField.setText(\"Conteúdo que eu quero exibir em meuTextField\");");
		conteudo.append("\n");
		conteudo.append("/*Você pode permitir que o usuário do seu programa edite o conteúdo \n de seu componente TextField ou não.*/");
		conteudo.append("\n");
		conteudo.append("/*Caso não queira permitir a edição troque o true por false.*/\nmeuTextField.setEditable(true); ");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("public class TextField\r\n" + 
				"estende o TextInputControl\r\n" + 
				"\r\n" + 
				"Componente de entrada de texto que permite ao usuário inserir uma única linha de texto não formatado. Ao contrário das versões anteriores do JavaFX, o suporte para entrada de várias linhas não está disponível como parte do controle TextField, no entanto, esse é o único propósito do controle TextArea. Além disso, se você quiser uma forma de edição de rich text, há também o controle HTMLEditor.\r\n" + 
				"\r\n" + 
				"O TextField suporta a noção de mostrar o texto do prompt ao usuário quando não há texto no TextField (por meio do usuário ou programaticamente). Essa é uma maneira útil de informar o usuário sobre o que é esperado no campo de texto, sem precisar recorrer a dicas de ferramentas ou rótulos na tela.");
	}

	@Override
	public Node componente() {
		TextField meuTextField = new TextField();
		meuTextField.setText("Conteúdo que eu quero exibir em meuTextField");
		return meuTextField;
	}

}//class CampoTexto
