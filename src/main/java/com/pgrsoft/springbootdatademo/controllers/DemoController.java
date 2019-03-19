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
import com.pgrsoft.springbootdatademo.model.onetomany.Empleado;
import com.pgrsoft.springbootdatademo.repositories.AlumnoRepository;
import com.pgrsoft.springbootdatademo.repositories.ClienteRepository;
import com.pgrsoft.springbootdatademo.repositories.EmpleadoRepository;

@RestController
public class DemoController {
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@GetMapping("/empleados")
	public List<Empleado> empleados(){
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
	
	
	@RequestMapping(value="/alumnos/{id}")
	public Alumno getbyId(@PathVariable("id") Long id) {
		
		Optional<Alumno> optional = alumnoRepository.findById(id);
	
		Alumno alumno = optional.isPresent() ? optional.get(): null;
		
		System.out.println(alumno);
		return alumno;
	}

}
