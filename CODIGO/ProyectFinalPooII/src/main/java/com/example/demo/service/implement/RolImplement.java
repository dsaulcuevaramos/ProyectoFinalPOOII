package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Rol;
import com.example.demo.repository.RolRepository;
import com.example.demo.service.RolService;

@Service
public class RolImplement implements RolService{

	@Autowired
	@Qualifier("rolrepository")	
	private RolRepository rolRepository;
	
	@Override
	public List<Rol> findAll() {
		return rolRepository.findAll();
	}

	@Override
	public Rol save(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Rol> get(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(Rol rol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
