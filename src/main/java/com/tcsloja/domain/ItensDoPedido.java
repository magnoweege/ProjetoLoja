package com.tcsloja.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItensDoPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="ITENSDOPEDIDO_ID")
	private Integer id;
	private Integer codigoDoProduto;
	private BigDecimal valorTotal;
	private Integer quantidade;

	public ItensDoPedido() {

	}

	public ItensDoPedido(Integer id, Integer codigoDoProduto, BigDecimal valorTotal, Integer quantidade) {
		super();
		this.id = id;
		this.codigoDoProduto = codigoDoProduto;
		this.valorTotal = valorTotal;
		this.quantidade = quantidade;
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
