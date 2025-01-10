package com.example.entity;

public class Servicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idservicio")
	private int idservicio;
	@Column(name = "descripcion")
	private String descipcion;
	@Column(name = "costo")
	private double costo;
	
	@Column(name="idusuario")
	private int idusuario;
    @ManyToMan(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idusuario")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Usuario usuario;
    
	public Servicio() {
		super();
	}
	
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
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
