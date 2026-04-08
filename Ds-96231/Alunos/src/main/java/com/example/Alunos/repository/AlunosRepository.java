package com.example.Alunos.repository;

import com.example.Alunos.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<AlunoModel, Long> {
}
