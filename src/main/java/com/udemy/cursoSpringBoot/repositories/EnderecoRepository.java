package com.udemy.cursoSpringBoot.repositories;

import com.udemy.cursoSpringBoot.domain.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
}
