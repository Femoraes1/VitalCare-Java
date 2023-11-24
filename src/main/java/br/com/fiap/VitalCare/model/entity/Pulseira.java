package br.com.fiap.VitalCare.model.entity;

import jakarta.validation.constraints.NotNull;

public class Pulseira {
	
	private Long id;
	@NotNull
	private boolean batimentos;
	@NotNull
	private boolean pressao;
	@NotNull
	private boolean oxigenio;
	@NotNull
	private boolean localizacao;
	
	public Pulseira() {
		
	}

	public Pulseira(Long id, @NotNull boolean batimentos, @NotNull boolean pressao, @NotNull boolean oxigenio,
			@NotNull boolean localizacao) {
		this.id = id;
		this.batimentos = batimentos;
		this.pressao = pressao;
		this.oxigenio = oxigenio;
		this.localizacao = localizacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isBatimentos() {
		return batimentos;
	}

	public void setBatimentos(boolean batimentos) {
		this.batimentos = batimentos;
	}

	public boolean isPressao() {
		return pressao;
	}

	public void setPressao(boolean pressao) {
		this.pressao = pressao;
	}

	public boolean isOxigenio() {
		return oxigenio;
	}

	public void setOxigenio(boolean oxigenio) {
		this.oxigenio = oxigenio;
	}

	public boolean isLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(boolean localizacao) {
		this.localizacao = localizacao;
	}
	
	

}
