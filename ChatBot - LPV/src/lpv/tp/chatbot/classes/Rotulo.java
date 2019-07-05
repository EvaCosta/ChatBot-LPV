package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
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
		exemploCodigo.append(" /*Voc� deve da um nome ao seu label e inicia-lo.*/\nLabel meuLabel = new Label();");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Daremos um exemplo de como definir um tipo \n*de fonte ao seu Label e seu tamanho.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" /*Aqui definimos o tipo da fonte como Verdana Bold e \n*seu tamanho como 20*/\nmeuLabel.setFont(new Font(\"Verdana Bold\", 20));");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como inserir no Label o texto que deseja \n*exibir no console*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" meuLabel.setText(\"Conte�do que eu desejo exibir\");");
		exemploCodigo.append("\n");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("Label � um componente de texto n�o edit�vel. Um r�tulo (label) � �til para exibir o texto necess�rio "
				+ "\npara caber em um espa�o espec�fico e, portanto, pode precisar usar retic�ncias "
				+ "\nou truncamento para dimensionar a seq��ncia de caracteres. Os r�tulos tamb�m s�o �teis "
				+ "\nporque podem ter mnem�nicos que, se usados, enviar�o foco para o Controle listado como "
				+ "\no destino da propriedade labelFor.");
	}

	@Override
	public Node componente() {
		Label meuLabel = new Label();
		meuLabel.setFont(new Font("Verdana Bold", 20));
		meuLabel.setText("Isto � um label com fonte Verdana, 20");
		return new VBox(meuLabel, new Label("Isto � um label com fonte padr�o"));
	}

}//class Botao
