package com.example.repository;

import java.io.Serializable;
import java.lang.foreign.AddressLayout;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.entity.Empleado;
import com.example.entity.Usuario;

@Repository("empleadorepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable> {
	

	String tableName = "empleado";
	
	@Query("SELECT u FROM "+tableName+" u where u.id LIKE CONCAT(:id,'%')")
	public List<Empleado>findBy(@Param("id") String id);
	
	public Optional<Empleado> findById(@Param("id") int id);

}
