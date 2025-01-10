package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.repository.UsuarioRepository;
import com.example.entity.Usuario;
import com.example.lib.CrudInterface;

@Service("usuarioservice")
public class UsuarioService implements CrudInterface{

	@Autowired
	@Qualifier("usuariorepository")	
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List listAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario guardar(Object obj) {
		Usuario usuario = (Usuario) obj;
		return usuarioRepository.save(usuario);
	}

	@Override
	public void delete(int id) {
		usuarioRepository.deleteById(id);
	}

	//extras del Repository
	public List<Usuario> findBy(String username) {
		return usuarioRepository.findBy(username);
	}
	
	public Optional<Usuario> findById(int id) {
		return usuarioRepository.findById(id);
	}
	
}
