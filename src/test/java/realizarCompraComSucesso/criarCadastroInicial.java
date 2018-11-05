package realizarCompraComSucesso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.Suporte.emailRandomico;

public class criarCadastroInicial {
    private WebDriver navegador;

    public criarCadastroInicial(WebDriver navegador) {
        this.navegador = navegador;

    }

    public criarCadastroCompleto criarCadastroInicial() {
        //4Digitar e-mail no campo com id
        navegador.findElement(By.id("email_create")).sendKeys(emailRandomico.getSaltString()+ "@teste.com.br");

        //4Clicar no botão para submeter a conta
        navegador.findElement(By.id("SubmitCreate")).click();

        return new criarCadastroCompleto(navegador);
    }

}





