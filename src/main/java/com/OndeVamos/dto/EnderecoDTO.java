package com.OndeVamos.dto;

public record EnderecoDTO(
        String cep,
        String logradouro,
        String complemento,
        String unidade,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao,
        long ibge,
        int gia,
        int ddd,
        int siafi
) {}
