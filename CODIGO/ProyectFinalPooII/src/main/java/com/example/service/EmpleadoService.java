package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.repository.EmpleadoRepository;
import com.example.entity.Empleado;
import com.example.lib.CrudInterface;

public class EmpleadoService implements CrudInterfac{
 
	@Autowired
	@Qualifier("empleadorepository")	
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List listAll() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado guardar(Object obj) {
		Empleado empleado = (Empleado) obj;
		return empleadoRepository.save(empleado);
	}

	@Override
	public void delete(int id) {
		empleadoRepository.deleteById(id);
	}

	//extras del Repository
	public List<Empleado> findBy(String id) {
		return empleadoRepository.findBy(id);
	}
	
	public Optional<Empleado> findById(int id) {
		return empleadoRepository.findById(id);
	}
}
