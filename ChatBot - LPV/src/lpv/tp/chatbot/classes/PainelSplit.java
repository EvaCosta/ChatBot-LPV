package lpv.tp.chatbot.classes;


import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

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
		return new Label(new StringBuilder("Um controle que tem dois ou mais lados, cada um separado por um divisor, que pode ser")
				.append("arrastado pelo usu�rio para dar mais espa�o a um dos lados, resultando no outro lado encolhendo em uma")
				.append("quantidade igual.\n")
				.append("Os n�s podem ser posicionados horizontalmente um ao lado do outro ou empilhados verticalmente. Isso "
						+ "pode ser controlado pela configura��o orientationProperty()")
				.append("Os divisores em um SplitPane t�m o seguinte comportamento:\n")

				.append(" - Os divisores n�o podem se sobrepor a outro divisor\n")
				.append(" - Divisores n�o podem se sobrepor a um n�.\n")
				.append(" - Os divisores que se movem para a esquerda / topo param quando o tamanho m�nimo do n� � atingido.\n")
				.append(" - Os divisores que se movem para a direita / inferior param quando o tamanho m�ximo do n� � atingido.\n")
				.append("Os n�s precisam ser colocados dentro de um cont�iner de layout antes"
						+ " de serem adicionados ao SplitPane. Se o n� n�o estiver dentro de um cont�iner de layout,"
						+ " a posi��o m�xima e m�nima do divisor ser� o tamanho m�ximo e m�nimo do conte�do.\n")
				.append("\nSaiba mais em: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/SplitPane.html")
				.toString());

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
		
		ImageView minhaImagem = new ImageView("file:///" + System.getProperty("user.dir") + "\\img\\bot.png");
		minhaImagem.setPreserveRatio(true);
		
		SplitPane meuSplitPane = new SplitPane(new VBox(label1, minhaImagem), new VBox(label2, new Button("Teste")), label3);

		return meuSplitPane;
	}
}
