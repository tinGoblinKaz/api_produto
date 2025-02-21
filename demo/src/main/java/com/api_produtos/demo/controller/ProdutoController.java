package com.api_produtos.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_produtos.demo.model.DadosProduto;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @PostMapping
    public void inserirProduto(@RequestBody DadosProduto dados){
        System.out.println(dados);
    }
}
