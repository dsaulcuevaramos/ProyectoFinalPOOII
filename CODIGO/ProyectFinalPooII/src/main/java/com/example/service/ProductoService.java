package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.repository.ProductoRepository;
import com.example.entity.Producto;
import com.example.lib.CrudInterface;

public class ProductoService implements CrudInterface{

		@Autowired
		@Qualifier("productorepository")	
		private ProductoRepository productoRepository;
		
		@Override
		public List listAll() {
			return ProductoRepository.findAll();
		}

		@Override
		public Producto guardar(Object obj) {
			Producto producto = (Producto) obj;
			return ProductoRepository.save(producto);
		}

		@Override
		public void delete(int id) {
			ProductoRepository.deleteById(id);
		}

		//extras del Repository
		public List<Producto> findBy(String id) {
			return ProductoRepository.findBy(id);
		}
		
		public Optional<Producto> findById(int id) {
			return ProductoRepository.findById(id);
		}
}
