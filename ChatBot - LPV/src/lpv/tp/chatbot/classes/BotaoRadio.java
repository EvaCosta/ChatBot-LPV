package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class BotaoRadio extends ComponentePesquisado {
	
	public BotaoRadio(){
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx RadioButton.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Cria o botão rádio*/\nRadioButton meuRadioButton = new RadioButton();");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Faremos um botão rádio com o texto \"Concordo com os termos de uso\"*/");
		exemploCodigo.append("\nmeuRadioButton.setText(\"Concordo com os termos de uso\");");
		exemploCodigo.append("\n");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("RadioButtons cria uma série de itens onde apenas um item pode ser selecionado. "
				+ "\nOs RadioButtons são um ToggleButton especializado. Quando um RadioButton é pressionado e "
				+ "\nliberado, um ActionEvent é enviado. Seu aplicativo pode executar alguma ação com base nesse "
				+ "\nevento, implementando um EventHandler para processar o ActionEvent.\r\n" + 
				"\r\n" + 
				"Apenas um RadioButton pode ser selecionado quando colocado em um ToggleGroup. Clicar em um RadioButton \n"
				+ "selecionado não terá efeito. Um RadioButton que não está em um ToggleGroup pode ser selecionado e "
				+ "\ndesmarcado. Por padrão, um RadioButton não está em um ToggleGroup. Chamar ToggleGroup.getSelectedToggle () "
				+ "\nretornará o RadioButton que foi selecionado.");
	}

	@Override
	public Node componente() {
		RadioButton meuRadioButton = new RadioButton();
		meuRadioButton.setText("Concordo com os termos de uso");
		return meuRadioButton;
	}
	
	
}
