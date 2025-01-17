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

@Controller()
@RequestMapping("clientecontroller")
public class ClienteController {

private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("Clientes/ListaClientes");
		mav.addObject("clientes", clienteService.findAll());
		return mav;
	}
	
	@GetMapping("/create")
	public String create() {
	    return "Clientes/ClienteForm";  // El formulario estará vacío para la creación
	}
	
	@PostMapping("/save")
	public String save(Cliente cliente){
		LOGGER.info("este es el objeto cliente {}",cliente);
		clienteService.save(cliente);
		return "redirect:/clientecontroller";
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable int id) {
	    Cliente cliente = clienteService.get(id).orElse(null);
	    LOGGER.info("Cliente encontrado: {}", cliente);
	    ModelAndView mav = new ModelAndView("Clientes/ClienteForm");
	    mav.addObject("cliente", cliente);  // Se pasa el cliente para editar
	    return mav;
	}
	
	@PostMapping("/update")
	public String update(Cliente cliente) {
		LOGGER.info("este es el objeto cliente {}",cliente);
		clienteService.update(cliente);
		return "Clientes/ClienteForm";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		clienteService.delte(id);
		return "redirect:/clientecontroller";
	}
	
}

