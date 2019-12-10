package gherkin.stepdefinitions;

import br.com.core.DriverManager;
import br.com.core.TakeScreenShot;
import br.com.seubarriga.Login;
import br.com.seubarriga.MenuPrincipal;
import cucumber.api.PendingException;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps extends DriverManager {

    private Login login;
    private MenuPrincipal menuPrincipal;

    @Dado("^eu estou na pagina de login$")
    public void euEstouNaPaginaDeLogin() throws Throwable {
        login = new Login(driver);
        login.EsperaTelaLogin();
        testScenario.embed(TakeScreenShot.getImageBytes(driver), "image/png");
    }

    @Quando("^eu logar com usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void euLogarComUsuarioESenha(String user, String pass) throws Throwable {
        login.logar(user, pass);
        testScenario.embed(TakeScreenShot.getImageBytes(driver), "image/png");
    }

    @Entao("sera apresentado menu principal")
    public void sera_apresentado_menu_principal() {
        menuPrincipal = new MenuPrincipal(driver);
        menuPrincipal.AguardarMenuPrincipal();
        testScenario.embed(TakeScreenShot.getImageBytes(driver), "image/png");
    }

    @io.cucumber.java.pt.Dado("acesso o menu Novo cadastro")
    public void acesso_o_menu_Novo_cadastro() {
        login.acessarCadastro();
    }


}
