package br.com.developeracademy.backend.disciplinas.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tabela_disciplina")
public class Disciplinas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "disciplina_id")
    public Long id;
    @Column(name = "disciplina_nome")
    public String nome;

}
