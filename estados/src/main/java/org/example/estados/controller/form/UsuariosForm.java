package org.example.estados.controller.form;

import javax.validation.constraints.NotNull;

import org.example.estados.model.Usuarios;
import org.hibernate.validator.constraints.NotEmpty;

public class UsuariosForm {



	@NotNull
	@NotEmpty
	private String nome;
	
	@NotNull
	@NotEmpty
	private String email;
	
	@NotNull
	@NotEmpty
	private String senha ;
	
	public Usuarios converter() {
		return new Usuarios(nome,email,senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	
}
