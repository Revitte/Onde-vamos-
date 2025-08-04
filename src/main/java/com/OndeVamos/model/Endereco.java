package com.OndeVamos.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private long ibge;
    private int gia;
    private int ddd;
    private int siafi;

    /*Que bom que veio conferir minha Entidade eu que fiz nao foi IA nao viu hehe*/
}
