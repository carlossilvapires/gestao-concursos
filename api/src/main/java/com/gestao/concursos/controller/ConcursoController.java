package com.gestao.concursos.controller;

import com.gestao.concursos.model.Concurso;
import com.gestao.concursos.repository.ConcursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // diz ao spring que isso é um endpoint da api
@RequestMapping("/api/concursos") // url base localhost
public class ConcursoController {

    @Autowired
    private ConcursoRepository repository;

    @GetMapping // ao fazer um get
    public List<Concurso> listarTodos() {
        return repository.findAll();
    }

    @PostMapping // enviar json para cadastrar concurso
    public Concurso cadastrar(@RequestBody Concurso concurso) {
        return repository.save(concurso);
    }
}
