package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Vehiculo;
import com.example.demo.service.VehiculoService;

@Service
public class VehiculoImplement implements VehiculoService{

	@Override
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo save(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Vehiculo> get(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub	
	}

}
