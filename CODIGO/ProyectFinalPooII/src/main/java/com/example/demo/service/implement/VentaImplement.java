package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Venta;
import com.example.demo.repository.VentaRepository;
import com.example.demo.service.VentaService;

@Service
public class VentaImplement implements VentaService{

	@Autowired
	@Qualifier("ventarepository")	
	private VentaRepository ventaRepository;
	
	@Override
	public List<Venta> findAll() {
		return ventaRepository.findAll();
	}

	@Override
	public Venta save(Venta venta) {
		return ventaRepository.save(venta);
	}

	@Override
	public Optional<Venta> get(int id) {
		return ventaRepository.findById(id);
	}

	@Override
	public void update(Venta venta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
