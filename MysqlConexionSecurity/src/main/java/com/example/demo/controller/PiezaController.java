package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pieza;
import com.example.demo.service.PiezaService;

@RestController
@RequestMapping("/pieza")
public class PiezaController {
	
	private final PiezaService service;
	
	public PiezaController (PiezaService service) {
		
		this.service = service;
		
	}
	
	@GetMapping
	public Iterable<Pieza> list() {
		
		return service.list();
		
	}
	
	@GetMapping("/{cod}")
	public Pieza find(@PathVariable("cod") int cod) {
		
		return service.find(cod);
		
	}
	
	@PostMapping
	public Pieza create(@RequestBody Pieza pieza) {
		
		return service.save(pieza);
		
	}
	
	@PutMapping("/{cod}")
	public Pieza update(@PathVariable("cod") int cod, @RequestBody Pieza pieza) {
		
		return service.update(cod, pieza);
		
	}
	
	@DeleteMapping("/{cod}")
	public boolean delete(@PathVariable("cod") int cod) {
		
		return service.delete(cod);
		
	}

}
