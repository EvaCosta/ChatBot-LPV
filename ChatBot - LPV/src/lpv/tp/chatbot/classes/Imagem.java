package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * Ensina ao usu�rio como criar um componente ImageView
 * @author Daniel Soares Ferreira
 *
 */
public class Imagem extends ComponentePesquisado{

	public Imagem() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder();
		
		conteudo.append("\n");
		conteudo.append("/*Exemplo de como criar um componente JavaFx ImageView.*/");
		conteudo.append("\n");
		conteudo.append("/*Voc� deve dar um nome ao objeto imagem e inicia-lo, especificando o caminho de sua imagem que ser� exibida.*/\n"
				+ "ImageView minhaImagem = new ImageView(getClass().getResource(\"CAMINHO_DA_IMAGEM\").toString());");
		conteudo.append("\n");
		conteudo.append("/*Define sua image como n�o redimension�vel em caso \n*de true e redimension�vel em caso de false*/");
		conteudo.append("\n");
		conteudo.append(" minhaImagem.setPreserveRatio(true);");
		conteudo.append("\n");
		
		return conteudo.toString();
	}//toString

	@Override
	public Label descricao() {
		return new Label("classe p�blica Image\r\n" + 
				"estende o objeto\r\n" + 
				"\r\n" + 
				"A classe Image representa imagens gr�ficas e � usada para "
				+ "\ncarregar imagens de um URL especificado.\r\n" + 
				"\r\n" + 
				"Formatos de imagem suportados s�o:\r\n" + 
				"\r\n" + 
				"    BMP\r\n" + 
				"    GIF\r\n" + 
				"    JPEG\r\n" + 
				"    PNG\r\n" + 
				"\r\n" + 
				"As imagens podem ser redimensionadas � medida que s�o carregadas "
				+ "\n(por exemplo, para reduzir a quantidade de mem�ria consumida pela imagem). "
				+ "\nO aplicativo pode especificar a qualidade da filtragem usada ao dimensionar "
				+ "\ne preservar ou n�o a propor��o da imagem original.\r\n" + 
				"\r\n" + 
				"Todas as URLs suportadas pela URL podem ser passadas para o construtor. "
				+ "\nSe a sequ�ncia passada n�o for uma URL v�lida, mas sim um caminho, a Imagem ser� pesquisada no caminho de classe nesse caso.\r\n" + 
				"\r\n" + 
				"Use o ImageView para exibir imagens carregadas com esta classe. "
				+ "\nA mesma inst�ncia de imagem pode ser exibida por v�rios ImageViews.");
	}

	@Override
	public Node componente() {
		ImageView minhaImagem = new ImageView("file:///" + System.getProperty("user.dir") + "\\img\\bot.png");
		minhaImagem.setPreserveRatio(true);
		return minhaImagem;
	}
}//class Imagem 
