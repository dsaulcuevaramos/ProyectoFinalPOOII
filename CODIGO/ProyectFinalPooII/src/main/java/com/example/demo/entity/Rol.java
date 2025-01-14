package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idrol")
	private int id;
	private String nombre;
	private String descripcion;
	private double sueldo;
	
	//referenciados
	@OneToMany(mappedBy = "rol")
	private List<Empleado> empleado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescipcion() {
		return descripcion;
	}

	public void setDescipcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
}
