package com.tcsloja.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	static Logger logger = Logger.getLogger(Cliente.class);  

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nomeCompleto;
	private Integer cpf;
	private String endereco;
	private Integer cep;
	private String bairro;
	private String cidade;
	private String uf;
	private Integer telefone;

	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List <Pedido> pedidos = new ArrayList<>();
	
	public Cliente() {
	}

	public Cliente(Integer id, String nomeCompleto, Integer cpf, String endereco, Integer cep, String bairro,
			String cidade, String uf, Integer telefone) {
		super();
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
	}

	public Integer getId() {
		
		logger.info("Solicitado ID " + id); 

		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		logger.info("Setando ID " + id); 
	}
	
	public String getNomeCompleto() {
		logger.info("Solicitado Nome do cliente " + nomeCompleto); 
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		logger.info("Setando Nome do cliente " + nomeCompleto); 
		this.nomeCompleto = nomeCompleto;
	}

	public Integer getCpf() {
		logger.info("Solicitando CPF " + cpf); 
		return cpf;
	}

	public void setCpf(Integer cpf) {
		logger.info("Setando CPF " + cpf); 
		this.cpf = cpf;
	}

	public String getEndereco() {
		logger.info("Solicitando endereço " + endereco); 
		return endereco;
	}

	public void setEndereco(String endereco) {
		logger.info("Setando endereço " + endereco); 
		this.endereco = endereco;
	}

	public Integer getCep() {
		logger.info("Solicitando CEP " + cep); 
		return cep;
	}

	public void setCep(Integer cep) {
		logger.info("Setando CEP " + cep); 
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
	
	public List <Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List <Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	// Para realizar comparações entre 2 objetos pelo seu conteúdo e não por
	// ponteiro de memória.
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	

}
