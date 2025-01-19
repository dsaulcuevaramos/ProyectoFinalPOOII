package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Cliente;

public interface ClienteService {

	public List<Cliente> findAll();
	public Cliente save (Cliente cliente);
	public Optional<Cliente> get(int id);
	public void update(Cliente cliente);
	public void delete(int id);
}

