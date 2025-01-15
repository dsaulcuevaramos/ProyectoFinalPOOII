package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;

@Service
public class UsuarioImplement implements UsuarioService{

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> get(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
