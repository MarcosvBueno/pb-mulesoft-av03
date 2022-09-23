package org.example.estados.controller.dto;


	import java.math.BigDecimal;
	import java.util.List;
	import java.util.stream.Collectors;

	import org.example.estados.model.Estados;
	import org.example.estados.model.Regioes;

	public class EstadosDto {
		
		private Long id;
		private String nome;
		private Regioes regiao;
		private Long populacao;
		private String capital;
		private BigDecimal area;
		
		
		
	public EstadosDto(Estados estados) {
			this.id = estados.getId();
			this.nome = estados.getNome();
			this.regiao = estados.getRegiao();
			this.populacao = estados.getPopulacao();
			this.capital = estados.getCapital();
			this.area = estados.getArea();
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

		public static List<EstadosDto> converter(List<Estados> estado) {
			
			return estado.stream().map(EstadosDto::new).collect(Collectors.toList());
		}
		
		
}
