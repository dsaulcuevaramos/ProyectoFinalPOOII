package com.example.demo.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Producto;

@Repository("productorepository")
public interface ProductoRepository extends JpaRepository<Producto, Serializable>{

/*
	@Query("SELECT u FROM producto u WHERE u.nombre LIKE CONCAT(:nombre, '%')")
    public List<Producto> findByAlgo(@Param("nombre") String atribute);
*/
	public Optional<Producto> findById(@Param("id") int id);

	
}
