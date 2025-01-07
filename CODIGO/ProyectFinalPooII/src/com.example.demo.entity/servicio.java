package com.example.demo.entity;

public class servicio {
private int ideServicio;
private String nombre;
private String descripcion;
private String costo;
private int idempleado;
public servicio() {
	super();
	// TODO Auto-generated constructor stub
}
public servicio(int ideServicio, String nombre, String descripcion, String costo, int idempleado) {
	super();
	this.ideServicio = ideServicio;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.costo = costo;
	this.idempleado = idempleado;
}
public int getIdeServicio() {
	return ideServicio;
}
public void setIdeServicio(int ideServicio) {
	this.ideServicio = ideServicio;
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
public String getCosto() {
	return costo;
}
public void setCosto(String costo) {
	this.costo = costo;
}
public int getIdempleado() {
	return idempleado;
}
public void setIdempleado(int idempleado) {
	this.idempleado = idempleado;
} 



}
