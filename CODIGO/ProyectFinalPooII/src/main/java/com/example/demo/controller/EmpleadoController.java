package com.example.demo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Empleado;
import com.example.demo.service.EmpleadoService;

import ch.qos.logback.core.model.Model;
import jakarta.websocket.server.PathParam;

@Controller()
@RequestMapping("/empleadocontroller")
public class EmpleadoController {
	
private final Logger LOGGER = LoggerFactory.getLogger(EmpleadoController.class);
	
	@Autowired
	private EmpleadoService empleadoservice;
	
	@GetMapping("")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("Empleado/ListaEmpleado");
		mav.addObject("empleado", empleadoservice.findAll());
		return mav;
	}
	
	@GetMapping("/create")
	public String create(){
		return "Empleado/EmpleadoForm";
	}
	
	@PostMapping("/save")
	public String save(Empleado empleado){
		LOGGER.info("este es el objeto producto {}",empleado);
		empleadoservice.save(empleado);
		return "redirect:/empleadocontroller";
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable int id){
		Empleado emple = new Empleado();
		Optional<Empleado> optional = empleadoservice.get(id);
		emple = optional.get();
		LOGGER.info("Empleado buscado: {}",emple);
		ModelAndView mav = new ModelAndView("Empleado/EmpleadoEdit");
		mav.addObject("empleado",emple);
		return mav;
	}
	
	@PostMapping("/update")
	public String update(Empleado emple) {
		empleadoservice.update(emple);
		return "Empleado/EmpleadoForm";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		empleadoservice.delte(id);
		return "redirect:/empleadocontroller";
	}
	

}
