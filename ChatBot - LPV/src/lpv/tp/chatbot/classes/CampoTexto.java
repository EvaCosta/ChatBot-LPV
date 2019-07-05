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
		conteudo.append("/*Aqui define-se o texto que aparecer� dentro da caixa de texto.\nPode ser vazio ou nulo (null).*/");
		conteudo.append("\n");
		conteudo.append("//meuTextField.setText(\"Conte�do a ser exibido no TextField\");");
		conteudo.append("\n\n/*Uma estat�gia mais inteligenet � colocar um placeholder\n(texto prompt)com uma dica ao usu�rio sobre o que inserir*/\n"
				+ "meuTextField.setPromptText(\"Digite seu nome\")");
		conteudo.append("\n\n");
		conteudo.append("/*Voc� pode permitir que o usu�rio do seu programa edite o\nconte�do de seu componente TextField ou n�o.");
		conteudo.append("\n");
		conteudo.append("Por padr�o � permitido, mas para que n�o seja edit�vel, no m�todo\nabaixo passa-se falso.*/\nmeuTextField.setEditable(true); ");
		conteudo.append("\n\n");
		return conteudo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label(
				"Componente de entrada de texto que permite ao usu�rio inserir uma �nica linha de texto n�o formatado. Ao contr�rio das vers�es anteriores do JavaFX, o suporte para entrada de v�rias linhas n�o est� dispon�vel como parte do controle TextField, no entanto, esse � o �nico prop�sito do controle TextArea. Al�m disso, se voc� quiser uma forma de edi��o de rich text, h� tamb�m o controle HTMLEditor.\r\n" + 
				"\r\n" + 
				"O TextField suporta a op��o de mostrar placeholders (textos informativos sobre o que inserir)\n"
				+ "quando o componente est� vazio (sem nenhum texto).");
	}

	@Override
	public Node componente() {
		TextField meuTextField = new TextField();
		meuTextField.setPromptText("Digite seu nome");
		return meuTextField;
	}

}//class CampoTexto
