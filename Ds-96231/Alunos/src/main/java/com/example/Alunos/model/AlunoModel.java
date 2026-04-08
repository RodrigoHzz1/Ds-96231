package com.example.Alunos.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AlunoModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String r_a;
    private String email;
    private String telofone;


    public AlunoModel() {
    }

    public AlunoModel(Long id, String nome, String r_a, String email, String telofone) {
        this.id = id;
        this.nome = nome;
        this.r_a = r_a;
        this.email = email;
        this.telofone = telofone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getR_a() {
        return r_a;
    }

    public void setR_a(String r_a) {
        this.r_a = r_a;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelofone() {
        return telofone;
    }

    public void setTelofone(String telofone) {
        this.telofone = telofone;
    }
}