package lpv.chatbot.classes;

public abstract class ConteudoPesquisado{

	private String descricaoComponente, idPaneExibicaoImagem;

	public ConteudoPesquisado() {
		descricaoComponente = idPaneExibicaoImagem = "";
	}

	public ConteudoPesquisado(String descricaoComponente, String idPaneExibicaoImagem) {
		super();
		this.descricaoComponente = descricaoComponente;
		this.idPaneExibicaoImagem = idPaneExibicaoImagem;
	}

	public String getDescricaoComponente() {
		return descricaoComponente;
	}

	public void setDescricaoComponente(String descricaoComponente) {
		this.descricaoComponente = descricaoComponente;
	}

	public String getIdPaneExibicaoImagem() {
		return idPaneExibicaoImagem;
	}

	public void setIdPaneExibicaoImagem(String idPaneExibicaoImagem) {
		this.idPaneExibicaoImagem = idPaneExibicaoImagem;
	}

	@Override
	public String toString() {
		return "ConteudoPesquisado [descricaoComponente=" + descricaoComponente + ", idPaneExibicaoImagem="
				+ idPaneExibicaoImagem + "]";
	}
	
}//class ConteudoPesquisado 
