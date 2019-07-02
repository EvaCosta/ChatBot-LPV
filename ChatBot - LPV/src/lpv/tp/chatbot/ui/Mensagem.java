package lpv.tp.chatbot.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import lpv.tp.chatbot.controller.ChatBotController;

public class Mensagem extends VBox {
	public enum TipoMensagem{
		PERGUNTA, RESPOSTA
	}

	private Color cor;
	private HBox pane = new HBox();
	private TipoMensagem tipoMensagem;

	public Mensagem(TipoMensagem tipoMensagem){
		getChildren().add(pane);
		setFillWidth(false);
		this.tipoMensagem = tipoMensagem;
		if(tipoMensagem == TipoMensagem.PERGUNTA){
			cor = Color.rgb(179, 229, 252);
			setAlignment(Pos.CENTER_RIGHT);
			setMargin(pane, new Insets(10, 10, 0, 0));
			pane.setStyle("-fx-background-color: rgb(179, 229, 252)");
		}else if(tipoMensagem == TipoMensagem.RESPOSTA){
			cor = Color.rgb(240, 244, 195);
			setAlignment(Pos.CENTER_LEFT);
			setMargin(pane, new Insets(10, 0, 0, 10));
			pane.setStyle("-fx-background-color: rgb(240, 244, 195)");

		}
		pane.applyCss();

	}

	public Mensagem(TipoMensagem tipoMensagem, Node node){
		this(tipoMensagem);
		adicionarConteudo(node);
	}

	public TipoMensagem getTipoMensagem() {
		return tipoMensagem;
	}

	public Color getCor() {
		return cor;
	}

	public void adicionarConteudo(Node conteudo){
		pane.getChildren().add(conteudo);
		pane.setPadding(new Insets(10,10,10,10));
		pane.setMaxWidth(ChatBotController.getChatPaneWidth()/2);

		setMargin(conteudo, new Insets(0,0,0,10));


		if(conteudo instanceof Label)((Label)conteudo).setWrapText(true);
		ChatBotController.getMainScene().getWindow().widthProperty().addListener((obs, oldVal, newVal) -> {
			pane.setMaxWidth((double) newVal/2);
		});

	}

}
