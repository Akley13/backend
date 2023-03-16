package br.com.developeracademy.backend.disciplinas.controller;

import br.com.developeracademy.backend.disciplinas.entity.Disciplinas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/disciplinas")
public class DisciplinaController {

    public ResponseEntity<String> insert(@RequestBody Disciplinas disciplinas){
        return ResponseEntity.ok().body("Ainda não implementado");
    }

}
