package com.pgrsoft.springbootdatademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrsoft.springbootdatademo.model.onetomany.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {

}
