package realizarCompraComSucesso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class criarCadastroCompleto {
    private WebDriver navegador;

    public criarCadastroCompleto(WebDriver navegador) {
        this.navegador = navegador;
    }

    public confirmarCadastroCompleto criarCadastroCompleto() {
        //5Digitar nome no campo firstname
        navegador.findElement(By.id("customer_firstname")).sendKeys("xuxubeleza");

        //5Digitar nome no campo lastname
        navegador.findElement(By.id("customer_lastname")).sendKeys("beleza");

        //5Digitar senha no campo
        navegador.findElement(By.id("passwd")).sendKeys("654321");

        //5Digitar endereço
        navegador.findElement(By.id("address1")).sendKeys("Rua zero, 101");

        //5Digitar cidade
        navegador.findElement(By.id("city")).sendKeys("Porto Alegre");

        //5Escolher state no combo
        WebElement comboBox = navegador.findElement(By.id("id_state"));
        new Select(comboBox).selectByVisibleText("Arizona");

        //5Digitar CEP
        navegador.findElement(By.id("postcode")).sendKeys("95000");

        //5Escolher country
        WebElement comboCountry = navegador.findElement(By.id("id_country"));
        new Select(comboCountry).selectByVisibleText("United States");

        //5Digitar mobile phone
        navegador.findElement(By.id("phone_mobile")).sendKeys("55119696969696");

        //5Digitar informação de contato
        navegador.findElement(By.id("alias")).sendKeys("home");

        //5Clicar no botão Register com id
        navegador.findElement(By.id("submitAccount")).click();

        return new confirmarCadastroCompleto(navegador);
    }
}
