package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Empleado;

public interface EmpleadoService{

	public List<Empleado> findAll();
	public Empleado save (Empleado empleado);
	public Optional<Empleado> get(int id);
	public void update(Empleado empleado);
	public void delete(int id);


}
