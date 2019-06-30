package lpv.chatbot.classes;

public class BarraMenu extends ConteudoPesquisado {	
	
	public BarraMenu(){
		super();
		this.setDescricaoComponente("MenuBar");
		this.setIdPaneExibicaoImagem("");
	}
	
	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx MenuBar.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Cria a MenuBar*/\n MenuBar minhaMenuBar = new MenuBar();");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*A MenuBar está vazia então temos que adicionar um Menu a ela*/");
		exemploCodigo.append("\nminhaMenuBar.getMenus().add(new Menu(\"Arquivo\"));");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Agora que temos o Menu vamos adicionar a ele um MenuItem*/");
		exemploCodigo.append("\nminhaMenuBar.getMenus().get(0).getItems().add(new MenuItem(\"Fechar\"));");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/* O processo se repete para acrescentar mais Menus e MenusItems devendo \n* apenas ter atenção na função getMenus().get(index) qual é o Menu que receberá o MenuItem\n*/");
		return exemploCodigo.toString();
	}//toString()
}
