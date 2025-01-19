package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.UsuarioService;

@Service
public class UsuarioImplement implements UsuarioService{

	@Autowired
	@Qualifier("usuariorepository")	
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> get(int id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public void update(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void delete(int id) {
		usuarioRepository.deleteById(id);
	}

}
