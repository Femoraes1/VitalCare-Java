package br.com.fiap.VitalCare.model.entity;


import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public class Cliente {
	
	
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	private String telefone;
	@NotNull
	private LocalDate dataNascimento;
	@NotNull
	private String genero;
	@NotNull
	private String email;
	@NotNull
	private String senha;
	@NotNull
	private String rua;
	@NotNull
	private String numero;
	@NotNull
	private String complemento;
	@NotNull
	private String bairro;
	@NotNull
	private String municipio;
	@NotNull
	private String uf;
	@NotNull
	private String cep;
	
	public Cliente () {
		
	}

	public Cliente(Long id, @NotNull String nome, @NotNull String telefone, @NotNull LocalDate dataNascimento,
			@NotNull String genero, @NotNull String email, @NotNull String senha, @NotNull String rua,
			@NotNull String numero, @NotNull String complemento, @NotNull String bairro, @NotNull String municipio,
			@NotNull String uf, @NotNull String cep) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.email = email;
		this.senha = senha;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
		this.cep = cep;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	

}
