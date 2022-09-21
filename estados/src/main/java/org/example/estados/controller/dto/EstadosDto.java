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

		public static List<EstadosDto> converter(List<Estados> estado) {
			
			return estado.stream().map(EstadosDto::new).collect(Collectors.toList());
		}
		
		
}
