package br.com.seubarriga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    private WebDriver driver;
    private By txtEmail = By.id("email");
    private By txtSenha = By.id("senha");
    private By btnEntrar = By.xpath("//button[text()='Entrar']");
    private By lnkCadastro = By.linkText("Novo usuário?");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * metodo que executa o login na aplicacao
     *
     * @param email
     * @param senha
     */
    public void logar (String email, String senha){
        driver.findElement(txtEmail).sendKeys(email);
        driver.findElement(txtSenha).sendKeys(senha);
        driver.findElement(btnEntrar).click();
    }


    /**
     * o metodo abaixo aguarda o carregamento da pagina login
     */
    public void EsperaTelaLogin() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(txtEmail));
    }

    /**
     * o metodo abaixo acessa menu cadastro
     */
    public void acessarCadastro(){
        driver.findElement(lnkCadastro).click();
    }

}
