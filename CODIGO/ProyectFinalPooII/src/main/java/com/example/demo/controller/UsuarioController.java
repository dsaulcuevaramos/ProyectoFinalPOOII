package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.entity.Producto;
import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;

@Controller()
@RequestMapping("/usuariocontroller")
public class UsuarioController {

	private final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("Usuarios/UsuarioList");
		mav.addObject("usuarios", usuarioService.findAll());
		return mav;
	}
	
	@GetMapping("/create")
	public String create(){
		return "Usuarios/UsuarioForm";
	}
	
	@PostMapping("/save")
	public String save(Usuario usuario){
		LOGGER.info("este es el objeto producto {}",usuario);
		usuarioService.save(usuario);
		return "redirect:/usuariocontroller";
	}
	
	 @GetMapping("/edit/{id}")
	    public ModelAndView edit(@PathVariable int id) {
	    Usuario usuario = usuarioService.get(id).orElse(null);
	    LOGGER.info("Usuario buscado: {}",usuario);
	    ModelAndView mav = new ModelAndView("Usuarios/UsuarioForm");
	    mav.addObject("usuario", usuario);  // Se pasa el cliente para editar
	    return mav;
	}
	
	 @PostMapping("/update")
	public String update(Usuario usuario) {
		 usuarioService.update(usuario);
		return "Usuarios/UsuarioForm";
	}
	 
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		usuarioService.delte(id);
		return "redirect:/usuariocontroller";
	}
	
	
	@GetMapping("/home")
	public String Home() {
		return "Principal/Home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "Principal/Login";
	}
	
}
