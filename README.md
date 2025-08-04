Executando a Aplicação

  Navegue até a pasta raiz do projeto (onde está o arquivo pom.xml).

  Execute o seguinte comando para compilar e rodar a aplicação:

  bash
  mvn spring-boot:run  

(O Spring Boot iniciará um servidor embutido, geralmente no http://localhost:8080.)

Desenho de Solução:

  Arquitetura ultilizada: Arquitetura de três camadas

  Tecnologias:
    - Java 21
    - Spring Web
    - Spring Data JPA
    - Postgres SQL (Container)
    - WireMock (Container)
    - Docker
    - Lombok
  
  Descrição: 
    A aplicação se chama "Onde Vamos", ela ultiliza uma API externa chamada ViaCEP
    para buscar o cep e retornar as informacoes de localização do endereço relacionado,
    após isso é feito o armazenamento no banco de dados Postgres.
    A aplicacção também constitui uma requicição UPDATE para alterações das buscas 
    e uma requicição GET para trazer todos os dados salvos no banco.


  