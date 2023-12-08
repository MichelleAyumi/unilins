package com.unilins.avaliacaoP2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unilins.avaliacaoP2.entities.Alguel;
import com.unilins.avaliacaoP2.repositories.AluguelRepository;

@Service
public class AluguelService {
	@Autowired
	private AluguelRepository orderRep;

	public List<Alguel> findAll() {
		return orderRep.findAll();
	}
	
	public Alguel findById(Long id) {
	Optional<Alguel> obj = orderRep.findById(id);
	return obj.get();
	}
}
