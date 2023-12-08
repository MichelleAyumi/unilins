package com.unilins.avaliacaoP2.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class Cliente  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String nome;
	public String cpf;
	public String celular;
	public String cnh;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Alguel> orders = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(Long id, String nome, String cpf, String celular, String cnh) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.cnh = cnh;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setOrders(List<Alguel> orders) {
		this.orders = orders;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	public List<Alguel> getOrders() {
		return orders;
	}

}
