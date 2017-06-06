package facebook;

import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private String conteudoPostagem;
	private Usuario usuario;
	private List<Comentario> comentarios = new ArrayList<>();
	private List<Curtida> curtidas = new ArrayList<>();
	
	public Post() {
		
	}
	
	public Post(String conteudoPostagem, Usuario usuario) {
		this.conteudoPostagem = conteudoPostagem;
		this.usuario = usuario;
		
	}
	public String getConteudoPostagem() {
		return conteudoPostagem;
	}
	public void setConteudoPostagem(String conteudoPostagem) {
		this.conteudoPostagem = conteudoPostagem;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public List<Curtida> getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(List<Curtida> curtidas) {
		this.curtidas = curtidas;
	}
	
	public void addComentario(Comentario comentario){
		comentarios.add(comentario);

	}
	public void addCurtida(Curtida curtida){
		curtidas.add(curtida);

	}
	

}
