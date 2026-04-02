package com.example.EndPoint.repository;

import com.example.EndPoint.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository


public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {



}
