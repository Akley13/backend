package br.com.developeracademy.backend.alunos.repository;

import br.com.developeracademy.backend.alunos.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
