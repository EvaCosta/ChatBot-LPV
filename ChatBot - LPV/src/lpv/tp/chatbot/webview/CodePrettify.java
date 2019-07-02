package lpv.tp.chatbot.webview;

import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.scene.web.WebView;

public abstract class CodePrettify  {

	public static void updateCode(WebView webView, String code) {
		if (code != null) {
			if (webView.getEngine().getLoadWorker().getState() == State.SUCCEEDED)
				webView.getEngine().executeScript("setCode('" + code + "')");
			else {
				webView.getEngine().getLoadWorker().stateProperty().addListener(
						  (ObservableValue<? extends Worker.State> observable,
						    Worker.State oldValue,
						    Worker.State newValue) ->
						  {
						    if( newValue != Worker.State.SUCCEEDED ) {
						      return;
						    }

						    webView.getEngine().executeScript("setCode('" + code + "')");
						  } );
			}
		}
	}

	public static void loadWebView(WebView webView) {
		_loadWebView(webView, null);
	}

	public static void loadWebView(WebView webView, String code) {
		_loadWebView(webView, code);
	}

	private static void _loadWebView(WebView webView, String code) {
		if (webView == null)
			throw new NullPointerException("O WebView não pode ser null");

		webView.getEngine().load("file:///" + System.getProperty("user.dir") + "\\webview-source\\index.html");

		updateCode(webView, code);
	}
}
