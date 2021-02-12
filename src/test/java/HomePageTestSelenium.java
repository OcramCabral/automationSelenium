import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTestSelenium {

    private HomePageObject homePageObject;

    @BeforeMethod
    public void beforeEach(){
        homePageObject = new HomePageObject();
    }

    @AfterMethod
    public void afterEach(){
        homePageObject.fechar();
    }

    @Test
    public void deveria_ter_quantidade_elementos_carrossel(){
        Assert.assertEquals(homePageObject.getCarrossel(), 6);
    }

    @Test
    public void deveria_conter_endereco_ipiranga(){
        Assert.assertEquals(homePageObject.getTodoConteudo().contains(" Av. Ipiranga, 6681"), true);
    }

    @Test
    public void deveria_conter_rota_homepage(){
        Assert.assertEquals(homePageObject.getUrlAtual(), "https://www.dbserver.com.br/");
    } 
}
