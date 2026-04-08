package com.example.Alunos.repository;

import com.example.Alunos.model.AlunoModel;
import com.example.Alunos.model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository <ProfessorModel,Long> {
}
