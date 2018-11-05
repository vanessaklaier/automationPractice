package navegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class web {
    public static WebDriver createChrome() {

       //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanessaf\\IdeaProjects\\webdriverJava\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página do Automation Practice
        navegador.manage().window().maximize();
        navegador.get("http://www.automationpractice.com");

        return navegador;
    }
}

