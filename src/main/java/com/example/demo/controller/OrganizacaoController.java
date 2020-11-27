package com.example.demo.controller;

import com.example.demo.model.Organizacao;
import com.example.demo.model.Pessoa;
import com.example.demo.service.OrganizacaoService;
import com.example.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizacao")
public class OrganizacaoController {


    @Autowired
    private OrganizacaoService service;

    @PostMapping
    @ResponseBody
    public Organizacao createPessoa(@RequestBody Organizacao request) {
        return service.cria(request);
    }

    @GetMapping
    public List<Organizacao> listar() {
        return service.findAll();
    }
}
