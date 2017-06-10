package br.edu.ifpi.facebook.teste;

import br.edu.ifpi.facebook.model.Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setNome("Ronaldo");
		usuario.setDataNascimento("21/10/1999");
		usuario.setEmail("ronaldo@hotmail.com");
		
		System.out.println(usuario);

	}

}
