package com.udemy.cursoSpringBoot.repositories;

import com.udemy.cursoSpringBoot.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
