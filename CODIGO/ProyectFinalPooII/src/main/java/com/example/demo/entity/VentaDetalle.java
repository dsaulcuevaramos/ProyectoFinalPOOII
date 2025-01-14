package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta_detalle")
public class VentaDetalle {

	//propios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idventa_detalle")
	private int id;
	private int cantidad;
	private double preciounidad;
	private double total;

	//foraneos
	@OneToOne
	@JoinColumn(name = "idventa")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Venta venta;
	
	@OneToOne
	private Producto producto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPreciounidad() {
		return preciounidad;
	}

	public void setPreciounidad(double preciounidad) {
		this.preciounidad = preciounidad;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
