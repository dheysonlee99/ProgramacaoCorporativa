package facebook;

public class ParticipacaoGrupo {
	
	private Grupo grupo;
	private Usuario usuario;
	private boolean tipoParticipacao;
	
	public ParticipacaoGrupo() {
	}
	
	public ParticipacaoGrupo(Grupo grupo, Usuario usuario, boolean tipoPaticipacao) {
		this.grupo = grupo;
		this.usuario = usuario;
		this.tipoParticipacao = tipoPaticipacao;
	}
	
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public boolean isTipoParticipacao() {
		return tipoParticipacao;
	}
	public void setTipoParticipacao(boolean tipoParticipacao) {
		this.tipoParticipacao = tipoParticipacao;
	}
	

}
