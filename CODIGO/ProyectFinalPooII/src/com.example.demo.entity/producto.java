package com.example.demo.entity;

public class producto {
	private int idProducto;
	private String nombre;
	private String descripcion;
	private String stock;
	private String costo;
	private boolean estado;
	
	public producto() {
		super();
	
	}


	public int getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getStock() {
		return stock;
	}



	public void setStock(String stock) {
		this.stock = stock;
	}



	public String getCosto() {
		return costo;
	}



	public void setCosto(String costo) {
		this.costo = costo;
	}



	public boolean isEstado() {
		return estado;
	}



	public void setEstado(boolean estado) {
		this.estado = estado;
	}



	public producto(int idProducto, String nombre, String descripcion, String stock, String costo, boolean estado) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stock = stock;
		this.costo = costo;
		this.estado = estado;
	} 
	
	

}
