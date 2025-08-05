package com.OndeVamos.serviceTest;

import com.OndeVamos.model.Endereco;
import com.OndeVamos.service.EnderecoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EnderecoServiceTests {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private EnderecoService enderecoService;

    private Endereco enderecoMock;

    @BeforeEach
    void setUp(){
        enderecoMock = new Endereco();
        enderecoMock.setCep("05757-110");
        enderecoMock.setLogradouro("Rua Clementino Cunha");
        enderecoMock.setComplemento("");
        enderecoMock.setUnidade("");
        enderecoMock.setBairro("Pirajussara");
        enderecoMock.setLocalidade("São Paulo");
        enderecoMock.setUf("SP");
        enderecoMock.setEstado("São Paulo");
        enderecoMock.setRegiao("Sudeste");
        enderecoMock.setIbge(3440209);
        enderecoMock.setGia(3015);
        enderecoMock.setDdd(13);
        enderecoMock.setSiafi(8077);
    }

    @Test
    void buscarEnderecoPorCEPRetornaEnderecoCorreto(){

        String cep = "05757-110";
        String urlEsperada = "http://viacep.com.br/ws/05757110/json/";

        when(restTemplate.getForObject(urlEsperada, Endereco.class)).thenReturn(enderecoMock);

        Endereco resultado = enderecoService.buscarEnderecoPorCEP(cep);

        assertEquals(enderecoMock, resultado);
    }
}
