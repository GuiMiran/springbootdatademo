package com.pgrsoft.springbootdatademo.model.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="ASIGNATURAS")
public class Asignatura {

	@Id
	private Long codigo;
	private String nombre;
	
	@ManyToMany
	@JoinTable(name="ASIGNATURAS_ALUMNOS",
			  joinColumns= @JoinColumn(name="CODIGO_ASIGNATURA"),
			  inverseJoinColumns=@JoinColumn(name="ID_ALUMNO"))
	private List<Alumno> lisAlumno;
	
	public Asignatura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Alumno> getLisAlumno() {
		return lisAlumno;
	}
	public void setLisAlumno(List<Alumno> lisAlumno) {
		this.lisAlumno = lisAlumno;
	}
	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + ", lisAlumno=" + lisAlumno + "]";
	}
	
	
}
