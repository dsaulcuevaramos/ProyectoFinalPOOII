package com.example.demo.entity;

public class boleta {
private int idBoleta;
private String fecha;
private int idproducto;
private int idservicio;
private String nombrecliente;
private String dnicliente;
private String total;



public boleta() {
	super();
	// TODO Auto-generated constructor stub
}



public boleta(int idBoleta, String fecha, int idproducto, int idservicio, String nombrecliente, String dnicliente,
		String total) {
	super();
	this.idBoleta = idBoleta;
	this.fecha = fecha;
	this.idproducto = idproducto;
	this.idservicio = idservicio;
	this.nombrecliente = nombrecliente;
	this.dnicliente = dnicliente;
	this.total = total;
}



public int getIdBoleta() {
	return idBoleta;
}



public void setIdBoleta(int idBoleta) {
	this.idBoleta = idBoleta;
}



public String getFecha() {
	return fecha;
}



public void setFecha(String fecha) {
	this.fecha = fecha;
}



public int getIdproducto() {
	return idproducto;
}



public void setIdproducto(int idproducto) {
	this.idproducto = idproducto;
}



public int getIdservicio() {
	return idservicio;
}



public void setIdservicio(int idservicio) {
	this.idservicio = idservicio;
}



public String getNombrecliente() {
	return nombrecliente;
}



public void setNombrecliente(String nombrecliente) {
	this.nombrecliente = nombrecliente;
}



public String getDnicliente() {
	return dnicliente;
}



public void setDnicliente(String dnicliente) {
	this.dnicliente = dnicliente;
}



public String getTotal() {
	return total;
}



public void setTotal(String total) {
	this.total = total;
}



}
