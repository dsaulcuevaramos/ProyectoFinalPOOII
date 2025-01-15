package com.example.demo.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Servicio;
import com.example.demo.entity.Vehiculo;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Serializable>{

	public Optional<Vehiculo> findById(@Param("id") int id);
	
}
