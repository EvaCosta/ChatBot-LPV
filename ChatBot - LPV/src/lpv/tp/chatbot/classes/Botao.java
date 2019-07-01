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
		exemploCodigo.append(" Button meuButton = new Button(); /*Cria o botão*/");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/* Faremos um botão que seria utilizado para enviar dados de um formulário\n* Sendo assim definimos o texto do botão como \"Enviar\"\n*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("meuButton.setText(\"Enviar\")");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*O botão pode disparar um evento de clique o tratamento pode ser feito da seguinte forma");
		exemploCodigo.append("\n");
		exemploCodigo.append("meuButton.setOnAction(new EventHandler<ActionEvent>() {\n");
		exemploCodigo.append("	@Override\n	public void handle(ActionEvent event) {\n");
		exemploCodigo.append("		/*Aqui vai o código da função que deve ser executada*/\n	}\n});");
		return exemploCodigo.toString();
	}//toString()
}
