package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Proveedor;

@Service
public class ProveedorService {

	private List<Proveedor> proveedores;
	
	public ProveedorService() {
		
		proveedores = new ArrayList<>();
		
	}
	
	public List<Proveedor> list() {
		
		return proveedores;
		
	}
	
	public Proveedor find (int id) {
		
		for (Proveedor proveedor : proveedores) {
			
			if (proveedor.getId() == id) {
				
				return proveedor;
				
			}
			
		}
		
		return null;
		
	}
	
	public Proveedor save(Proveedor proveedor) {
		
		proveedores.add(proveedor);
		return proveedor;
		
	}
	
	public Proveedor update(int id, Proveedor pro) {
		
		//No tengo ni idea de por que se define esta variable aqui
		int index = 0;
		
		for (Proveedor proveedor : proveedores) {
			
			if (proveedor.getId() == id) {
				
				pro.setId(id);
				proveedores.set(index, pro);
				
			}
			
		}
		
		return pro;
		
	}
	
	public boolean delete(int id) {
		
		for (Proveedor proveedor : proveedores) {
			
			if (proveedor.getId() == id) {
				
				return proveedores.remove(proveedor);
				
			}
			
		}
		
		return false;
		
	}
	
}
