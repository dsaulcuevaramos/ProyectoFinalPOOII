package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.service.EmpleadoService;

@Service
public class EmpleadoImplement implements EmpleadoService{

	@Autowired
	@Qualifier("empleadorepository")	
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> findAll() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado save(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public Optional<Empleado> get(int id) {
		return empleadoRepository.findById(id);
	}

	@Override
	public void update(Empleado empleado) {
		empleadoRepository.save(empleado);
	}

	@Override
	public void delte(int id) {
		empleadoRepository.deleteById(id);
	}
	
}
