package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.service.ClienteService;

@Service
public class ClienteImplement implements ClienteService{

	@Autowired
	@Qualifier("clienterepository")	
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Optional<Cliente> get(int id) {
		return clienteRepository.findById(id);
	}

	@Override
	public void update(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	public void delte(int id) {
		clienteRepository.deleteById(id);
	}

}
