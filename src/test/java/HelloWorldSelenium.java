import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloWorldSelenium {

    private ContatoPageObject contatoPageObject;

    @BeforeMethod
    public void beforeEach(){
        contatoPageObject = new ContatoPageObject();
    }

    @Test
    public void deveriaAcesserHtmlContatos(){
        contatoPageObject.cliqueEmContato();
        Assert.assertEquals(contatoPageObject.getUrlAtual(), "https://www.dbserver.com.br/contato.html");
    }
    

    @AfterMethod
    public void afterEach(){
        contatoPageObject.fechar();
    }
}