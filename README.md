# cpf-random
Retorna se CPF é ABLE ou NOT_ABLE

## Para executar a API localmente
Requisitos mínimos: 
> Maven, Java 17.</br> 

Baixe o projeto e navegue até a pasta root do projeto ".\cpf-random" pelo terminal.

Execute o comando: 

> compilar: ` mvn spring-boot:run `</br>

A api ficará disponivel em: 

>http://localhost:8081</br>

#### Verificar CPF: 

**GET** `http://localhost:8081/users/{cpf}`

Apenas retorna uma String com: 

**UNABLE_TO_VOTE** ou **ABLE_TO_VOTE**
