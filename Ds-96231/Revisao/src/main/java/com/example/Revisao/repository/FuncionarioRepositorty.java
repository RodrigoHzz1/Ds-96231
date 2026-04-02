package com.example.Revisao.repository;

import com.example.Revisao.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepositorty extends JpaRepository <FuncionarioModel, Long> {


}
