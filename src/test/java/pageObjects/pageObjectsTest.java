package pageObjects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import realizarCompraComSucesso.escolherProduto;
import navegador.web;


public class pageObjectsTest {

    private WebDriver navegador;

    @BeforeEach
    public void setUp() {

        navegador = web.createChrome();
}

    @Test
    public void pageObjectsTest(){

        new escolherProduto(navegador)
                .escolherProduto()
                .adicionarNoCarrinho()
                .confirmarNoCarrinho()
                .criarCadastroInicial()
                .criarCadastroCompleto()
                .confirmarCadastroCompleto()
                .aceitarTermos()
                .selecionarFormaDePagamento()
                .verificarCompra();

        }

    @AfterEach
    public void tearDown(){
    navegador.quit();


    }

}
