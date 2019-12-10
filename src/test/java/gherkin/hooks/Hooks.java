package gherkin.hooks;

import br.com.core.DriverManager;
import br.com.core.TakeScreenShot;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;



public class Hooks extends DriverManager {

    @Before
    public void before(Scenario scenario){
        testScenario = scenario;
         /*
        imforma onde está o driver chromedriver para o selenium
         */
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        /*
           cria navegador do tipo chrome
         */
        driver = new ChromeDriver();
        /*
        maximiza a tela
         */
        driver.manage().window().maximize();

        driver.get("https://seubarriga.wcaquino.me/");
    }

    @After
    public void after(){
          /*
        fechar navegador
         */
        driver.close();
    }

}
