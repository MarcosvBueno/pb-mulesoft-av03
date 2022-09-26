package org.example.estados.controller.form;

import java.util.Optional;

import org.example.estados.model.Usuarios;
import org.example.estados.repository.UsuariosRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AtualizacaoUsuariosForm {


	private String nome;
	private String email;
	private String senha ;

	
	
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
	
	public Usuarios atualizar(Long id, UsuariosRepository usuariosRepository) {
		Usuarios usuarios = usuariosRepository.getReferenceById(id);
		usuarios.setNome(nome);
		usuarios.setEmail(email);
		usuarios.setSenha(new BCryptPasswordEncoder().encode(this.senha));
		return usuarios;
		
	}
	
}
