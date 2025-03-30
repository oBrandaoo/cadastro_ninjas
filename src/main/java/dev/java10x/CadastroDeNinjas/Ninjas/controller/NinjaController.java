package dev.java10x.CadastroDeNinjas.Ninjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Bem vindo a API de Cadastro de Ninjas";
    }
}
