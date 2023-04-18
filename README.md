# Respositório do desafio sobre Spring Data JPA

## Resumo

Repositório criado para conter a implementação do desafio proposto sobre Spring Data JPA.
O projeto faz parte da trilha **Ganhando Produtividade com Spring Framework** do bootcamp **Banco PAN Java Developers** da DIO


## Objetivos

- Definnir estrutura do projeto (pacotes específicos e suas entidades)
- Aplicar conceitos de mapeamento objeto relacional (ORM) usando o Spring Data JPA
- Implementar uma API Rest para uma academia digital fictícia
- Testar os serviços (endpoints) da API por meio do Postman

## Particularidades do projeto

- A API desenvolvida usa o banco de dados MySQL
- A versão do Java adotada é a 17 (LTS)
- A porta padrão do servidor web (tomcat) foi definida para a 8081 no application.properties
- Para a serialização e desserialização de dados do tipo LocalDate e LocalDateTime é empregado um conjunto de classes específicas (subpacote infra.jackson)

