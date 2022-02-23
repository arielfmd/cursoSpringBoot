package com.siemens.projectalpha.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.siemens.projectalpha.domain.Categoria;
import com.siemens.projectalpha.repositories.CategoriaRepository;
import com.siemens.projectalpha.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                    "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
    
    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Categoria update(Categoria obj) {
        find(obj.getId());
        return repo.save(obj);
    }
}
