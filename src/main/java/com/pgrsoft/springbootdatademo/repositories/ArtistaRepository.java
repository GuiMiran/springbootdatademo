package com.pgrsoft.springbootdatademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrsoft.springbootdatademo.model.musica.Artista;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {
}
