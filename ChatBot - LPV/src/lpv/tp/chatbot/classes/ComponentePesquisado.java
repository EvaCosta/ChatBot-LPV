package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;
import lpv.tp.chatbot.webview.CodePrettify;

public abstract class ComponentePesquisado{

	public abstract Label descricao();
	
	public WebView exemplo() {
		WebView webView = new WebView();
		
		CodePrettify.loadWebView(webView, this.toString().replace("\n", "<br />"));
		
		webView.setMaxHeight(200);
	
		
		return webView;
	}
	public abstract Node componente();
	
}//class ConteudoPesquisado 
