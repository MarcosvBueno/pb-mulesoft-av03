package org.example.estados.controller.form;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.example.estados.model.Estados;
import org.example.estados.model.Regioes;

import org.hibernate.validator.constraints.NotEmpty;



public class EstadosForm {

	@NotNull
	@NotEmpty
	private String nome;
	
	@NotNull
	private Regioes regiao;
	
	@NotNull
	private long populacao;
	
	@NotNull
	@NotEmpty
	private String capital;
	
	@NotNull
	private BigDecimal area;

	public Estados converter() {
		return new Estados(nome,regiao,populacao,capital,area);
		
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

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
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
