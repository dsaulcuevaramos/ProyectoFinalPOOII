package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.EmpleadoService;
import com.example.service.UsuarioService;

@Controller
@RequestMapping("/empleado")

public class EmpleadoController {

		@Autowired
		@Qualifier("empleadoservice")
		private EmpleadoService empleadoService;
		
		@GetMapping(value="/lista")
		public ModelAndView showAll() {
			ModelAndView mav = new ModelAndView("vista1");
			mav.addObject("empleados", empleadoService.listAll());
			return mav;
		}
		
}
