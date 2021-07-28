package com.siemens.projectalpha.repositories;

import com.siemens.projectalpha.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
