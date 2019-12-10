package gherkin.stepdefinitions;

import br.com.core.DriverManager;
import br.com.seubarriga.Cadastro;
import com.github.javafaker.Faker;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.util.Locale;

public class CadastroSteps extends DriverManager {

    private Cadastro cadastro = new Cadastro(driver);

    @Quando("eu cadastrar um cliente")
    public void eu_cadastrar_um_cliente() {
        Faker faker = new Faker(new Locale("pt-BR"));

        String nome = faker.harryPotter().character();
        String email = (faker.harryPotter().character().replace(" ", "") + "@gft.com");
        String senha = "123@nath";
        cadastro.cadastrar(nome, email, senha);
    }

    @Entao("sera apresentado a mensagem {string}")
    public void sera_apresentado_a_mensagem(String string) {

        cadastro.validarMensagemSucesso("Usuário inserido com sucesso");
    }

}
