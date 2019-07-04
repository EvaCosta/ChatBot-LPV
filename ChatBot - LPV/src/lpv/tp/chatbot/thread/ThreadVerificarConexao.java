package lpv.tp.chatbot.thread;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javafx.application.Platform;
import lpv.tp.chatbot.controller.ChatBotController;

public class ThreadVerificarConexao extends Thread{
	private ChatBotController controller;

	public ThreadVerificarConexao(ChatBotController controller) {
		super("Thread Verificar Conexão");
		this.controller = controller;

		setDaemon(true);
	}

	public void run() {
		while(true){
			try {

				final URL url = new URL("http://www.google.com");
				final URLConnection conn = url.openConnection();
				
				conn.setReadTimeout(2000);
				conn.setConnectTimeout(2000);
				
				conn.connect();
				conn.getInputStream().close();
				msgConectado();
			} catch (MalformedURLException e) {
				System.err.println(e);
				throw new RuntimeException(e);
			} catch (IOException e) {
				System.err.println(e);
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
		
		
		System.err.println("Desconectado");
	}

	private void msgConectado() {
		Platform.runLater(() -> {
			
			controller.exibirConexaoAtiva();
			controller.setConectado(true);
		});
		
		
		
		System.err.println("Conectado");
	}



}
