package com.pgrsoft.springbootdatademo.model.musica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DISCOS")
public class Disco {
	@Id
	private String isbn;
	
	private String titulo;
	@Column(name="DURACION")
	private Double minutos;
	private String estilo;

	@ManyToOne
	@JoinColumn(name="CODIGO_ARTISTA")
	private Artista artista;
	
	
	public Disco() {
		
	}
	public Disco(String isbn, String titulo, Double minutos, String estilo) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.minutos = minutos;
		this.estilo = estilo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getMinutos() {
		return minutos;
	}
	public void setMinutos(Double minutos) {
		this.minutos = minutos;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

}
