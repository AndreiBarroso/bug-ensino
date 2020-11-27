package com.example.demo.controller;

import com.example.demo.dto.PessoaRequest;
import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {


    @Autowired
    private PessoaService service;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseBody
    public Pessoa createPessoa(@RequestBody PessoaRequest request) {
        Pessoa pessoa = modelMapper.map(request, Pessoa.class);
        Pessoa cria = service.cria(pessoa);
        return service.cria(cria);
    }

    @GetMapping
    public List<Pessoa> listar() {
        return service.findAll();
    }
}
