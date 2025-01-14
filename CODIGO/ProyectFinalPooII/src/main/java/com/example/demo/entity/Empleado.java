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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempleado")
	private int id;
	private String nombres;
	private String apellidos;	
	private String dni;
	private String telefono;	
	private String correo;
	private boolean estado;
	
	//foraneos
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idrol")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Rol rol;
	
	//referenciado
	@OneToOne(mappedBy = "empleado")
	private Usuario usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombres;
	}

	public void setNombre(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellidos;
	}

	public void setApellido(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
	
}



