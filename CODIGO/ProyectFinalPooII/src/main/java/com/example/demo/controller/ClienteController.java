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

import com.example.demo.entity.Cliente;
import com.example.demo.service.ClienteService;

@Controller
@RequestMapping("/clientecontroller")
public class ClienteController {

private final Logger LOGGER = LoggerFactory.getLogger(ClienteController.class);
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("Clientes/ClienteList");
		mav.addObject("clientes", clienteService.findAll());
		return mav;
	}
	
	@PostMapping("/save")
	public String save(Cliente cliente){
		LOGGER.info("este es el objeto cliente {}",cliente);
		clienteService.save(cliente);
		return "redirect:/clientecontroller";
	}
	
	@PostMapping("/update")
	public String update(Cliente cliente) {
		LOGGER.info("este es el objeto cliente {}",cliente);
		clienteService.update(cliente);
		return "Clientes/ClienteForm";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		clienteService.delete(id);
		return "redirect:/clientecontroller";
	}
	
}

