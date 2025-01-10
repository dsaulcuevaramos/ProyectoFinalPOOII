package com.example.entity;

public class Servicio {

	private int id;
	private String descipcion;
	private double costo;
	private int idEmpleado;
	private Vehiculo vehiculo;
	public Servicio() {
		super();
	}
	public Servicio(int id, String descipcion, double costo, int idEmpleado, Vehiculo vehiculo) {
		super();
		this.id = id;
		this.descipcion = descipcion;
		this.costo = costo;
		this.idEmpleado = idEmpleado;
		this.vehiculo = vehiculo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescipcion() {
		return descipcion;
	}
	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
