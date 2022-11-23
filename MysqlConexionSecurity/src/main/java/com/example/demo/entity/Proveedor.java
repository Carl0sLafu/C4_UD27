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
@Table(name="proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="id_proveedor")
    private List<Suministra> suministro;
	
	public Proveedor() {}

	public Proveedor(int id, String nombre, List<Suministra> suministro) {
		this.id = id;
		this.nombre = nombre;
		this.suministro = suministro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
