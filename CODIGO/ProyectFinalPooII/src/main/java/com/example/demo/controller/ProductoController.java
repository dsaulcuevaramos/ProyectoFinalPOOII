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

import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoService;

import ch.qos.logback.core.model.Model;
import jakarta.websocket.server.PathParam;

@Controller()
@RequestMapping("/productocontroller")
public class ProductoController {

	private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("Productos/ProductoList");
		mav.addObject("productos", productoService.findAll());
		return mav;
	}
	
	@GetMapping("/create")
	public String create(){
		return "Productos/ProductoForm";
	}
	
	@PostMapping("/save")
	public String save(Producto producto){
		LOGGER.info("este es el objeto producto {}",producto);
		productoService.save(producto);
		return "redirect:/productocontroller";
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable int id){
		Producto prod = new Producto();
		Optional<Producto> optional = productoService.get(id);
		prod = optional.get();
		LOGGER.info("Producto buscado: {}",prod);
		ModelAndView mav = new ModelAndView("Productos/ProductoEdit");
		mav.addObject("producto",prod);
		return mav;
	}
	
	
	@PostMapping("/update")
	public String update(Producto producto) {
		productoService.update(producto);
		return "Productos/ProductoForm";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		productoService.delte(id);
		return "redirect:/productocontroller";
	}
	
}
