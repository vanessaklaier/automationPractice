package realizarCompraComSucesso;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmarCompra {
    private WebDriver navegador;

    public confirmarCompra(WebDriver navegador) {
        this.navegador = navegador;
    }

    public confirmarCompra() {
        //10Valide se foi finalizada com sucesso xpath
        String compraSucesso;
        compraSucesso = navegador.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();
        Assert.assertEquals(compraSucesso, "Your order on My Store is complete.");

        navegador.quit();
    }
}
