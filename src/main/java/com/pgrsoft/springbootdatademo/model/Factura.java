package com.pgrsoft.springbootdatademo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="FACTURAS")
public class Factura implements Serializable {
	private static final long serialVersionUID = 658665L;

	@Id
	@TableGenerator(name = "FACTURA_GENERATOR", 
			table = "SECUENCIAS",
			pkColumnName = "SEQ_NAME",
			pkColumnValue = "PEDIDO_SEQ",
			valueColumnName = "SEQ_NUMBER",
			allocationSize = 10)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "FACTURA_GENERATOR")
	private Integer codigo;
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="CODIGO_CLIENTE")
	private Cliente cliente;
	
	@ElementCollection
	@OrderColumn(name="INDICE")
	@CollectionTable(name="LINEAS_PEDIDO", 
	joinColumns=@JoinColumn(name="ID_PEDIDO"))
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

		for (LineaFactura lineaFactura : lineasFactura) {
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
