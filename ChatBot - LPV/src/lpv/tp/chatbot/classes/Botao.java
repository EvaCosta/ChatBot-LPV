package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Botao extends ComponentePesquisado {

	public Botao() {
		super();
	}
	
	@Override
	public Label descricao() {
		return new Label(
				"Um simples componente de bot�o. Um bot�o pode conter texto e / ou gr�fico (imagem)."
				+ "Ele pode ter tr�s modos diferentes\r\n" + 
				"\r\n" + 
				"     Normal:   um bot�o normal.\r\n" + 
				"     Padr�o:   um bot�o que recebe um evento de teclado VK_ENTER (tecla ENTER).\r\n" + 
				"     Cancelar: um bot�o recebe um teclado VK_ESC (tecla ESC).\r\n" + 
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
		exemploCodigo.append("/* Faremos um bot�o com o texto \"Clique aqui!\" \n*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("meuButton.setText(\"Clique aqui!\")");
		exemploCodigo.append("\n");
		return exemploCodigo.toString();
	}//toString()


	@Override
	public Node componente() {
		return new Button("Clique aqui!");
	}
}
