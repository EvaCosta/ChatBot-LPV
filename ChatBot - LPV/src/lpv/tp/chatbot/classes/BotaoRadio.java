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
		exemploCodigo.append("/*Criando botões de rádio*/\nRadioButton radioButton1 = new RadioButton();"
				+ "\nRadioButton radioButton2 = new RadioButton();");
		exemploCodigo.append("\n\n");
		exemploCodigo.append("/*Definido o texto dos botões*/");
		exemploCodigo.append("\nradioButton1.setText(\"Janela\");");
		exemploCodigo.append("\nradioButton2.setText(\"Tela inteira\");");
		exemploCodigo.append("\n\n/*Criando um grupo de botões para que apenas um fique selecionado*/\n"
				+ "ToggleGroup toggleGroup = new ToggleGroup();\n"
				+ "radioButton1.setToggleGroup(toggleGroup);\n"
				+ "radioButton2.setToggleGroup(toggleGroup);\n\n/*Escolhendo um dos botões do grupo para"
				+ " ficar selecionado primeiro*/\nradioButton1.setSelected(true);");
		
		exemploCodigo.append("\n");
		return exemploCodigo.toString();
	}//toString()

	@Override
	public Label descricao() {
		return new Label("RadioButtons criam uma série de itens onde apenas um item pode ser selecionado. "
				+ "Os RadioButtons são especializações dos ToggleButtons. Quando um RadioButton é pressionado e liberado,"
				+ " um ActionEvent é enviado. Seu programa pode executar alguma ação com base nesse evento, implementando"
				+ " um EventHandler para processar o ActionEvent.\n\n" +
				
				"Apenas um RadioButton pode ser selecionado quando colocado em um ToggleGroup. Clicar em um RadioButton"
				+ "selecionado não terá efeito. Um RadioButton que não está em um ToggleGroup pode ser selecionado e "
				+ "desmarcado. Por padrão, um RadioButton não está em um ToggleGroup. Chamar ToggleGroup.getSelectedToggle() "
				+ "retornará o RadioButton que foi selecionado.");
	}

	@Override
	public Node componente() {
		RadioButton radioButton1 = new RadioButton(), radioButton2 = new RadioButton();;
		Label label = new Label("Modo de exibição: ");
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
