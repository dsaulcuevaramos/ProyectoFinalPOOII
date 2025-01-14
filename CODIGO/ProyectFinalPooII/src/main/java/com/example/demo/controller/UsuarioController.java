package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/usuariocontroller")
public class UsuarioController {

	@GetMapping("/template")
	public String listar() {
		return "Principal/Template";
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
