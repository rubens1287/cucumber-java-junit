package br.com.seubarriga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPrincipal {

    WebDriver driver;
    private By lnkSair = By.xpath("//a[text()='Sair']");

    public MenuPrincipal(WebDriver driver) {
        this.driver = driver;

          }

    public void AguardarMenuPrincipal() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(lnkSair));
    }
}
