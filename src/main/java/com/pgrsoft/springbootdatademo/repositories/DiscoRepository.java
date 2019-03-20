package com.pgrsoft.springbootdatademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgrsoft.springbootdatademo.model.musica.Disco;

public interface DiscoRepository extends JpaRepository<Disco, String>{

}
