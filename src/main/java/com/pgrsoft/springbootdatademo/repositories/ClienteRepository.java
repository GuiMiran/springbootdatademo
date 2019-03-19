package com.pgrsoft.springbootdatademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrsoft.springbootdatademo.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
