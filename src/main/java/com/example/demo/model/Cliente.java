package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // just do it
@Entity// faz a classe virar uma entidade no banco
public class Cliente {
    @Id //faz o atributo abaixo virar a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o autoincremento
    private Long id;

    @Column(nullable = false) // impede a coluna de ser vazia
    private String nome;

    
}
