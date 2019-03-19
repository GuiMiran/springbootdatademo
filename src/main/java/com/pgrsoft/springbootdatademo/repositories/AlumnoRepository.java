package com.pgrsoft.springbootdatademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrsoft.springbootdatademo.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
