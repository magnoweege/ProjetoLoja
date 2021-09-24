package com.tcsloja.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer numeroDoPedido;
	
	private Integer codigoDoCliente;
	private Date dataDoPedido;
	private BigDecimal valorTotal;
	private String itensDoPedido;
	private BigDecimal valorDoFrete;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	public Pedido() {

	}

	public Pedido(Integer numeroDoPedido, Integer codigoDoCliente, Date dataDoPedido, BigDecimal valorTotal,
			String itensDoPedido, BigDecimal valorDoFrete, Cliente cliente) {
		super();
		this.codigoDoCliente = codigoDoCliente;
		this.dataDoPedido = dataDoPedido;
		this.numeroDoPedido = numeroDoPedido;
		this.valorTotal = valorTotal;
		this.itensDoPedido = itensDoPedido;
		this.valorDoFrete = valorDoFrete;
		this.cliente = cliente;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Integer getCodigoDoCliente() {
		return codigoDoCliente;
	}

	public void setCodigoDoCliente(Integer codigoDoCliente) {
		this.codigoDoCliente = codigoDoCliente;
	}

	public Date getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	public Integer getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(Integer numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getItensDoPedido() {
		return itensDoPedido;
	}

	public void setItensDoPedido(String itensDoPedido) {
		this.itensDoPedido = itensDoPedido;
	}

	public BigDecimal getValorDoFrete() {
		return valorDoFrete;
	}

	public void setValorDoFrete(BigDecimal valorDoFrete) {
		this.valorDoFrete = valorDoFrete;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDoPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(numeroDoPedido, other.numeroDoPedido);
	}

	

}
