package com.udemy.cursoSpringBoot.repositories;

import com.udemy.cursoSpringBoot.domain.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    
}
