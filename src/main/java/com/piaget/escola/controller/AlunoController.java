package com.piaget.escola.controller;

import com.piaget.escola.Service.AlunoService;
import com.piaget.escola.models.Aluno;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/Aluno")
public class AlunoController() {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> listarAluno(){
        return service.buscarAluno();
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno){
        return service.SalvarNovoAluno(aluno);
    }
}
