package com.example.entity;

public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idvehiculo")
	private int idvehiculo;
	@Column(name ="placa")
	private String placa;
	@Column(name = "marca")
	private String marca;
	@Column(name = "modelo")
	private String modelo;
	@Column(name = "estado")
	private boolean estado;
	
	@Column(name="idcliente")
	private int idcliente;
    @ManyToMan(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idcliente")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Cliente cliente;
	
	
	public Vehiculo() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}
