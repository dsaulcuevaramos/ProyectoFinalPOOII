package com.example.repository;

import java.io.Serializable;
import java.lang.foreign.AddressLayout;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Cliente;
import com.example.entity.Usuario;

@Repository("clienterepository")
public interface ClienteRepository extends JpaRepository <Cliente, Serializable> {

String tableName = "cliente";
	
	@Query("SELECT u FROM "+tableName+" u where u.id LIKE CONCAT(:id,'%')")
	public List<Cliente>findBy(@Param("id") String id);
	
	public Optional<Cliente> findById(@Param("id") int id);
	
}
