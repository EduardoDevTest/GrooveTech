package TestGroove;

import Suport.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class PaginaExecutarStepsTest {

    private WebDriver navegador;

    @Before
    public void SetUp(){
        navegador = Web.CreateCrome();

    }

    // Método  para execução de steps
    @Test
    public void testAdicionarUmainformacaoAdicionarDoUsuariotest(){
        new RealizarLoginTest(navegador)
                .ClickLogin()
                .typeLogin("27234359621")
                .typePassaword("030201")
                .typePlay();
    }
    @After
    public void DearDown(){
        //navegador.quit();


    }
}
