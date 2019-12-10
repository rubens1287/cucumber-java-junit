# language: pt
# charset: UTF-8

Funcionalidade: Cadastro
  Eu como usuário gostaria de poder cadastrar um novo cliente

  @cadastro
  Cenario: CT001 - SB - Cadastrar novo cliente
    Dado eu estou na pagina de login
    E acesso o menu Novo cadastro
    Quando eu cadastrar um cliente
    Entao sera apresentado a mensagem "Usuário inserido com sucesso"

