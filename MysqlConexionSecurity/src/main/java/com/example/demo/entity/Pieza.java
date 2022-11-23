package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pieza")
public class Pieza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="codigo_pieza")
    private List<Suministra> suministro;

	public Pieza() {}

	public Pieza(int codigo, String nombre, List<Suministra> suministro) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministro = suministro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Suministra> getSuministro() {
		return suministro;
	}

	public void setSuministro(List<Suministra> suministro) {
		this.suministro = suministro;
	}	
	
}
