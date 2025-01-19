package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Usuario;

@Repository("usuariorepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{
	/*
	@Query("SELECT u FROM usuario u WHERE u.username LIKE CONCAT(:username, '%')")
    public List<Usuario> findByAlgo(@Param("username") String atribute);
	*/
	public Optional<Usuario> findById(@Param("id") int id);
	
}
