package lpv.tp.chatbot.classes;

public class AreaTexto extends ConteudoPesquisado{

	public AreaTexto() {
		super();
		this.setDescricaoComponente("TextArea");
		this.setIdPaneExibicaoImagem("");
	}

	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder();
		conteudo.append("\n");
		conteudo.append("/*\n* Exemplo de como criar um componente JavaFx TextArea.\n*/");
		conteudo.append("\n");
		conteudo.append("TextArea meuTextArea = new TextArea(); /*Você deve dar um nome ao seu componente e inicia-lo.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Aqui você definira o texto que aparecerá dentro do seu componente.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextArea.setText(\"Conteúdo que eu quero exibir em meuTextArea\");");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Você pode permitir que o usuário do seu programa edite o conteúdo de seu componente TextArea ou não.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextArea.setEditable(true); /*Caso não queira permitir a edição troque o true por false.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Você pode obter o conteúdo dentro do seu TextArea, este método retorna um java.lang.String.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextArea.getText(); /*Você pode armazer o conteúdo em um objeto e manipular seu conteúdo.*/");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString()

}//class AreaTexto
