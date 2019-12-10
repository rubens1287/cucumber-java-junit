$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "    Eu como usuário gostaria de poder acessar a aplicação atraves de um login seguro",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "CT001 - SB - Executar login valido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu estou na pagina de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.euEstouNaPaginaDeLogin()"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu logar com usuario \"nathaly.brasiliano@gft.com\" e senha \"123@nath\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.euLogarComUsuarioESenha(String,String)"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sera apresentado menu principal",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.sera_apresentado_menu_principal()"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});