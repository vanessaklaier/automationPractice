package realizarCompraComSucesso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class aceitarTermos {
    private WebDriver navegador;

    public aceitarTermos(WebDriver navegador) {
        this.navegador = navegador;
    }

    public selecionarFormaDePagamento aceitarTermos() {

        //7Clicar no checklist dos termos
        navegador.findElement(By.id("cgv")).click();

        //7Clicar no botão com css para prosseguir
        navegador.findElement(By.cssSelector(".cart_navigation .button-medium span")).click();

        return new selecionarFormaDePagamento(navegador);
    }
}
