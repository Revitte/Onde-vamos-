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
    - Docker
    - Lombok
  
  Descrição: 
    A aplicação que se chama "Onde Vamos" é uma API que faz requicições com CEP 
    para buscar e retornar as informações de localização do endereço relacionado,
    após isso é feito o armazenamento no banco de dados Postgres.


  