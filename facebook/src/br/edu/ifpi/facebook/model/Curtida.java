package br.edu.ifpi.facebook.model;

public class Curtida {
	
	private Usuario usuario;
	private String tipoCurtida;
	
	public Curtida() {
	
	}
	
	public Curtida(Usuario usuario, String tipoCurtida){
		this.usuario = usuario;
		this.tipoCurtida = tipoCurtida;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTipoCurtida() {
		return tipoCurtida;
	}
	public void setTipoCurtida(String tipoCurtida) {
		this.tipoCurtida = tipoCurtida;
	}

}
