package com.example.Alunos.controller;

import com.example.Alunos.model.AlunoModel;
import com.example.Alunos.model.ProfessorModel;
import com.example.Alunos.repository.AlunosRepository;
import com.example.Alunos.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    private ProfessorRepository repository;

    @GetMapping
    public List<ProfessorModel> listartodos(){
        return repository.findAll();

    }

    @PostMapping
    ResponseEntity<ProfessorModel> Salvar (@RequestBody ProfessorModel professor){
        repository.save(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body(professor);

    }
}
