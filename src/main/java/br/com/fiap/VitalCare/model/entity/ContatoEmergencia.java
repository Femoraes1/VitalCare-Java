package br.com.fiap.VitalCare.model.entity;

import jakarta.validation.constraints.NotNull;

public class ContatoEmergencia {
	
	private Long id;
	@NotNull 
	private String NomeContato;
	@NotNull 
	private String TelefoneContato;
	@NotNull 
	private String parentesco;
	
	public ContatoEmergencia() {
		
	}

	public ContatoEmergencia(Long id, @NotNull String nomeContato, @NotNull String telefoneContato,
			@NotNull String parentesco) {
		this.id = id;
		NomeContato = nomeContato;
		TelefoneContato = telefoneContato;
		this.parentesco = parentesco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeContato() {
		return NomeContato;
	}

	public void setNomeContato(String nomeContato) {
		NomeContato = nomeContato;
	}

	public String getTelefoneContato() {
		return TelefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		TelefoneContato = telefoneContato;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
	

}
