package com.pgrsoft.springbootdatademo.model.musica;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="ARTISTAS")
public class Artista {

	@Id
	private Integer codigo;
	private String nombre;
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHANACIMIENTO")
	private Date fechaNacimiento;
	
	@OneToMany(mappedBy = "artista")
	private List<Disco> listDiscos;

	public List<Disco> getListDiscos() {
		return listDiscos;
	}

	public void setListDiscos(List<Disco> listDiscos) {
		this.listDiscos = listDiscos;
	}

	public Artista() {
	}

	public Artista(Integer codigo, String nombre, Date fechaNacimiento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Artista [codigo=" + codigo + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", listDiscos=" + listDiscos + "]";
	}

	

}
