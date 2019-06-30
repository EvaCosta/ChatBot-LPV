package lpv.tp.chatbot.classes;

/**
 * Ensina ao usu�rio como criar um componente ImageView
 * @author Daniel Soares Ferreira
 *
 */
public class Imagem extends ConteudoPesquisado{

	public Imagem() {
		super();
		this.setDescricaoComponente("ImageView");
		this.setIdPaneExibicaoImagem("");
	}

	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder();
		
		conteudo.append("\n");
		conteudo.append("/*Exemplo de como criar um componente JavaFx ImageView.*/");
		conteudo.append("\n");
		conteudo.append("ImageView minhaImagem = new ImageView(); /*Voc� deve dar um nome ao objeto imagem e inicia-lo.*/");
		conteudo.append("\n\n");
		conteudo.append("/*Define sua image como n�o redimension�vel em caso de true e redimension�vel em caso de false*/");
		conteudo.append("\n");
		conteudo.append("minhaImagem.setPreserveRatio(true);");
		conteudo.append("\n\n");
		conteudo.append("/*Voc� deve especificar o caminho onde sua imagem que ser� exibida esta armazenada como um objeto String.*/");
		conteudo.append("\n");
		conteudo.append("minhaImagem.getClass().getResourceAsStream(\"caminho onde esta armazenada a imagem\");");
		conteudo.append("\n\n");
		
		return conteudo.toString();
	}//toString

	
	
	
}//class Imagem 
