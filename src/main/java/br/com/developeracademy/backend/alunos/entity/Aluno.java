package br.com.developeracademy.backend.alunos.entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tabela_aluno")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aluno_id")
}
