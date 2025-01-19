package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Producto;


public interface ProductoService{

	public List<Producto> findAll();
	public Producto save (Producto producto);
	public Optional<Producto> get(int id);
	public void update(Producto producto);
	public void delete(int id);
	
}
