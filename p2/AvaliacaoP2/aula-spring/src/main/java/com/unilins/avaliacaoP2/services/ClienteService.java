package com.unilins.avaliacaoP2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.unilins.avaliacaoP2.entities.Cliente;
import com.unilins.avaliacaoP2.repositories.ClienteRepository;
import com.unilins.avaliacaoP2.services.exceptions.DatabaseException;
import com.unilins.avaliacaoP2.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository userRep;

	public List<Cliente> findAll() {
		return userRep.findAll();
	}
	
	public Cliente findById(Long id) {
	Optional<Cliente> obj = userRep.findById(id);
	return obj.get();
	}
	
	public Cliente insert(Cliente obj) {
		return userRep.save(obj);
	}
	
	public void delete(Long id) {
		try {
			userRep.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Cliente update(Long id, Cliente obj) {
		try {
			Cliente entity = userRep.getReferenceById(id);
			updateData(entity, obj);
			return userRep.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}	
	}

	private void updateData(Cliente entity, Cliente obj) {
		entity.setNome(obj.getNome());
		entity.setCpf(obj.getCpf());
		entity.setCelular(obj.getCelular());
	}
}
