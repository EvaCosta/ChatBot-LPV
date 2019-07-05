package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Button;
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
		exemploCodigo.append("\n box.getChildren().add(new Label(\"Item 1: Label 1\"));\n "
				+ "box.getChildren().add(new Label(\"Item 2: Label 2\"));"
				+ "\\n box.getChildren().add(new Button(\\\"Item 3: Button 1\\\"));");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("VBox  � um pain�l que que permite inserir outros Nodes (compoentes filhos) "
				+ "em uma �nica coluna vertical. "
				+ "Se um vbox for redimensionado maior que sua altura preferencias  (pref height), por padr�o, ele manter� os n�s filhos "
				+ "\nem suas alturas preferencias, deixando o espa�o extra n�o utilizado. Se um programa desejar "
				+ "\nque um ou mais filhos sejam alocados nesse espa�o extra, ele pode opcionalmente definir uma "
				+ "\nrestri��o de vgrow (crescimento vertical) nos n�s filhos.\n"
				+ "Consulte \"Restri��es de layout opcionais\" para detalhes.");
	}

	@Override
	public Node componente() {
		VBox box = new VBox();
		box.setSpacing(5);
		box.setLayoutX(10);
		box.setLayoutY(10);
		box.getChildren().add(new Label("Item 1: Label 1"));
		box.getChildren().add(new Label("Item 2: Label 2"));
		box.getChildren().add(new Button("Item 3: Button 1"));
		return box;
	}
}
