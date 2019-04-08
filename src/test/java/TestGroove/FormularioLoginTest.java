package TestGroove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioLoginTest {
    private WebDriver navegador;

    public FormularioLoginTest(WebDriver navegador) {
        this.navegador = navegador;
    }

    public FormularioLoginTest typeLogin(String login) {
        navegador.findElement(By.id("form-login")).findElement(By.name("cpf")).sendKeys(login);


        return this;


    }

    public FormularioLoginTest typePassaword(String passaword) {
        navegador.findElement(By.id("form-login")).findElement(By.name("senha")).sendKeys(passaword);


        return this;

    }

    public PaginaMovidaTest typePlay() {
        navegador.findElement(By.id("login-button")).click();

        return new PaginaMovidaTest(navegador);

    }

}


