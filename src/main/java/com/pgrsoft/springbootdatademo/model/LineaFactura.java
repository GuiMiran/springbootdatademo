package com.pgrsoft.springbootdatademo.model;

import java.io.Serializable;

public class LineaFactura implements Serializable {
	private static final long serialVersionUID = 49098325L;
	
	private Producto producto;
	private int cantidad;
	private double precio;

	public LineaFactura() {
		
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getTotal() {
		return cantidad * precio;
	}

	@Override
	public String toString() {
		return "LineaFactura [producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}

}
