package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

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
		return new Label(new StringBuilder("O ImageView � um Node (classe base) usado para pintar imagens carregadas "
				+ "com a classe Image.").append(
				 "Esta classe permite redimensionar a imagem (com ou sem a preserva��o da propor��o original) e "
				 + "especificar uma janela de visualiza��o na imagem de origem para restringir os pixels")
				.append(" exibidos por este ImageView.").toString());
	}

	@Override
	public Node componente() {
		Label label = new Label("Veja, sou eu!");
		label.setStyle("-fx-text-fill: #000");
		ImageView minhaImagem = new ImageView("file:///" + System.getProperty("user.dir") + "\\img\\bot.png");
		minhaImagem.setPreserveRatio(true);
		return new VBox(minhaImagem, label);
	}
}//class Imagem 
