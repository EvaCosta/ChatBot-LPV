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
		conteudo.append("/*Criando um novo objeto de campo de texto*/\nTextField meuTextField = new TextField();");
		conteudo.append("\n\n");
		conteudo.append("/*Aqui define-se o texto que aparecerá dentro da caixa de texto.\nPode ser vazio ou nulo (null).*/");
		conteudo.append("\n");
		conteudo.append("//meuTextField.setText(\"Conteúdo a ser exibido no TextField\");");
		conteudo.append("\n\n/*Uma estatégia mais inteligenet é colocar um placeholder\n(texto prompt)com uma dica ao usuário sobre o que inserir*/\n"
				+ "meuTextField.setPromptText(\"Digite seu nome\")");
		conteudo.append("\n\n");
		conteudo.append("/*Você pode permitir que o usuário do seu programa edite o\nconteúdo de seu componente TextField ou não.");
		conteudo.append("\n");
		conteudo.append("Por padrão é permitido, mas para que não seja editável, no método\nabaixo passa-se falso.*/\nmeuTextField.setEditable(true); ");
		conteudo.append("\n\n");
		return conteudo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label(
				"Componente de entrada de texto que permite ao usuário inserir uma única linha de texto não formatado. Ao contrário das versões anteriores do JavaFX, o suporte para entrada de várias linhas não está disponível como parte do controle TextField, no entanto, esse é o único propósito do controle TextArea. Além disso, se você quiser uma forma de edição de rich text, há também o controle HTMLEditor.\r\n" + 
				"\r\n" + 
				"O TextField suporta a opção de mostrar placeholders (textos informativos sobre o que inserir)\n"
				+ "quando o componente está vazio (sem nenhum texto).");
	}

	@Override
	public Node componente() {
		TextField meuTextField = new TextField();
		meuTextField.setPromptText("Digite seu nome");
		return meuTextField;
	}

}//class CampoTexto
