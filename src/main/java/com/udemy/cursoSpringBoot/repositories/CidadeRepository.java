package com.udemy.cursoSpringBoot.repositories;

import com.udemy.cursoSpringBoot.domain.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
}
