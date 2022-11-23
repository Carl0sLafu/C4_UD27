package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Proveedor;
import com.example.demo.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

	private final ProveedorService service;
	
	public ProveedorController(ProveedorService service) {
		
		this.service = service;
		
	}
	
	@GetMapping
	public Iterable<Proveedor> list() {
		
		return service.list();
		
	}
	
	@GetMapping("/{id}")
	public Proveedor find(@PathVariable("id") int id) {
		
		return service.find(id);
		
	}
	
	@PostMapping
	public Proveedor create(@RequestBody Proveedor proveedor) {
		
		return service.save(proveedor);
		
	}
	
	@PutMapping("/{id}")
	public Proveedor update(@PathVariable("id") int id, @RequestBody Proveedor proveedor) {
		
		return service.update(id, proveedor);
		
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable("id") int id) {
		
		return service.delete(id);
		
	}
	
}
