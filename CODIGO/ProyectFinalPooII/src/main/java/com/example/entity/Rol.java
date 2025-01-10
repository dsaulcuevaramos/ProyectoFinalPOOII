package com.example.entity;

public class Rol {

	private int id;
	private String nombre;
	private String descipcion;
	private double sueldo;
	
	public Rol(int id, String nombre, String descipcion, double sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descipcion = descipcion;
		this.sueldo = sueldo;
	}

	public Rol() {
		super();
	}

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
		return descipcion;
	}

	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	
}
