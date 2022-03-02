package com.udemy.cursoSpringBoot.repositories;

import com.udemy.cursoSpringBoot.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
