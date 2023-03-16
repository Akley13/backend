package br.com.developeracademy.backend.alunos.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tabela_aluno")
public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aluno_id")
    public Long id;
    @Column(name = "aluno_nome")
    public String nome;
    @Column(name = "aluno_genero")
    public String genero;
    @Column(name = "aluno_idade")
    public Integer idade;

}
