package com.siemens.projectalpha.services;

import java.util.Optional;

import com.siemens.projectalpha.domain.Pedido;
import com.siemens.projectalpha.repositories.PedidoRepository;
import com.siemens.projectalpha.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
