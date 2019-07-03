package lpv.tp.chatbot.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import lpv.tp.chatbot.controller.ChatBotController;

public class Mensagem extends VBox {
	public enum TipoMensagem{
		PERGUNTA, RESPOSTA
	}

	private Color cor;
	private VBox pane = new VBox();
	private TipoMensagem tipoMensagem;
	private Accordion accordion;

	public Mensagem(TipoMensagem tipoMensagem){
		this.tipoMensagem = tipoMensagem;
		estilizarCSS(tipoMensagem);
	}

	private void estilizarCSS(TipoMensagem tipoMensagem) {
		getChildren().add(pane);
		setFillWidth(false);
		
		if(tipoMensagem == TipoMensagem.PERGUNTA){
			cor = Color.rgb(179, 229, 252);
			setAlignment(Pos.CENTER_RIGHT);
			setMargin(pane, new Insets(10, 10, 0, 0));
			pane.setStyle("-fx-background-color: rgb(0, 188, 212)");
		}else if(tipoMensagem == TipoMensagem.RESPOSTA){
			cor = Color.rgb(240, 244, 195);
			setAlignment(Pos.CENTER_LEFT);
			setMargin(pane, new Insets(10, 0, 0, 10));
			pane.setStyle("-fx-background-color: rgb(123,104,238)");

		}
		pane.applyCss();

	}

	public Mensagem(TipoMensagem tipoMensagem, Node conteudoMensagem){
		this(tipoMensagem);
		adicionarConteudo(conteudoMensagem);
	
	}
	
	public Mensagem(TipoMensagem tipoMensagem, String conteudoMensagem){
		this(tipoMensagem);
		adicionarConteudo(conteudoMensagem);
	
	}
	
	public void adicionarConteudo(String texto) {
		adicionarConteudo(new Label(texto));
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
			ChatBotController.setChatPaneWidth((double) newVal);
			
			if(accordion != null) {
				accordion.setPrefWidth((double)newVal / 2);
				percorrerAccordion( (double) newVal/2);
			}
		});

	}
	
	private void percorrerAccordion(double d) {
		for(Node node : accordion.getChildrenUnmodifiable()) {
			for(Node p : ((TitledPane)node).getChildrenUnmodifiable())
			if(node instanceof Label)((Label)p).setText("SHASHKJDHSKJDHK");
		}
	}

	public void adicionarConteudoExpandivel(String titulo, Node... conteudos) {
		VBox vbox = new VBox();
		TitledPane titledPane = new TitledPane(titulo, vbox);
		
		accordion = new Accordion(titledPane);
		accordion.setExpandedPane(titledPane);
		
		for(Node node: conteudos) {
			
			formatarLabel(node);
			vbox.getChildren().add(node);
		}
		adicionarConteudo(accordion);
	}

	/**Formata um label. Se o node não for um label, não faz nada e retorna falso**/
	private boolean formatarLabel(Node node) {
		if(!(node instanceof Label)) return false;
		Label label = (Label) node;
		label.setWrapText(true);
		label.setPrefWidth(ChatBotController.getChatPaneWidth()/2);
		
		resizeElement(label);
		return true;
	}
	
	private void resizeElement(Label n) {
		ChatBotController.getMainScene().getWindow().widthProperty().addListener((obs, oldVal, newVal) -> {
			n.setMaxWidth(ChatBotController.getChatPaneWidth()/2);
		});
	}

}
