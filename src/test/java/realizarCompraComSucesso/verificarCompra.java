package realizarCompraComSucesso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verificarCompra {
    private WebDriver navegador;

    public verificarCompra(WebDriver navegador) {
        this.navegador = navegador;
    }

    public confirmarCompra verificarCompra() {

        //9Clicar no botão para confirmar a compra
        navegador.findElement(By.cssSelector(" .cart_navigation .button-medium")).click();

        return new confirmarCompra(navegador);

    }
}
