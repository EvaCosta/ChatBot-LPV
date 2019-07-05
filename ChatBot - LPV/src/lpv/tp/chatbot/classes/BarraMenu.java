package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class BarraMenu extends ComponentePesquisado {	
	
	public BarraMenu(){
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("/*Cria a MenuBar*/\n MenuBar minhaMenuBar = new MenuBar();");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*A MenuBar está vazia então temos que adicionar um Menu a ela*/");
		exemploCodigo.append("\n minhaMenuBar.getMenus().add(new Menu(\"Arquivo\"));");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Agora que temos o Menu vamos adicionar a ele um MenuItem*/");
		exemploCodigo.append("\n minhaMenuBar.getMenus().get(0).getItems().add(new MenuItem(\"Fechar\"));");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/* O processo se repete para acrescentar mais Menus e MenusItems \n devendo apenas ter atenção na função getMenus().get(index) qual \n é o Menu que receberá o MenuItem*/");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("Um controle MenuBar tradicionalmente é colocado no topo da interface do usuário, \n"
				+ "e incorporado a ele são Menus. Para adicionar um menu a uma barra de menus, adicione-o aos \n"
				+ "menus ObservableList. Por padrão, para cada menu adicionado à barra de menus, ele será \n"
				+ "representado como um botão com o valor do texto do menu exibido.");
	}


	@Override
	public Node componente() {
		MenuBar minhaMenuBar = new MenuBar();
		minhaMenuBar.getMenus().add(new Menu("Arquivo"));
		minhaMenuBar.getMenus().get(0).setStyle(".-fx-text-fill: black");
		minhaMenuBar.setStyle("-fx-text-fill: black");
		minhaMenuBar.getMenus().get(0).getItems().add(new MenuItem("Fechar"));
		minhaMenuBar.applyCss();
		return minhaMenuBar;
	}
}
