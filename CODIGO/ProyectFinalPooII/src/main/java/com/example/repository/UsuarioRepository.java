package com.example.repository;

import java.io.Serializable;
import java.lang.foreign.AddressLayout;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.entity.Usuario;

@Repository("usuariorepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{

	String tableName = "usuario";
	
	@Query("SELECT u FROM "+tableName+" u where u.username LIKE CONCAT(:username,'%')")
	public List<Usuario>findBy(@Param("username") String username);
	
	public Usuario save(Usuario usuario);
	public void deleteBy(@Param("id") int id);
	public Optional<Usuario> findById(@Param("id") int id);

}
