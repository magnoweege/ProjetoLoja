package com.tcsloja.dto;

import java.io.Serializable;
import javax.validation.constraints. *;
import com.tcsloja.domain.Cliente;

public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message="Por favor preencha o nome completo")
	@Size(min = 5, max = 80, message = "Nome completo deve conter entre 5 e 80 caracteres")
	private String nomeCompleto;
	private Integer cpf;
	private String endereco;
	private Integer cep;
	private String bairro;
	private String cidade;
	private String uf;
	private Integer telefone;

	public ClienteDTO() {
	}
	public ClienteDTO(Cliente obj) {
		id = obj.getId();
		nomeCompleto = obj.getNomeCompleto();
		cpf = obj.getCpf();
		endereco = obj.getEndereco();
		cep = obj.getCep();
		bairro = obj.getBairro();
		cidade = obj.getCidade();
		uf = obj.getUf();
		telefone = obj.getTelefone();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	
	
}
