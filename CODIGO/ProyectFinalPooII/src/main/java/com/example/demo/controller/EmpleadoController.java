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
import com.example.demo.entity.Rol;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.RolService;

@Controller
@RequestMapping("empleadocontroller")
public class EmpleadoController {
    
    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private EmpleadoService empleadoService;
	@Autowired
	private RolService rolService;
    
	@GetMapping("")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("Empleados/EmpleadoList");
		mav.addObject("empleados", empleadoService.findAll());
		mav.addObject("roles",rolService.findAll());
		return mav;
	}
	

	@GetMapping("/create")
	public ModelAndView create(){
		ModelAndView mav = new ModelAndView("Empleados/EmpleadoForm");
		mav.addObject("roles",rolService.findAll());
		System.out.println(rolService.findAll());
		return mav;
	}
	
	@PostMapping("/save")
	public String save(Empleado empleado, Rol rol){
			LOGGER.info("este es el objeto producto {}",empleado);
		empleado.setRol(rol);
		empleadoService.save(empleado);
		return "redirect:/empleadocontroller";
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable int id){
		Empleado emple = new Empleado();
		Optional<Empleado> optional = empleadoService.get(id);
		emple = optional.get();
		LOGGER.info("Empleado buscado: {}",emple);
		ModelAndView mav = new ModelAndView("Empleados/EmpleadoEdit");
		mav.addObject("empleado",emple);
		return mav;
	}
	
	@PostMapping("/update")
	public String update(Empleado emple) {
		empleadoService.update(emple);
		return "Empleados/EmpleadoForm";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		empleadoService.delete(id);
		return "redirect:/empleadocontroller";
	}
}
