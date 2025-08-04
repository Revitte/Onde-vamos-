package com.OndeVamos.service;

import com.OndeVamos.model.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceViaCEP {

    private static final String VIACEP_URL = "http://viacep.com.br/ws/{cep}/json/";

    private final RestTemplate restTemplate;

    public ServiceViaCEP(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Endereco buscarEnderecoPorCEP(String cep){

        String cepLimpo = cep.replaceAll("[^0-9]", "");

        String url = VIACEP_URL.replace("{cep}", cepLimpo);

        return restTemplate.getForObject(url, Endereco.class);
    }
}
