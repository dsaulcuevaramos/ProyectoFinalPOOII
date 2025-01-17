package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Venta;

public interface VentaService {

	public List<Venta> findAll();
	public Venta save (Venta venta);
	public Optional<Venta> get(int id);
	public void update(Venta venta);
	public void delte(int id);
	
	
}
