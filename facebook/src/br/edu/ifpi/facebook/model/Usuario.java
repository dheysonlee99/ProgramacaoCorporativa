package br.edu.ifpi.facebook.model;



public class Usuario {
	
	private String nome;
	private String dataNascimento;
	private String email;
	private String senha;
	private Perfil perfil;
	
	
	public Usuario() {
		
	}
	public Usuario(String nome, String dataNascimento, String email, String senha, Perfil perfil){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	@Override
	public String toString() {
		return this.nome + "\n"
				+ this.dataNascimento + "\n"
				+ this.email;
	}
	
}