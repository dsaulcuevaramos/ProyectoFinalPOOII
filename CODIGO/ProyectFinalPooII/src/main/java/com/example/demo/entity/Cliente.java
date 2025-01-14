package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	//propios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
    private int id;
	@Column(name = "nombres")
    private String nombres;
	@Column(name = "apellidos")
    private String apellidos;
	@Column(name = "dni")
    private String dni;
    
    //referenciados 
    @OneToMany(mappedBy = "cliente")
    private List<Vehiculo> vehiculo;
    
    @OneToMany(mappedBy = "cliente")
    private List<Venta> venta;

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

	public List<Vehiculo> getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(List<Vehiculo> vehiculo) {
		this.vehiculo = vehiculo;
	}

	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
}
