package com.example.demo.entity;

public class tipoempleado {
private int idTipoempleado;
private String nombre;
private String descripcion;
private String sueldo;
public tipoempleado() {
	super();
	// TODO Auto-generated constructor stub
}
public tipoempleado(int idTipoempleado, String nombre, String descripcion, String sueldo) {
	super();
	this.idTipoempleado = idTipoempleado;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.sueldo = sueldo;
}
public int getIdTipoempleado() {
	return idTipoempleado;
}
public void setIdTipoempleado(int idTipoempleado) {
	this.idTipoempleado = idTipoempleado;
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
public String getSueldo() {
	return sueldo;
}
public void setSueldo(String sueldo) {
	this.sueldo = sueldo;
} 


}
