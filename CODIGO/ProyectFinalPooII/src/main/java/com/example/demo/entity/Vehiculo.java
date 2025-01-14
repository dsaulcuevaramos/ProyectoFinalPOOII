package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	//propios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idvehiculo")
	private int id;
	@Column(name ="placa")
	private String placa;
	@Column(name = "marca")
	private String marca;
	@Column(name = "modelo")
	private String modelo;
	@Column(name = "estado")
	private boolean estado;
	
	//foraneos
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idcliente")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Cliente cliente;
	
	//referenciados
	@OneToMany(mappedBy = "vehiculo")
	private List<ServicioDetalle> servicioDetalle;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ServicioDetalle> getServicioDetalle() {
		return servicioDetalle;
	}

	public void setServicioDetalle(List<ServicioDetalle> servicioDetalle) {
		this.servicioDetalle = servicioDetalle;
	}
	
	
	
}