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
		exemploCodigo.append("/*Estabelecendo um espa�amento entre os componentes da Vertical Box*/");
		exemploCodigo.append("\n box.setSpacing(5);");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Estabelecendo a posi��o da Vertical Box dentro de seu conteiner*/");
		exemploCodigo.append("\n box.setLayoutX(10);\nbox.setLayoutY(10);");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*E ent�o adicionar os componentes na Vertical Box no\n exemplo foram usados dois Labels*/");
		exemploCodigo.append("\n box.getChildren().add(new Label(\"Info 1\"));\n box.getChildren().add(new Label(\"Info 2\"));");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("classe p�blica VBox\r\n" + 
				"estende o painel\r\n" + 
				"\r\n" + 
				"VBox coloca seus filhos em uma �nica coluna vertical. Se o vbox tiver um conjunto "
				+ "\nde borda e / ou preenchimento, o conte�do ser� colocado dentro desses inser��es.\r\n" + 
				"\r\n" + 
				"O VBox redimensionar� os filhos (se redimension�veis) para suas alturas preferidas e usar� "
				+ "\nsua propriedade fillWidth para determinar se redimensionar suas larguras para preencher "
				+ "\nsua pr�pria largura ou manter suas larguras em seus preferenciais (fillWidth assume como true). "
				+ "\nO alinhamento do conte�do � controlado pela propriedade de alinhamento, cujo padr�o � Pos.TOP_LEFT.\r\n" + 
				"\r\n" + 
				"Se um vbox for redimensionado maior que sua altura preferida, por padr�o, ele manter� as crian�as "
				+ "\nem suas alturas preferidas, deixando o espa�o extra n�o utilizado. Se um aplicativo desejar "
				+ "\nque um ou mais filhos sejam alocados nesse espa�o extra, ele pode opcionalmente definir uma "
				+ "\nrestri��o de vgrow no filho. Consulte \"Restri��es de layout opcionais\" para detalhes.");
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
