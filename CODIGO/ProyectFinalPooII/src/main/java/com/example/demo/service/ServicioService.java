package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Servicio;


public interface ServicioService{

	public List<Servicio> findAll();
	public Servicio save (Servicio servicio);
	public Optional<Servicio> get(int id);
	public void update(Servicio servicio);
	public void delete(int id);
	
}
