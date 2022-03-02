package com.udemy.cursoSpringBoot.repositories;

import com.udemy.cursoSpringBoot.domain.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    
}
