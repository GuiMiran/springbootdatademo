package com.pgrsoft.springbootdatademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrsoft.springbootdatademo.model.manytomany.Asignatura;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long>  {

}
