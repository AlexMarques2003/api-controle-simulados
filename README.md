[![Build Status](https://app.travis-ci.com/AlexMarques2003/api-controle-simulados.svg?branch=main)](https://app.travis-ci.com/AlexMarques2003/api-controle-simulados)
# api-controle-simulados

Repositório do programa - Sistema Automatizado de Simulados

A API foi desenvolvida em Java(OpenJdk11), utilizando Spring Boot e IntelliJ IDEA 2021.3.2 (Community Edition)

# Principais tecnologias utilizadas:

- Maven para build e controle de dependências
- Spring Boot e OpenJdk 11
- Banco de Dados em memória H2
- Spring Data JPA
- Flyway - para criação e gerenciamento de versão do Banco de dados
- Swagger - para documentação das apis
- Integração contínua com TravisCI

# Como executar a aplicação.

Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git.

Passo a passo para instalação do maven em: https://dicasdejava.com.br/como-instalar-o-maven-no-windows/

# Baixando o projeto

1 - Abra o prompt de comando e acesse o diretório onde deseja baixar o projeto

2 - Execute o comando: git clone https://github.com/AlexMarques2003/api-controle-simulados.git ou via ssh: git@github.com:AlexMarques2003/api-controle-simulados.git

# Rodando o Programa

1 - Acesse o diretório raiz do projeto baixado: api-controle-simulados

2 - Rode o comando mvn clean package 

3 - Depois rode o comando spring-boot:run

# Endpoints

Acesse a documentação através do Sistema através do Swagger

Link do Swagger: http://localhost:8080/swagger-ui.html

#Importando o projeto para o Eclipse

Importando o projeto no Eclipse ou STS

No terminal, execute a seguinte operação:

mvn eclipse:eclipse
No Eclipse/STS, importe o projeto como projeto Maven.