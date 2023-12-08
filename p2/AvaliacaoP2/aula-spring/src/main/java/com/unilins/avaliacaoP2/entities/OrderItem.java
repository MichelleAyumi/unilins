package com.unilins.avaliacaoP2.entities;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unilins.avaliacaoP2.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	public Date dtaluguel;
	public Date dtdevolucao;
	private Double valorAluguel;


	public OrderItem(Alguel order, Carro product, Date dtaluguel, Date dtdevolucao, Double valorAluguel) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.dtaluguel = dtaluguel;
		this.dtdevolucao = dtdevolucao;
		this.valorAluguel = valorAluguel;
	}
	
	@JsonIgnore
	

	public OrderItemPK getId() {
		return id;
	}

	public void setId(OrderItemPK id) {
		this.id = id;
	}

	public Date getDtaluguel() {
		return dtaluguel;
	}

	public void setDtaluguel(Date dtaluguel) {
		this.dtaluguel = dtaluguel;
	}

	public Date getDtdevolucao() {
		return dtdevolucao;
	}

	public void setDtdevolucao(Date dtdevolucao) {
		this.dtdevolucao = dtdevolucao;
	}

	public Double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(Double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}