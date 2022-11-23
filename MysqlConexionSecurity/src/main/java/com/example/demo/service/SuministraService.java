package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Suministra;

@Service
public class SuministraService {

	private List<Suministra> suministros;
	
	public SuministraService() {
		
		suministros = new ArrayList<>();
		
	}
	
	public List<Suministra> list() {
		
		return suministros;
		
	}
	
	public Suministra find(int id) {
		
		for (Suministra suministra : suministros) {
			
			if (suministra.getId() == id) {
				
				return suministra;
				
			}
			
		}
		
		return null;
		
	}
	
	public Suministra save(Suministra suministra) {
		
		suministros.add(suministra);
		return suministra;
		
	}
	
	public Suministra update(int id, Suministra sum) {
		
		//No tengo ni idea de por que se define esta variable aqui
		int index = 0;
		
		for (Suministra suministra : suministros) {
			
			if (suministra.getId() == id) {
				
				sum.setId(id);
				suministros.set(index, sum);
				
			}
			
		}
		
		return sum;
		
	}
	
	public boolean delete(int id) {
		
		for (Suministra suministra : suministros) {
			
			if (suministra.getId() == id) {
				
				return suministros.remove(suministra);
				
			}
			
		}
		
		return false;
		
	}
	
}
