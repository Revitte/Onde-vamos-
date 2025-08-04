package com.OndeVamos.controller;

import com.OndeVamos.model.Endereco;
import com.OndeVamos.service.EnderecoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cep")
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService){
        this.enderecoService = enderecoService;
    }

    @GetMapping("/{cep}")
    public Endereco buscaCep(@PathVariable String cep){
        Endereco endereco = enderecoService.buscarEnderecoPorCEP(cep);

        return endereco;
    }
}
