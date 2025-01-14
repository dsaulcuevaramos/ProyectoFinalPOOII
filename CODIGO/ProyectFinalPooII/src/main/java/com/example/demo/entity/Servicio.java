package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio {

	//propios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idservicio")
	private int id;
	@Column(name = "descripcion")
	private String descipcion;
	@Column(name = "costo")
	private double costo;

	//foraneos
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idusuario")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Usuario usuario;
    
    //referenciados
    @OneToOne(mappedBy = "servicio")
    private ServicioDetalle servicioDetalle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescipcion() {
		return descipcion;
	}

	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ServicioDetalle getServicioDetalle() {
		return servicioDetalle;
	}

	public void setServicioDetalle(ServicioDetalle servicioDetalle) {
		this.servicioDetalle = servicioDetalle;
	}
    
    
	
}
