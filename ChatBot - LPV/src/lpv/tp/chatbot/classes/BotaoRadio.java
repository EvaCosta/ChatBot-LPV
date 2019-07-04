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
		exemploCodigo.append("/*Cria o bot�o r�dio*/\nRadioButton meuRadioButton = new RadioButton();");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Faremos um bot�o r�dio com o texto \"Concordo com os termos de uso\"*/");
		exemploCodigo.append("\nmeuRadioButton.setText(\"Concordo com os termos de uso\");");
		exemploCodigo.append("\n");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("RadioButtons cria uma s�rie de itens onde apenas um item pode ser selecionado. "
				+ "\nOs RadioButtons s�o um ToggleButton especializado. Quando um RadioButton � pressionado e "
				+ "\nliberado, um ActionEvent � enviado. Seu aplicativo pode executar alguma a��o com base nesse "
				+ "\nevento, implementando um EventHandler para processar o ActionEvent.\r\n" + 
				"\r\n" + 
				"Apenas um RadioButton pode ser selecionado quando colocado em um ToggleGroup. Clicar em um RadioButton \n"
				+ "selecionado n�o ter� efeito. Um RadioButton que n�o est� em um ToggleGroup pode ser selecionado e "
				+ "\ndesmarcado. Por padr�o, um RadioButton n�o est� em um ToggleGroup. Chamar ToggleGroup.getSelectedToggle () "
				+ "\nretornar� o RadioButton que foi selecionado.");
	}

	@Override
	public Node componente() {
		RadioButton meuRadioButton = new RadioButton();
		meuRadioButton.setText("Concordo com os termos de uso");
		return meuRadioButton;
	}
	
	
}
