package com.musica.musicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.musica.musicas.model.Musicas;

public interface MusicasRepository extends JpaRepository<Musicas, Long>{
    Musicas findById(long Id);    
}