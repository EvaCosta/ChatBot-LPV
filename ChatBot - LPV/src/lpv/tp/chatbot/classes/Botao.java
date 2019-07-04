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
		return new Label("classe pública Button\r\n" + 
				"estende o ButtonBase\r\n" + 
				"\r\n" + 
				"Um simples controle de botão. O controle de botão pode conter texto e / ou gráfico. Um botão de controle tem três modos diferentes\r\n" + 
				"\r\n" + 
				"     Normal: um botão normal.\r\n" + 
				"     Padrão: Um botão padrão é o botão que recebe um teclado VK_ENTER, se nenhum outro nó na cena o consumir.\r\n" + 
				"     Cancelar: Um botão Cancelar é o botão que recebe um teclado VK_ESC, se nenhum outro nó na cena o consumir.\r\n" + 
				"\r\n" + 
				"Quando um botão é pressionado e liberado, um ActionEvent é enviado. Seu aplicativo pode executar alguma ação com base nesse evento, implementando um EventHandler para processar o ActionEvent. Os botões também podem responder a eventos de mouse implementando um EventHandler para processar o MouseEvent\r\n" + 
				"\r\n" + 
				"MnemonicParsing está habilitado por padrão para Button.");
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
		exemploCodigo.append("/*O botão pode disparar um evento de clique o tratamento pode ser feito da seguinte forma*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("meuButton.setOnAction(new EventHandler<ActionEvent>() {\n");
		exemploCodigo.append("	@Override\n	public void handle(ActionEvent event) {\n");
		exemploCodigo.append("		/*Aqui vai o código da função que deve ser executada*/\n	}\n});");
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
