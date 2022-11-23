package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Suministra;
import com.example.demo.service.SuministraService;

@RestController
@RequestMapping("/suministra")
public class SuministraController {

	private SuministraService service;
	
	public SuministraController(SuministraService service) {
		
		this.service = service;
		
	}
	
	@GetMapping
	public Iterable<Suministra> list() {
		
		return service.list();
		
	}
	
	@GetMapping("/{id}")
	public Suministra find(@PathVariable("id") int id) {
		
		return service.find(id);
		
	}
	
	@PostMapping
	public Suministra create(@RequestBody Suministra suministra) {
		
		return service.save(suministra);
		
	}
	
	@PutMapping("/{id}")
	public Suministra update(@PathVariable("id") int id, @RequestBody Suministra suministra) {
		
		return service.update(id, suministra);
		
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable("id") int id) {
		
		return service.delete(id);
		
	}
	
}
