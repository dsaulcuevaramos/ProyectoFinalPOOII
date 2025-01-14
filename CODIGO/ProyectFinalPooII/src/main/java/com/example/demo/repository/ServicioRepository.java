package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Empleado;
import com.example.demo.entity.Servicio;

@Repository("serviciorepository")
public interface ServicioRepository extends JpaRepository<Servicio, Serializable>{
	
	/*
	@Query("SELECT u FROM servicio u WHERE u.descripcion LIKE CONCAT(:descripcion, '%')")
    public List<Servicio> findByAlgo(@Param("descripcion") String atribute);
	*/
	public Optional<Servicio> findById(@Param("id") int id);
	
}
