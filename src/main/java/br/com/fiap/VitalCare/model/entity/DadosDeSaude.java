package br.com.fiap.VitalCare.model.entity;

import jakarta.validation.constraints.NotNull;

public class DadosDeSaude {
	
	private Long id;
	@NotNull 
	private String alergias;
	@NotNull 
	private String medicamentosEmUso;
	@NotNull 
	private String cirurgiaAnterior;
	@NotNull 
	private String condicaoMedica;
	
	public DadosDeSaude() {
		
	}

	public DadosDeSaude(Long id, @NotNull String alergias, @NotNull String medicamentosEmUso,
			@NotNull String cirurgiaAnterior, @NotNull String condicaoMedica) {
		this.id = id;
		this.alergias = alergias;
		this.medicamentosEmUso = medicamentosEmUso;
		this.cirurgiaAnterior = cirurgiaAnterior;
		this.condicaoMedica = condicaoMedica;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getMedicamentosEmUso() {
		return medicamentosEmUso;
	}

	public void setMedicamentosEmUso(String medicamentosEmUso) {
		this.medicamentosEmUso = medicamentosEmUso;
	}

	public String getCirurgiaAnterior() {
		return cirurgiaAnterior;
	}

	public void setCirurgiaAnterior(String cirurgiaAnterior) {
		this.cirurgiaAnterior = cirurgiaAnterior;
	}

	public String getCondicaoMedica() {
		return condicaoMedica;
	}

	public void setCondicaoMedica(String condicaoMedica) {
		this.condicaoMedica = condicaoMedica;
	}	

	
}
