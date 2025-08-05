package com.OndeVamos.service;

import com.OndeVamos.model.Endereco;
import com.OndeVamos.repository.EnderecoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {

    private static final String VIACEP_URL = "http://viacep.com.br/ws/{cep}/json/";

    private final RestTemplate restTemplate;
    private final EnderecoRepository enderecoRepository;

    public EnderecoService(RestTemplate restTemplate, EnderecoRepository enderecoRepository) {
        this.restTemplate = restTemplate;
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco buscarEnderecoPorCEP(String cep){

        String cepLimpo = cep.replaceAll("[^0-9]", "");

        String url = VIACEP_URL.replace("{cep}", cepLimpo);

        Endereco endereco = restTemplate.getForObject(url, Endereco.class);

        if (endereco != null){
            enderecoRepository.save(endereco);
        }

        return endereco;
    }
}
