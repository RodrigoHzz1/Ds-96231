package com.example.EndPoint.controller;

import com.example.EndPoint.model.ProdutoModel;
import com.example.EndPoint.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;

        @GetMapping
        public List<ProdutoModel> listarTodos() {
            return repository.findAll();
        }

        @PostMapping
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto)
}
