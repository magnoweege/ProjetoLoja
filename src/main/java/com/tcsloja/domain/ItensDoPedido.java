package com.tcsloja.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class ItensDoPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItensDoPedidoPK id =  new ItensDoPedidoPK();
	
	private Integer codigoDoProduto;
	private BigDecimal valorTotal;
	private Integer quantidade;

	public ItensDoPedido() {
	}

	public ItensDoPedido(Pedido pedido, Produto produto,  Integer codigoDoProduto, BigDecimal valorTotal, Integer quantidade) {
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		this.codigoDoProduto = codigoDoProduto;
		this.valorTotal = valorTotal;
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return id.getPedido();
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
	public ItensDoPedidoPK getId() {
		return id;
	}

	public void setId(ItensDoPedidoPK id) {
		this.id = id;
	}

	public Integer getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(Integer codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

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
		ItensDoPedido other = (ItensDoPedido) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
