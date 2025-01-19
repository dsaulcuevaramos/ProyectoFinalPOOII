package com.example.demo.service.implement;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ServicioDetalle;
import com.example.demo.repository.ServiciodetalleReporsitory;
import com.example.demo.service.ServiciodetalleService;

@Service
public class ServiciodetalleImplement implements ServiciodetalleService{
	@Autowired
	@Qualifier("serviciodetallerepository")	
	private ServiciodetalleReporsitory serviciodetalleRepository;
	
	@Override
	public List<ServicioDetalle> findAll() {
		return serviciodetalleRepository.findAll();
	}
	
	@Override
	public ServicioDetalle save(ServicioDetalle serviciodetalle) {
		return serviciodetalleRepository.save(serviciodetalle);
	}

	@Override
	public Optional<ServicioDetalle> get(int id) {
		return serviciodetalleRepository.findById(id);
	}
	
	@Override
	public void delte(int id) {
		serviciodetalleRepository.deleteById(id);
	}

	public Optional<ServicioDetalle> findById(int id) {
		return serviciodetalleRepository.findById(id);
	}

	@Override
	public void update(ServicioDetalle serviciodetalle) {
		serviciodetalleRepository.save(serviciodetalle);
		
	}
	
}