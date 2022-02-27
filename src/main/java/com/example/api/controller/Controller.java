package com.example.api.controller;

import com.example.api.model.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/primeiro")
public class Controller {

    @GetMapping
    public String requisicaoGet(){
        return "Hello wolrd";
    }

    @GetMapping(value = "/{nome}")
    public String requisicaoGetComParametro(@PathVariable String nome) {
        return String.format("olá, %s! Eu respondi à requisição!", nome);
    }

    @PostMapping
    public String requisicaoPost(@RequestBody Pessoa pessoas){
        return String.format("olá, %s! Eu respondi à requisição!", pessoas);
    }
}
