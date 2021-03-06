package br.edu.ifpi.facebook.model;

import java.util.ArrayList;
import java.util.List;

public class Comentario {
	
	private String texto;
	private Usuario usuario;
	private String data;
	private Post post;
	private List<Resposta> respostas = new ArrayList<Resposta>();
	
	
	public Comentario() {	
	}
	public Comentario(String texto, Usuario usuario, String data, Post post){
		this.texto = texto;
		this.usuario = usuario;
		this.data = data;
		this.post = post;
		
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<Resposta> getRespostas() {
		return respostas;
	}
	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
	public void addResposta(Resposta resposta){
		respostas.add(resposta);
	}

}
