package br.com.seubarriga;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cadastro {

    private WebDriver driver;
    private By txtNome = By.id("nome");
    private By txtEmail = By.id("email");
    private By txtSenha = By.id("senha");
    private By btnEntrar = By.xpath("//input[@value='Cadastrar']");
    private By msgSucesso = By.xpath("//div[contains(text(), 'Usuário inserido com sucesso')]");

    public Cadastro (WebDriver driver) {
        this.driver = driver;
    }


    /**
     * o metodo abaixo aguarda o carregamento da pagina login
     */
    public void esperaTelaCadastro() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(txtNome));
    }
    /**
     * metodo que executa o login na aplicacao
     * @param nome
     * @param email
     * @param senha
     */
    public void cadastrar (String nome, String email, String senha){
        esperaTelaCadastro();
        driver.findElement(txtNome).sendKeys(nome);
        driver.findElement(txtEmail).sendKeys(email);
        driver.findElement(txtSenha).sendKeys(senha);
        driver.findElement(btnEntrar).click();

    }

    @Deprecated
    public void validarMensagemSucesso(){
       if(!driver.findElement(msgSucesso).isDisplayed()){
           Assert.fail("Mensgame de sucesso não apresentada!");
       }
    }

    public void validarMensagemSucesso(String msg){
        new WebDriverWait(driver,30)
                .until(ExpectedConditions.textToBePresentInElement(driver.findElement(msgSucesso),msg));
    }


}
