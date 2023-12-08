package com.unilins.avaliacaoP2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unilins.avaliacaoP2.entities.Carro;
import com.unilins.avaliacaoP2.services.CarroService;

@RestController
@RequestMapping(value = "/products")
public class CarroResource {

	@Autowired 
	private CarroService service;

	@GetMapping
	public ResponseEntity<List<Carro>> findAll() {
		List<Carro> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Carro> findById(@PathVariable Long id) {
		Carro obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
