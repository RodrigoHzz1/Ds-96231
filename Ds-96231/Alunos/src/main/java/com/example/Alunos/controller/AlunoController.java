package com.example.Alunos.controller;


import com.example.Alunos.model.AlunoModel;
import com.example.Alunos.repository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Alunos")
public class AlunoController {
    @Autowired
    private AlunosRepository repository;

    @GetMapping
    public List<AlunoModel> listartodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<AlunoModel> salvar (@RequestBody AlunoModel aluno){
        repository.save(aluno);
        return  ResponseEntity.status(HttpStatus.CREATED).body(aluno);

    }

}
