package com.unilins.avaliacaoP2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unilins.avaliacaoP2.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
