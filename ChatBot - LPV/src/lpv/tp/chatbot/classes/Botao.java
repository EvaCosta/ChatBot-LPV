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
				"Um simples componente de botão. Um botão pode conter texto e / ou gráfico (imagem)."
				+ "Ele pode ter três modos diferentes\r\n" + 
				"\r\n" + 
				"     Normal:   um botão normal.\r\n" + 
				"     Padrão:   um botão que recebe um evento de teclado VK_ENTER (tecla ENTER).\r\n" + 
				"     Cancelar: um botão recebe um teclado VK_ESC (tecla ESC).\r\n" + 
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
		exemploCodigo.append("/* Faremos um botão com o texto \"Clique aqui!\" \n*/");
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
