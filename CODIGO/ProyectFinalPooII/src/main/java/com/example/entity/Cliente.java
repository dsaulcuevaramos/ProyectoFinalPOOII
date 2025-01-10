package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Cliente{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
    private int idcliente;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "apellidos")
    private String apellido;
	@Column(name = "dni")
    private String dni;
    

    public Cliente(){
        super();   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }       

    public String getNombre() {        
        return nombre;
    }

    public void setNombre(String nombre) {        
        this.nombre = nombre;                    
    }

    public String getApellido() {        
        return apellido;
    }

    public void setApellido(String apellido) {        
        this.apellido = apellido;                    
    }

    public String getDni() {        
        return dni;
    }

    public void setDni(String dni) {        
        this.dni = dni;                    
    }

}

