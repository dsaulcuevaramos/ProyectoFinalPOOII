package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.repository.ClienteRepository;
import com.example.entity.Cliente;
import com.example.lib.CrudInterface;

public class ClienteService implements CrudInterfac{

	@Autowired
	@Qualifier("clienterepository")	
	private ClienteRepository clienteRepository;
	
	@Override
	public List listAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente guardar(Object obj) {
		Cliente cliente = (Cliente) obj;
		return clienteRepository.save(cliente);
	}

	@Override
	public void delete(int id) {
		clienteRepository.deleteById(id);
	}

	//extras del Repository
	public List<Cliente> findBy(String id) {
		return clienteRepository.findBy(id);
	}
	
	public Optional<Cliente> findById(int id) {
		return clienteRepository.findById(id);
	}
}
