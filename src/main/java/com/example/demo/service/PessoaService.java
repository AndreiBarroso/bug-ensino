package com.example.demo.service;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa cria (Pessoa data) {
        return pessoaRepository.save(data);
    }

    public List<Pessoa> findAll () {
        return pessoaRepository.findAll();
    }
}
