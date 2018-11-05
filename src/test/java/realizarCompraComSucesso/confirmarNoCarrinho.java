package realizarCompraComSucesso;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmarNoCarrinho {
    private WebDriver navegador;

    public confirmarNoCarrinho(WebDriver navegador) {
        this.navegador = navegador;

    }

    public criarCadastroInicial confirmarNoCarrinho() {

        //3Validar se o produto foi corretamente adicionado ao carrinho pelo seu id
        String Price;
        Price = navegador.findElement(By.id("total_price")).getText();
        Assert.assertEquals(Price, "$18.40");

        //3Clicar no botão prosseguir com o css
        navegador.findElement(By.cssSelector(".cart_navigation .button-medium span")).click();

        return new criarCadastroInicial(navegador);
    }

}
