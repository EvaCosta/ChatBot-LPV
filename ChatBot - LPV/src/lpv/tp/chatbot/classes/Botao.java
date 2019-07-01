package lpv.tp.chatbot.classes;

public class Botao extends ConteudoPesquisado {

	public Botao() {
		super();
		this.setDescricaoComponente("Button");
		this.setIdPaneExibicaoImagem("");
	}

	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx Button.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append(" Button meuButton = new Button(); /*Cria o bot�o*/");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/* Faremos um bot�o que seria utilizado para enviar dados de um formul�rio\n* Sendo assim definimos o texto do bot�o como \"Enviar\"\n*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("meuButton.setText(\"Enviar\")");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*O bot�o pode disparar um evento de clique o tratamento pode ser feito da seguinte forma");
		exemploCodigo.append("\n");
		exemploCodigo.append("meuButton.setOnAction(new EventHandler<ActionEvent>() {\n");
		exemploCodigo.append("	@Override\n	public void handle(ActionEvent event) {\n");
		exemploCodigo.append("		/*Aqui vai o c�digo da fun��o que deve ser executada*/\n	}\n});");
		return exemploCodigo.toString();
	}//toString()
}
