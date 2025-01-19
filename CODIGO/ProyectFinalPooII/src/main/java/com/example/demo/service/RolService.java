package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Rol;

public interface RolService {

	public List<Rol> findAll();
	public Rol save (Rol rol);
	public Optional<Rol> get(int id);
	public void update(Rol rol);
	public void delete(int id);
	
}
