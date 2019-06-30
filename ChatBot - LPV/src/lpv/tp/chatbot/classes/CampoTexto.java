package lpv.tp.chatbot.classes;

public class CampoTexto extends ConteudoPesquisado{

	public CampoTexto() {
		super();
		this.setDescricaoComponente("TextField");
		this.setIdPaneExibicaoImagem("");
	}

	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder();
		conteudo.append("\n");
		conteudo.append("/*\n* Exemplo de como criar um componente JavaFx TextField.\n*/");
		conteudo.append("\n");
		conteudo.append("TextField meuTextField = new TextField(); /*Você deve dar um nome ao seu componente e inicia-lo.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Aqui você definira o texto que aparecerá dentro do seu componente.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextField.setText(\"Conteúdo que eu quero exibir em meuTextField\");");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Você pode permitir que o usuário do seu programa edite o conteúdo de seu componente TextField ou não.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextField.setEditable(true); /*Caso não queira permitir a edição troque o true por false.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Você pode obter o conteúdo dentro do seu TextFiel, este método retorna um java.lang.String.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextField.getText(); /*Você pode armazer o conteúdo em um objeto e manipular seu conteúdo.*/");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString()

}//class CampoTexto
