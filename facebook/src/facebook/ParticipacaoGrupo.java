package facebook;

public class ParticipacaoGrupo {
	
	private Grupo grupo;
	private Usuario usuario;
	private boolean tipoParticipacao;
	
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
