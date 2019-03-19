package com.pgrsoft.springbootdatademo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Factura implements Serializable {
	private static final long serialVersionUID = 658665L;
	
	private Integer codigo;
	private Date fecha;
	private Cliente cliente;
	private List<LineaFactura> lineasFactura;

	public Factura() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<LineaFactura> getLineasFactura() {
		return lineasFactura;
	}

	public void setLineasFactura(List<LineaFactura> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}
	
	public double getBaseImponible() {
		
		double baseImponible = 0.0;
		
		for (LineaFactura lineaFactura: lineasFactura) {
			baseImponible += lineaFactura.getTotal();
		}
		
		return baseImponible;
	}
	
	public double getIva() {
		return getBaseImponible() * 0.21;
	}
	
	public double getTotalFactura() {
		return getBaseImponible() * 1.21;
	}

}
