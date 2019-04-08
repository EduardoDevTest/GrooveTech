package TestGroove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealizarLoginTest {
    private WebDriver navegador;

    public RealizarLoginTest(WebDriver navegador) {
        this.navegador = navegador;
    }

    public FormularioLoginTest ClickLogin(){

        navegador.findElement(By.linkText("LOGIN")).click();


        return new FormularioLoginTest(navegador);


    }
}
