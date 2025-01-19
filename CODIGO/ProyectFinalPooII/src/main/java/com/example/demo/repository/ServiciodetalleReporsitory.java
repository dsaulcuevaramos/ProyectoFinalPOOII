package com.example.demo.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ServicioDetalle; 

@Repository("serviciodetallerepository")
public interface ServiciodetalleReporsitory  extends JpaRepository<ServicioDetalle, Serializable>{
	
	public Optional<ServicioDetalle> findById(@Param("id") int id);

}

