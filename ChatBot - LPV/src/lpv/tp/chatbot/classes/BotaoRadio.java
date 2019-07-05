package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class BotaoRadio extends ComponentePesquisado {
	
	public BotaoRadio(){
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder exemploCodigo = new StringBuilder();
		exemploCodigo.append("/*Exemplo de como criar um componente JavaFx RadioButton.*/");
		exemploCodigo.append("\n");
		exemploCodigo.append("/*Criando bot�es de r�dio*/\nRadioButton radioButton1 = new RadioButton();"
				+ "\nRadioButton radioButton2 = new RadioButton();");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Definido o texto dos bot�es*/");
		exemploCodigo.append("\nradioButton1.setText(\"Janela\");");
		exemploCodigo.append("\nradioButton2.setText(\"Tela inteira\");");
		exemploCodigo.append("\n\n/*Criando um grupo de bot�es para que apenas um fique selecionado*/\n"
				+ "ToggleGroup toggleGroup = new ToggleGroup();\n"
				+ "radioButton1.setToggleGroup(toggleGroup);\n"
				+ "radioButton2.setToggleGroup(toggleGroup);\n\n/*Escolhendo um dos bot�es do grupo para"
				+ " ficar selecionado primeiro*/\nradioButton1.setSelected(true);");
		
		exemploCodigo.append("\n");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("RadioButtons criam uma s�rie de itens onde apenas um item pode ser selecionado. "
				+ "Os RadioButtons s�o especializa��es dos ToggleButtons. Quando um RadioButton � pressionado e liberado,"
				+ " um ActionEvent � enviado. Seu programa pode executar alguma a��o com base nesse evento, implementando"
				+ " um EventHandler para processar o ActionEvent.\n\n" +
				
				"Apenas um RadioButton pode ser selecionado quando colocado em um ToggleGroup. Clicar em um RadioButton"
				+ "selecionado n�o ter� efeito. Um RadioButton que n�o est� em um ToggleGroup pode ser selecionado e "
				+ "desmarcado. Por padr�o, um RadioButton n�o est� em um ToggleGroup. Chamar ToggleGroup.getSelectedToggle() "
				+ "retornar� o RadioButton que foi selecionado.");
	}

	@Override
	public Node componente() {
		RadioButton radioButton1 = new RadioButton(), radioButton2 = new RadioButton();;
		Label label = new Label("Modo de exibi��o: ");
		label.setStyle("-fx-text-fill: #000");
		label.applyCss();
		radioButton1.setText("Janela ");
		radioButton2.setText("Tela inteira");
		radioButton1.setSelected(true);
		ToggleGroup toggleGroup = new ToggleGroup();
		radioButton1.setToggleGroup(toggleGroup);
		radioButton2.setToggleGroup(toggleGroup);
		
		return new HBox(label, radioButton1, radioButton2);
	}
	
	
}
