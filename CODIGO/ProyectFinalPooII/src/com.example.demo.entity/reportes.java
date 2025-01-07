package com.example.demo.entity;

public class reportes {
private int idReportes;
private int idboleta;
private int idempleado;
public reportes() {
	super();
	// TODO Auto-generated constructor stub
}
public reportes(int idReportes, int idboleta, int idempleado) {
	super();
	this.idReportes = idReportes;
	this.idboleta = idboleta;
	this.idempleado = idempleado;
}
public int getIdReportes() {
	return idReportes;
}
public void setIdReportes(int idReportes) {
	this.idReportes = idReportes;
}
public int getIdboleta() {
	return idboleta;
}
public void setIdboleta(int idboleta) {
	this.idboleta = idboleta;
}
public int getIdempleado() {
	return idempleado;
}
public void setIdempleado(int idempleado) {
	this.idempleado = idempleado;
} 



}
