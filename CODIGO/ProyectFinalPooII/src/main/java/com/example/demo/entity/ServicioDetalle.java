package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicio_detalle")
public class ServicioDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idservicio_detalle")
	private int id;
	private String fecha;
	private double costototal;
	
	//foraneos
	@OneToOne
	@JoinColumn(name = "idservicio")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Servicio servicio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idvehiculo")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Vehiculo vehiculo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getCostototal() {
		return costototal;
	}

	public void setCostototal(double costototal) {
		this.costototal = costototal;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	
	
}
