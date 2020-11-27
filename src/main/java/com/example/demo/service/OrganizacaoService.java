package com.example.demo.service;

import com.example.demo.model.Organizacao;
import com.example.demo.repository.OrganizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizacaoService {

    @Autowired
    private OrganizacaoRepository repository;

    public Organizacao cria (Organizacao data) {
        return repository.save(data);
    }

    public List<Organizacao> findAll () {
        return repository.findAll();
    }
}
