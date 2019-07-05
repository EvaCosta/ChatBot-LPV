package lpv.tp.chatbot.classes;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class BotaoDeAlternancia extends ComponentePesquisado{

	public BotaoDeAlternancia() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder();
		conteudo.append("\n");
		conteudo.append("/*\n* Exemplo de como criar um componente JavaFx ToggleButton.\n*/");
		conteudo.append("\n");
		conteudo.append("\nToggleButton tb1 = new ToggleButton(\"Toggle Button 1\");");
		conteudo.append("\n\n");
		conteudo.append("ToggleButton tb2 = new ToggleButton(\"Toggle Button 2\");");
		conteudo.append("\n\n");
		conteudo.append("\nToggleButton tb3 = new ToggleButton(\"Toggle Button 3\");");
		conteudo.append("\n");
		conteudo.append("ToggleGroup group = new ToggleGroup();");
		conteudo.append("\n\n");
		conteudo.append("tb1.setToggleGroup(group);");
		conteudo.append("\n\n");
		conteudo.append("tb2.setToggleGroup(group);");
		conteudo.append("\n");
		conteudo.append("tb3.setToggleGroup(group);");
		conteudo.append("\n");
		return conteudo.toString();
	}//toString

	@Override
	public Label descricao() {
		return new Label(
						 "Um ToggleButton é como um botão especial que tem a capacidade de ser selecionado "
						 + "sendo normalmente, de forma semelhante a eles (botões). "
						 + "No entanto, um botão realiza um comando, invoca uma função quando clicado. "
						 + "Já um ToggleButton, por outro lado, é simplesmente um controle com um booleano, "
						 + "indicando se ele foi selecionado.");
	}

	@Override
	public Node componente() {
		ToggleButton tb1 = new ToggleButton("Toggle Button 1");
		ToggleButton tb2 = new ToggleButton("Toggle Button 2");
		ToggleButton tb3 = new ToggleButton("Toggle Button 3");
		
		ToggleGroup tg = new ToggleGroup();
		
		tb1.setToggleGroup(tg);
		tb2.setToggleGroup(tg);
		tb3.setToggleGroup(tg);
	
		return new HBox(tb1, tb2, tb3);
	}

}//class CaixaDeSelecao 
