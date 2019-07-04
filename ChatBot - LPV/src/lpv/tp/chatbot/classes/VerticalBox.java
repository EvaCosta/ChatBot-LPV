package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

public class VerticalBox extends ComponentePesquisado {

	public VerticalBox(){
		super();
	}

	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx VBox para organização vertical de componentes na interface gráfica.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" VBox box = new VBox(); /*Cria a Vertical Box*/");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Pode ser estabelecido um espaçamento entre os componentes da Vertical Box*/");
		exemploCodigo.append("\nbox.setSpacing(5);");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Pode ser estabelecido também a posição da Vertical Box dentro de seu conteiner*/");
		exemploCodigo.append("\nbox.setLayoutX(10);\nbox.setLayoutY(10);");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*E então adicionar os componentes na Vertical Box no exemplo foram usados dois Labels*/");
		exemploCodigo.append("\nbox.getChildren().add(new Label(\"Info 1\"));\nbox.getChildren().add(new Label(\"Info 2\"));");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebView exemplo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node componente() {
		// TODO Auto-generated method stub
		return null;
	}
}
