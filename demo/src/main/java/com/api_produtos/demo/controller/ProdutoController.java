package com.api_produtos.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_produtos.demo.model.DadosProduto;
import com.api_produtos.demo.model.Produto;
import com.api_produtos.demo.model.ProdutoRepository;

import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @Transactional
    @PostMapping
    public void inserirProduto(@RequestBody DadosProduto dados){
       repository.save(new Produto(dados));
    }
}
