package realizarCompraComSucesso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class adicionarNoCarrinho {
    private WebDriver navegador;

    public adicionarNoCarrinho(WebDriver navegador) {
        this.navegador = navegador;
    }

    public confirmarNoCarrinho adicionarNoCarrinho() {

        //2Clicar para adicionar no carrinho com o id
        navegador.findElement(By.id("add_to_cart")).click();

        //2Clicar no botão para o checkout css
        navegador.findElement(By.cssSelector(".button.button-medium span")).click();

        return new confirmarNoCarrinho(navegador);

    }
}
