package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Servicio;
import com.example.demo.repository.ServicioRepository;
import com.example.demo.service.ServicioService;

@Service
public class ServicioImplement implements ServicioService{
	
	@Autowired
	@Qualifier("serviciorepository")	
	private ServicioRepository servicioRepository;

	@Override
	public List<Servicio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Servicio save(Servicio servicio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Servicio> get(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(Servicio servicio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delte(int id) {
		// TODO Auto-generated method stub
		
	}


}
