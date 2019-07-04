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
