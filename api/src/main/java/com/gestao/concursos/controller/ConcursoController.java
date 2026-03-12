package com.gestao.concursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestao.concursos.model.Concurso;
import com.gestao.concursos.repository.ConcursoRepository;

@RestController // endpoint da api
@RequestMapping("/api/concursos") 
public class ConcursoController {

    @Autowired
    private ConcursoRepository repository;

    @GetMapping 
    public List<Concurso> listarTodos() {
        return repository.findAll();
    }

    @PostMapping 
    public Concurso cadastrar(@RequestBody Concurso concurso) {
        return repository.save(concurso);
    }
}
