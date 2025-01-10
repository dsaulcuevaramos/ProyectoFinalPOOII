package com.example.entity;

public class Factura {
    private int id;
    private String fecha;
    private int idCliente;

    public Factura(){
        super();
    }

    public Factura(int id, String fecha, int idCliente) {
        super();
        this.id = id;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { 
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {        
        this.fecha = fecha;                    
    }    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {        
        this.idCliente = idCliente;                    
    }

}