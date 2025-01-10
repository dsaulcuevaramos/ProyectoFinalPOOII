package com.example.repository;

import java.io.Serializable;
import java.lang.foreign.AddressLayout;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.entity.Producto;

@Repository("productorepository")
public interface ProductoRepository extends JpaRepository<, Serializable>{

	String tableName = "usuario";
	
	@Query("SELECT u FROM "+tableName+" u where u.id LIKE CONCAT(:id,'%')")
	public List<Producto>findBy(@Param("id") String id);
	
	public Optional<Producto> findById(@Param("id") int id);
	
}
