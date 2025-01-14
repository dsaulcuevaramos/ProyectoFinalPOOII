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
@Table( name = "venta" )
public class Venta {

	//propios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idventa")
	private int id;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "total")
	private double total;
	
	//foraneos
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idcliente")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Cliente cliente;
	
	//referenciados
	@OneToOne(mappedBy = "venta")
	private VentaDetalle ventaDetalle;

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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public VentaDetalle getVentaDetalle() {
		return ventaDetalle;
	}

	public void setVentaDetalle(VentaDetalle ventaDetalle) {
		this.ventaDetalle = ventaDetalle;
	}
	
}
