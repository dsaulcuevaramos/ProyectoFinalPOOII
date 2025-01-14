package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Empleado;


@Repository("empleadorepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable>{

	/*
	@Query("SELECT u FROM empleado u WHERE u.nombres LIKE CONCAT(:nombres, '%')")
    public List<Empleado> findByAlgo(@Param("nombres") String atribute);
    */
    public Optional<Empleado> findById(@Param("id") int id);
	
}
