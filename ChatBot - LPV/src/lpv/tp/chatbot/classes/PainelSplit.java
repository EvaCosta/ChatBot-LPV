package lpv.chatbot.classes;

public class PainelSplit extends ConteudoPesquisado {
	
	public PainelSplit(){
		super();
		this.setDescricaoComponente("SplitPane");
		this.setIdPaneExibicaoImagem("");
	}
	
	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx SplitPane.*/");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Cria o Painel Split*/\n");
		exemploCodigo.append(" SplitPane meuSplitPane = new SplitPane(new Label(\"Lado 1\"),new Label(\"Lado 2\"),new Label(\"Lado 3\"));");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*O construtor possui uma lista de parâmetros de tamanho vaiável \n* então a quantidade de componentes passadas para ele pode ter \n* o número necessário de acordo com a necessidade.\n*/");
		
		return exemploCodigo.toString();
	}//toString()
}
