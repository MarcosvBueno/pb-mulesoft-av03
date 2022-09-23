package org.example.estados.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.example.estados.model.Estados;
import org.example.estados.model.Usuarios;

public class UsuariosDto {
	private Long id;
	private String nome;
	private String email;
	private String senha ;
	
	
	public UsuariosDto(Usuarios usuarios) {
		this.id = usuarios.getId();
		this.nome = usuarios.getNome();
		this.email = usuarios.getEmail();
		this.senha = usuarios.getSenha();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	 public static List<UsuariosDto> converter(List<Usuarios> usuarios){
	        return usuarios.stream().map(UsuariosDto::new).collect(Collectors.toList());
	 }
}
