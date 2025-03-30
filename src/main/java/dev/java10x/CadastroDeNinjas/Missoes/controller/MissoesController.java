package dev.java10x.CadastroDeNinjas.Missoes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/missoes")
    public String boasVindas() {
        return "Bem vindo a Missões";
    }
}
