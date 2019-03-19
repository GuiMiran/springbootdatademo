package com.pgrsoft.springbootdatademo.model;

import java.io.Serializable;

public class Producto implements Serializable {
	private static final long serialVersionUID = -36441L;
	
	private Integer codigo;
	private String nombre;
	private double precio;
	
	public Producto() {
		
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
