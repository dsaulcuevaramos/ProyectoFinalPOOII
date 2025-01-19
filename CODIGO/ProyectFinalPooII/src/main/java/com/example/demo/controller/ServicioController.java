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

import com.example.demo.entity.Servicio;
import com.example.demo.service.ServicioService;

import ch.qos.logback.core.model.Model;
import jakarta.websocket.server.PathParam;

@Controller
@RequestMapping("/serviciocontroller")
public class ServicioController {

private final Logger LOGGER = LoggerFactory.getLogger(ServicioController.class);
	
	@Autowired
	private ServicioService servicioService;
	
	@GetMapping("")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("Servicio/ListaServicio");
		mav.addObject("servicio", servicioService.findAll());
		return mav;
	}
	
	@GetMapping("/create")
	public String create(){
		return "Servicio/ServicioForm";
	}
	
	@PostMapping("/save")
	public String save(Servicio servi){
		LOGGER.info("este es el objeto servicio{}",servi);
		servicioService.save(servi);
		return "redirect:/serviciocontroller";
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable int id){
		Servicio serv = new Servicio();
		Optional<Servicio> optional = servicioService.get(id);
		serv = optional.get();
		LOGGER.info("Servicio buscado: {}",serv);
		ModelAndView mav = new ModelAndView("Servicio/ServicioEdit");
		mav.addObject("servicio",serv);
		return mav;
	}
	
	@PostMapping("/update")
	public String update(Servicio servi) {
		servicioService.update(servi);
		return "Productos/ProductoForm";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		servicioService.delete(id);
		return "redirect:/productocontroller";
	}
	
}

