package com.unilins.avaliacaoP2.entities.pk;

import java.io.Serializable;

import com.unilins.avaliacaoP2.entities.Alguel;
import com.unilins.avaliacaoP2.entities.Carro;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Alguel order;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Carro product;

	public Alguel getOrder() {
		return order;
	}
	public void setOrder(Alguel order) {
		this.order = order;
	}
	public Carro getProduct() {
		return product;
	}
	public void setProduct(Carro product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
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
		OrderItemPK other = (OrderItemPK) obj;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
}