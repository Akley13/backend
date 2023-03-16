package br.com.developeracademy.backend.aluno.controller;

import br.com.developeracademy.backend.alunos.entity.Aluno;
import br.com.developeracademy.backend.alunos.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/alunos")
public class AlunoController {
    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody Aluno aluno){
        alunoService.insert(aluno);
        return ResponseEntity.ok().body("Registro gravado com sucesso");
    }
    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        List<Aluno> alunos = alunoService.findAll();
        return ResponseEntity.ok().body(alunos);
    }


}
