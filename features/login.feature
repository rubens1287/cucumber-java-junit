# language: pt
# charset: UTF-8

  @Login
  Funcionalidade: Login
    Eu como usuário gostaria de poder acessar a aplicação atraves de um login seguro

  Cenario: CT001 - SB - Executar login valido
    Dado eu estou na pagina de login
    Quando eu logar com usuario "nathaly.brasiliano@gft.com" e senha "123@nath"
    Entao sera apresentado menu principal