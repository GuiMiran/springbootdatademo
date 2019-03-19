package com.pgrsoft.springbootdatademo.model.onetomany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTAMENTOS")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 54541L;

	@Id
	private Integer codigo;
	
	private String nombre;
	
	public Departamento() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
}
