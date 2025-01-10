package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
 
	@Autowired
	@Qualifier("productoservice")
	private ProductoService productoService;
	
	@GetMapping(value="/lista")
	public ModelAndView showAll() {
		ModelAndView mav = new ModelAndView("vista2");
		mav.addObject("producto", productoService.listAll());
		return mav;
	}
}
