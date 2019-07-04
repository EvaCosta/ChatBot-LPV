package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class VerticalBox extends ComponentePesquisado {

	public VerticalBox(){
		super();
	}

	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("/*Cria a Vertical Box*/\n VBox box = new VBox();");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Estabelecendo um espaçamento entre os componentes da Vertical Box*/");
		exemploCodigo.append("\n box.setSpacing(5);");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Estabelecendo a posição da Vertical Box dentro de seu conteiner*/");
		exemploCodigo.append("\n box.setLayoutX(10);\nbox.setLayoutY(10);");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*E então adicionar os componentes na Vertical Box no\n exemplo foram usados dois Labels*/");
		exemploCodigo.append("\n box.getChildren().add(new Label(\"Info 1\"));\n box.getChildren().add(new Label(\"Info 2\"));");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("classe pública VBox\r\n" + 
				"estende o painel\r\n" + 
				"\r\n" + 
				"VBox coloca seus filhos em uma única coluna vertical. Se o vbox tiver um conjunto "
				+ "\nde borda e / ou preenchimento, o conteúdo será colocado dentro desses inserções.\r\n" + 
				"\r\n" + 
				"O VBox redimensionará os filhos (se redimensionáveis) para suas alturas preferidas e usará "
				+ "\nsua propriedade fillWidth para determinar se redimensionar suas larguras para preencher "
				+ "\nsua própria largura ou manter suas larguras em seus preferenciais (fillWidth assume como true). "
				+ "\nO alinhamento do conteúdo é controlado pela propriedade de alinhamento, cujo padrão é Pos.TOP_LEFT.\r\n" + 
				"\r\n" + 
				"Se um vbox for redimensionado maior que sua altura preferida, por padrão, ele manterá as crianças "
				+ "\nem suas alturas preferidas, deixando o espaço extra não utilizado. Se um aplicativo desejar "
				+ "\nque um ou mais filhos sejam alocados nesse espaço extra, ele pode opcionalmente definir uma "
				+ "\nrestrição de vgrow no filho. Consulte \"Restrições de layout opcionais\" para detalhes.");
	}

	@Override
	public Node componente() {
		VBox box = new VBox();
		box.setSpacing(5);
		box.setLayoutX(10);
		box.setLayoutY(10);
		box.getChildren().add(new Label("Info 1"));
		box.getChildren().add(new Label("Info 2"));
		return box;
	}
}
