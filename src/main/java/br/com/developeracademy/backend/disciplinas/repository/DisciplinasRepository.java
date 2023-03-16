package br.com.developeracademy.backend.disciplinas.repository;

import br.com.developeracademy.backend.disciplinas.entity.Disciplinas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinasRepository extends JpaRepository<Disciplinas,Long> {
}
