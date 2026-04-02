package com.example.Revisao.repository;

import com.example.Revisao.model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository <FornecedorModel, Long> {
}
