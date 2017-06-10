package br.edu.ifpi.facebook.model;

public class Solicitacao {
	
	private String data;
	private Usuario usuario;
	private Usuario amigoSolicitado;
	private String estadoSolicitacao;
	
	public Solicitacao() {
		
	}
	
	public Solicitacao(String data, Usuario usuario, Usuario amigoSolicitado, String estadoSolicitacao) {
		this.data = data;
		this.usuario = usuario;
		this.amigoSolicitado = amigoSolicitado;
		this.estadoSolicitacao = estadoSolicitacao;
	}
	
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
