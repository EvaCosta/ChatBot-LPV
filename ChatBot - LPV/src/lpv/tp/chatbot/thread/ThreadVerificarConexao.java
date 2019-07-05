package lpv.tp.chatbot.thread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

import javafx.application.Platform;
import lpv.tp.chatbot.controller.ChatBotController;

public class ThreadVerificarConexao extends Thread{
	private ChatBotController controller;

	public ThreadVerificarConexao(ChatBotController controller) {
		super("Thread Verificar Conex�o");
		this.controller = controller;

		setDaemon(true);
	}

	public void run() {
		while(true){
			try {

				final URL url = new URL("http://www.google.com");
				final URLConnection conn = url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.254", 8080)));

				conn.setReadTimeout(4000);
				conn.setConnectTimeout(4000);

				conn.connect();
				conn.getInputStream().close();
				msgConectado();
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
			} catch (IOException e) {
				msgSemConexao();
			}

			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void msgSemConexao() {
		Platform.runLater(() -> {
			controller.exibirProblemaConexao();
			controller.setConectado(false);
		});
	}

	private void msgConectado() {
		Platform.runLater(() -> {
			controller.exibirConexaoAtiva();
			controller.setConectado(true);
		});
	}



}
