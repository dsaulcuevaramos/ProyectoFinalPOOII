package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.ServicioDetalle;

public interface ServiciodetalleService {

	public List<ServicioDetalle> findAll();
	public ServicioDetalle save (ServicioDetalle rol);
	public Optional<ServicioDetalle> get(int id);
	public void update(ServicioDetalle rol);
	public void delte(int id);
}
