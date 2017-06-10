package br.edu.ifpi.facebook.model;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
	
	private Usuario usuario;
	private List<Post> postagens = new ArrayList<Post>();
	private List<Usuario> amigos = new ArrayList<Usuario>();
	private List<Grupo> grupos = new ArrayList<Grupo>();
	private List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();
	
	public Perfil() {
	}
	public Perfil(Usuario usuario){
		this.usuario = usuario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Post> getPostagens() {
		return postagens;
	}
	public void setPostagens(List<Post> postagens) {
		this.postagens = postagens;
	}
	public List<Usuario> getAmigos() {
		return amigos;
	}
	public void setAmigos(List<Usuario> amigos) {
		this.amigos = amigos;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	public List<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}
	public void setSolicitacoes(List<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}
	public void addPost(Post post){
		postagens.add(post);
	}
	public void addAmigos(Usuario amigo){
		amigos.add(amigo);
	}
	public void addGrupo(Grupo grupo){
		grupos.add(grupo);
	}
	
	public void addSolicitacao(Solicitacao solicitacao){
		solicitacoes.add(solicitacao);
	}
}