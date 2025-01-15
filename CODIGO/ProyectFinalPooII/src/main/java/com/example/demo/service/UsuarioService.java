package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Usuario;

public interface UsuarioService {

	public List<Usuario> findAll();
	public Usuario save (Usuario usuario);
	public Optional<Usuario> get(int id);
	public void update(Usuario usuario);
	public void delete(int id);
	
	
}
