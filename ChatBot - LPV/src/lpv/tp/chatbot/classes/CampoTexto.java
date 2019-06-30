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
		conteudo.append("TextField meuTextField = new TextField(); /*Voc� deve dar um nome ao seu componente e inicia-lo.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Aqui voc� definira o texto que aparecer� dentro do seu componente.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextField.setText(\"Conte�do que eu quero exibir em meuTextField\");");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Voc� pode permitir que o usu�rio do seu programa edite o conte�do de seu componente TextField ou n�o.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextField.setEditable(true); /*Caso n�o queira permitir a edi��o troque o true por false.*/");
		conteudo.append("\n\n");
		conteudo.append("/*\n* Voc� pode obter o conte�do dentro do seu TextFiel, este m�todo retorna um java.lang.String.\n*/");
		conteudo.append("\n");
		conteudo.append("meuTextField.getText(); /*Voc� pode armazer o conte�do em um objeto e manipular seu conte�do.*/");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString()

}//class CampoTexto
