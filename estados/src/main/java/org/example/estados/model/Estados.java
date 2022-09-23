package org.example.estados.model;


	import java.math.BigDecimal;

	import javax.persistence.Entity;
	import javax.persistence.EnumType;
	import javax.persistence.Enumerated;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "ESTADOS")
public class Estados {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nome;
		@Enumerated(EnumType.STRING)
		private Regioes regiao;
		private Long populacao;
		private String capital;
		private BigDecimal area;



		public Estados() {	
		}


		public Estados(String nome, Regioes regiao, Long populacao, String capital, BigDecimal area) {
			this.nome = nome;
			this.regiao = regiao;
			this.populacao = populacao;
			this.capital = capital;
			this.area = area;
		}



		public Long getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}

		public Regioes getRegiao() {
			return regiao;
		}

		public Long getPopulacao() {
			return populacao;
		}

		public String getCapital() {
			return capital;
		}

		public BigDecimal getArea() {
			return area;
		}
		
		public void setId(Long id) {
			this.id = id;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setRegiao(Regioes regiao) {
			this.regiao = regiao;
		}

		public void setPopulacao(Long populacao) {
			this.populacao = populacao;
		}

		public void setCapital(String capital) {
			this.capital = capital;
		}

		public void setArea(BigDecimal area) {
			this.area = area;
		}

	}

