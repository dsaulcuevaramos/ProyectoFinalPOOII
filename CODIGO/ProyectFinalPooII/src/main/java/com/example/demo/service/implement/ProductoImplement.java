package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.service.ProductoService;

@Service
public class ProductoImplement implements ProductoService{

	@Autowired
	@Qualifier("productorepository")	
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}
	
	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(int id) {
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public void delte(int id) {
		productoRepository.deleteById(id);
	}

/*
	public List<Producto> findBy(String atribute) {
		return productoRepository.findByAlgo(atribute);
	}
*/	
	public Optional<Producto> findById(int id) {
		return productoRepository.findById(id);
	}
	
}
