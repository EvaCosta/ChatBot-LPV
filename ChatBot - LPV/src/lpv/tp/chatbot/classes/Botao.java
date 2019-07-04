package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;
import lpv.tp.chatbot.webview.CodePrettify;

public class Botao extends ComponentePesquisado {

	public Botao() {
		super();
	}
	
	@Override
	public Label descricao() {
		return new Label("classe p�blica Button\r\n" + 
				"estende o ButtonBase\r\n" + 
				"\r\n" + 
				"Um simples controle de bot�o. O controle de bot�o pode conter texto e / ou gr�fico. Um bot�o de controle tem tr�s modos diferentes\r\n" + 
				"\r\n" + 
				"     Normal: um bot�o normal.\r\n" + 
				"     Padr�o: Um bot�o padr�o � o bot�o que recebe um teclado VK_ENTER, se nenhum outro n� na cena o consumir.\r\n" + 
				"     Cancelar: Um bot�o Cancelar � o bot�o que recebe um teclado VK_ESC, se nenhum outro n� na cena o consumir.\r\n" + 
				"\r\n" + 
				"Quando um bot�o � pressionado e liberado, um ActionEvent � enviado. Seu aplicativo pode executar alguma a��o com base nesse evento, implementando um EventHandler para processar o ActionEvent. Os bot�es tamb�m podem responder a eventos de mouse implementando um EventHandler para processar o MouseEvent\r\n" + 
				"\r\n" + 
				"MnemonicParsing est� habilitado por padr�o para Button.");
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
		exemploCodigo.append("/*O bot�o pode disparar um evento de clique o tratamento pode ser feito da seguinte forma*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("meuButton.setOnAction(new EventHandler<ActionEvent>() {\n");
		exemploCodigo.append("	@Override\n	public void handle(ActionEvent event) {\n");
		exemploCodigo.append("		/*Aqui vai o c�digo da fun��o que deve ser executada*/\n	}\n});");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public WebView exemplo() {
		WebView webView = new WebView();
		
		CodePrettify.loadWebView(webView, this.toString().replace("\n", "<br />"));
		
		webView.setMaxHeight(300);
	
		
		return webView;
	}

	@Override
	public Node componente() {
		return new Button("Clique aqui!");
	}
}
