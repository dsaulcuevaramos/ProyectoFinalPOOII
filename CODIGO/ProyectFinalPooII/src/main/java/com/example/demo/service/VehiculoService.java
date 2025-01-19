package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Vehiculo;

public interface VehiculoService {
	
	public List<Vehiculo> findAll();
	public Vehiculo save (Vehiculo vehiculo);
	public Optional<Vehiculo> get(int id);
	public void update(Vehiculo vehiculo);
	public void delete(int id);
	
}

