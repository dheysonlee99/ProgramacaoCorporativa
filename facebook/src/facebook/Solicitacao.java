package facebook;

public class Solicitacao {
	
	private String data;
	private Usuario usuario;
	private Usuario amigoSolicitado;
	private String estadoSolicitacao;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Usuario getAmigoSolicitado() {
		return amigoSolicitado;
	}
	public void setAmigoSolicitado(Usuario amigoSolicitado) {
		this.amigoSolicitado = amigoSolicitado;
	}
	public String getEstadoSolivcitacao() {
		return estadoSolicitacao;
	}
	public void setEstadoSolicitacao(String estadoSolicitacao) {
		this.estadoSolicitacao = estadoSolicitacao;
	}
	

}
