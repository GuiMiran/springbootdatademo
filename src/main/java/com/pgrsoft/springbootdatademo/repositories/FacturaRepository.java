package com.pgrsoft.springbootdatademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrsoft.springbootdatademo.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer>{

}
