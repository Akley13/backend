package br.com.developeracademy.backend.alunos.service;

import br.com.developeracademy.backend.alunos.entity.Aluno;
import br.com.developeracademy.backend.alunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Transactional
    public void insert(Aluno aluno){
        alunoRepository.save(aluno);
    }
    //Método para retornar todos os aluno existentes na tabela tabela_aluno
    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

}
