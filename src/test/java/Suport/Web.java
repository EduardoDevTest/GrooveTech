package Suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public  static WebDriver CreateCrome(){
        //Abertura do Browser
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\EduardoJeferson\\Documents\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a pagina Movida
        navegador.get("https://www.movida.com.br/");

        return navegador;

    }

}
