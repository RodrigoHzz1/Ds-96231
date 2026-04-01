package com.example.EndPoint.controller;


import com.example.EndPoint.model.ClienteModel;
import com.example.EndPoint.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteModel> listar() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel cliente) {
        repository.save(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }
}
