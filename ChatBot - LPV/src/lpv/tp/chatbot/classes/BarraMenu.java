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
		exemploCodigo.append("/*A MenuBar est� vazia ent�o temos que adicionar um Menu a ela*/");
		exemploCodigo.append("\n minhaMenuBar.getMenus().add(new Menu(\"Arquivo\"));");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Agora que temos o Menu vamos adicionar a ele um MenuItem*/");
		exemploCodigo.append("\n minhaMenuBar.getMenus().get(0).getItems().add(new MenuItem(\"Fechar\"));");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/* O processo se repete para acrescentar mais Menus e MenusItems \n devendo apenas ter aten��o na fun��o getMenus().get(index) qual \n � o Menu que receber� o MenuItem*/");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("Um controle MenuBar tradicionalmente � colocado no topo da interface do usu�rio, \n"
				+ "e incorporado a ele s�o Menus. Para adicionar um menu a uma barra de menus, adicione-o aos \n"
				+ "menus ObservableList. Por padr�o, para cada menu adicionado � barra de menus, ele ser� \n"
				+ "representado como um bot�o com o valor do texto do menu exibido.");
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
