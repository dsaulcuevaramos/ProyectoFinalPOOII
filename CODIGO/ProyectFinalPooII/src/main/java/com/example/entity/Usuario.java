package com.example.entity;

public class Usuario {

	private int id;
	private String username;
	private String password;
	private Empleado empleado;
	public Usuario() {
		super();
	}
	public Usuario(int id, String username, String password, Empleado empleado) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.empleado = empleado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
}
