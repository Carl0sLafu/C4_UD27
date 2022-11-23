package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Pieza;

@Service
public class PiezaService {

	private List<Pieza> piezas;
	
	public PiezaService() {
		
		piezas = new ArrayList<>();
		
	}
	
	public List<Pieza> list() {
		
		return piezas;
		
	}
	
	public Pieza find(int cod) {
		
		for (Pieza pieza : piezas) {
			
			if (pieza.getCodigo() == cod) {
				
				return pieza;
				
			}
			
		}
		
		return null;
		
	}
	
	public Pieza save(Pieza pieza) {
		
		piezas.add(pieza);
		return pieza;
		
	}
	
	public Pieza update(int cod, Pieza pzz) {
		
		//No tengo ni idea de por que se define esta variable aqui
		int index = 0;
		
		for (Pieza pieza : piezas) {
			
			if (pieza.getCodigo() == cod) {
				
				pzz.setCodigo(cod);
				piezas.set(index, pzz);
				
			}
			
		}
		
		return pzz;
		
	}
	
	public boolean delete(int cod) {
		
		for (Pieza pieza : piezas) {
			
			if (pieza.getCodigo() == cod) {
				
				return piezas.remove(pieza);
				
			}
			
		}
		
		return false;
		
	}
	
}
