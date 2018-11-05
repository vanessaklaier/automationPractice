package realizarCompraComSucesso;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmarCadastroCompleto {
    private WebDriver navegador;

    public confirmarCadastroCompleto(WebDriver navegador) {
        this.navegador = navegador;
    }

    public aceitarTermos confirmarCadastroCompleto() {

        //6Valide se o endereço está correto xpath
        String address;
        address = navegador.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][contains(text(),'Rua zero, 101')]")).getText();
        Assert.assertEquals(address, "Rua zero, 101");

        //6Clicar no botão prosseguir xpath
        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();

        return new aceitarTermos(navegador);
    }
}
