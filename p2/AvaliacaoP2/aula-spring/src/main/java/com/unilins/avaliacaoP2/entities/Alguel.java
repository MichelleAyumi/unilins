package com.unilins.avaliacaoP2.entities;

import java.io.Serializable;
//import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//import com.unilins.aulaspring.entities.enums.OrderStatus;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Alguel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Date dtaluguel; 
	public Date dtdevolucao; 
	public Double valorAluguel;
	
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Cliente client;

	@OneToMany(mappedBy = "id.order")
	private Set<OrderItem> items = new HashSet<>();

	
	public Alguel() {
	}

	public Alguel(Long id, Cliente client,Date dtaluguel, Date dtdevolucao, Double valorAluguel) {
		super();
		this.id = id;
		this.client = client;
		this.dtaluguel = dtaluguel;
		this.dtdevolucao = dtdevolucao;
		this.valorAluguel = valorAluguel;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setItems(Set<OrderItem> items) {
		this.items = items;
	}

	public Set<OrderItem> getItems() {
		return items;
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
		Alguel other = (Alguel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}