package com.siemens.projectalpha.repositories;

import com.siemens.projectalpha.domain.ItemPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{
    
}
