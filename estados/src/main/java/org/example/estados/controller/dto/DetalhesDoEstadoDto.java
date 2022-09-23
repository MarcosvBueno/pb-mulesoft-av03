package org.example.estados.controller.dto;

import java.math.BigDecimal;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.example.estados.model.Regioes;
import org.example.estados.model.Estados;
public class DetalhesDoEstadoDto {

	private Long id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private Regioes regiao;
	private Long populacao;
	private String capital;
	private BigDecimal area;
	
	
	
	public DetalhesDoEstadoDto(Estados estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.capital = estado.getCapital();
		this.area = estado.getArea();
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
	public Regioes getRegiao() {
		return regiao;
	}
	public void setRegiao(Regioes regiao) {
		this.regiao = regiao;
	}
	public Long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	
}
