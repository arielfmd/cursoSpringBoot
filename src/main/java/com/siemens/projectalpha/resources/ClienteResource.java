package com.siemens.projectalpha.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.siemens.projectalpha.domain.Cliente;
import com.siemens.projectalpha.dto.ClienteDTO;
import com.siemens.projectalpha.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> find(@PathVariable Integer id){
        
        Cliente obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Void> update(
            @Valid @RequestBody ClienteDTO objDto,
            @PathVariable Integer id) {
        
        Cliente obj = service.fromDTO(objDto);
        obj.setId(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> findAll() {
        List<Cliente> list = service.findAll();
        List<ClienteDTO> listDto = list.stream()
                .map(cat -> new ClienteDTO(cat)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value="/page")
    public ResponseEntity<Page<ClienteDTO>> findPage(
            @RequestParam(value="page", defaultValue="0") Integer page, 
            @RequestParam(value="size", defaultValue="24")Integer size, 
            @RequestParam(value="orderBy", defaultValue="nome")String orderBy, 
            @RequestParam(value="direction", defaultValue="ASC")String direction) {
        
        Page<Cliente> list = service.findPage(page, size, orderBy, direction);
        Page<ClienteDTO> listDto = list.map(cat -> new ClienteDTO(cat));
        return ResponseEntity.ok().body(listDto);
    }
}
