package com.example.Revisao.controller;

import com.example.Revisao.model.FuncionarioModel;
import com.example.Revisao.repository.FuncionarioRepositorty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")

public class FuncionarioController {
    @Autowired
    private FuncionarioRepositorty repositorty;

    @GetMapping
    public List<FuncionarioModel> listarTodos() {
        return  repositorty.findAll();
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar (@RequestBody FuncionarioModel funcionario) {
        repositorty.save(funcionario);

        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}
