package com.pgrsoft.springbootdatademo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.springbootdatademo.model.Alumno;
import com.pgrsoft.springbootdatademo.model.Cliente;
import com.pgrsoft.springbootdatademo.model.manytomany.Asignatura;
import com.pgrsoft.springbootdatademo.model.musica.Artista;
import com.pgrsoft.springbootdatademo.model.musica.Disco;
import com.pgrsoft.springbootdatademo.model.onetomany.Empleado;
import com.pgrsoft.springbootdatademo.repositories.AlumnoRepository;
import com.pgrsoft.springbootdatademo.repositories.ArtistaRepository;
import com.pgrsoft.springbootdatademo.repositories.AsignaturaRepository;
import com.pgrsoft.springbootdatademo.repositories.ClienteRepository;
import com.pgrsoft.springbootdatademo.repositories.DiscoRepository;
import com.pgrsoft.springbootdatademo.repositories.EmpleadoRepository;

@RestController
public class DemoController {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Autowired
	private DiscoRepository discoRepository;

	@Autowired
	private ArtistaRepository artistaRepository;

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@GetMapping("/asignaturas")
	public List<Asignatura> getAsignatura() {
		return asignaturaRepository.findAll();
	}
	
	@GetMapping("/discos")
	public List<Disco> getDiscos() {
		return discoRepository.findAll();
	}

	@GetMapping("/artistas")
	public List<Artista> getArtistas() {
		List<Artista> lisArtistas = artistaRepository.findAll();
		System.out.println(lisArtistas);
		return lisArtistas;
	}

	@GetMapping("/empleados")
	public List<Empleado> empleados() {
		return empleadoRepository.findAll();
	}

	@GetMapping("/alumnos")
	public List<Alumno> prueba() {

		// me intereda "hacerme" con todos los alumnos
		List<Alumno> alumnos = alumnoRepository.findAll();
		return alumnos;
	}

	@GetMapping("/clientes")
	public List<Cliente> getClientes() {

		// me intereda "hacerme" con todos los alumnos
		List<Cliente> clientes = clienteRepository.findAll();
		return clientes;
	}

	@RequestMapping(value = "/alumnos/{id}")
	public Alumno getbyId(@PathVariable("id") Long id) {

		Optional<Alumno> optional = alumnoRepository.findById(id);

		Alumno alumno = optional.isPresent() ? optional.get() : null;

		System.out.println(alumno);
		return alumno;
	}

}
