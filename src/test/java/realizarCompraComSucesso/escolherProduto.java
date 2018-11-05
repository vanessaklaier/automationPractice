package realizarCompraComSucesso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class escolherProduto {

    private WebDriver navegador;

    public escolherProduto(WebDriver navegador) {
        this.navegador = navegador;
    }

    public adicionarNoCarrinho escolherProduto() {


        //Clicar em um produto qualquer na loja com o seu linktext
        navegador.findElement(By.linkText("Printed Chiffon Dress")).click();

        return new adicionarNoCarrinho(navegador);
    }

}


