package com.unilins.avaliacaoP2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unilins.avaliacaoP2.entities.Alguel;
import com.unilins.avaliacaoP2.services.AluguelService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/orders")
public class AluguelResource {

	// depois que criar o Service eu adiciona aqui esse obj userServ
	@Autowired
	private AluguelService orderServ;

	@CrossOrigin(origins = "*")
	@GetMapping
	public ResponseEntity<List<Alguel>> findAll() {
		// preciso desse user abaixo antes de criar o Service
		// User user = new User(1L,"Maria", "maria@gmail", "9999999", "112233");

		// depois qur criar o Service eu nao preciso mais do user acima
		// mas preciso da LIST abaixo
		List<Alguel> list = orderServ.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Alguel> findById(@PathVariable Long id){
		Alguel obj = orderServ.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
