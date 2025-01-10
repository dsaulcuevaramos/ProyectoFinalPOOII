package com.example.entity;

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private int idusuario;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	
	@Column(name="idempleado")
	private int idempleado;
    @ManyToMan(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idempleado")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Empleado empleado;
	
	public Usuario() {
		super();
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
