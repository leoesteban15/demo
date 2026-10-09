package com.ejemplo.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ejemplo.demo.model.Estudiante;
import com.ejemplo.demo.service.EstudianteService;

@RestController
@RequestMapping("api/estudiantes")
public class EstudianteController {
	
	private final EstudianteService service;
	
	public EstudianteController(EstudianteService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Estudiante> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Estudiante guardar(@RequestBody Estudiante estudiante){
		return service.guardar(estudiante);
	}
}
