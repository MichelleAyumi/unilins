package com.unilins.avaliacaoP2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unilins.avaliacaoP2.entities.Carro;
import com.unilins.avaliacaoP2.repositories.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository repository;

	public List<Carro> findAll() {
		return repository.findAll();
	}

	public Carro findById(Long id) {
		Optional<Carro> obj = repository.findById(id);
		return obj.get();
	}
}
