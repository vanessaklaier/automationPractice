package realizarCompraComSucesso;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selecionarFormaDePagamento {
    private WebDriver navegador;

    public selecionarFormaDePagamento(WebDriver navegador) {
        this.navegador = navegador;
    }

    public verificarCompra selecionarFormaDePagamento() {

        //8Valide o valor total da compra
        String total;
        total = navegador.findElement(By.id("total_price")).getText();
        Assert.assertEquals(total, "$18.40");

        //8Clicar no método de pagamento
        navegador.findElement(By.cssSelector("p.payment_module a.bankwire")).click();

        return new verificarCompra(navegador);
    }
}
