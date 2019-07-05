package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;

public class PainelSplit extends ComponentePesquisado {

	public PainelSplit(){
		super();
	}

	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx SplitPane.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Cria o Painel Split*/\n");
		exemploCodigo.append(" SplitPane meuSplitPane = new SplitPane(new Label(\"Lado 1\"),\n		new Label(\"Lado 2\"),\n		new Label(\"Lado 3\"));");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*O construtor possui uma lista de par�metros de tamanho vai�vel \n* ent�o a quantidade de componentes passadas para ele pode ter \n* o n�mero necess�rio de acordo com a necessidade.\n*/");

		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("public class Label\r\n" + 
				"estende a classe Labeled\r\n" + 
				"\r\n" + 
				"Label � um controle de texto n�o edit�vel. Um r�tulo (label) � �til para exibir "
				+ "n\texto necess�rio para caber em um espa�o espec�fico e, portanto, "
				+ "\npode precisar usar retic�ncias ou truncamento para dimensionar a "
				+ "\nseq��ncia de caracteres. Os r�tulos tamb�m s�o �teis porque podem "
				+ "\nter mnem�nicos que, se usados, enviar�o foco para o Controle "
				+ "\nlistado como o destino da propriedade labelFor.");
	}

	@Override
	public Node componente() {
		String estilo = "-fx-text-fill: #000";
		
		Label label1 = new Label("Lado 1");
		label1.setStyle(estilo);
		label1.applyCss();
		
		Label label2 = new Label("Lado 2");
		label2.setStyle(estilo);
		label2.applyCss();
		
		Label label3 = new Label("Lado 3");
		label3.setStyle(estilo);
		label3.applyCss();
		
		SplitPane meuSplitPane = new SplitPane(label1, label2, label3);

		return meuSplitPane;
	}
}
