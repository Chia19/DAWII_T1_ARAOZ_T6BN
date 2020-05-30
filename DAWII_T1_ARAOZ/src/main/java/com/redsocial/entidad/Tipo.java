package com.redsocial.entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo")
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codtipo")
	private int codTipo;
	
	@Column(name = "nombre")
	private String nombre;

	
	@OneToMany(mappedBy = "tipo")
	private List<Cliente> clientes;


	public int getCodTipo() {
		return codTipo;
	}


	public void setCodTipo(int codTipo) {
		this.codTipo = codTipo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
	
	
	
}