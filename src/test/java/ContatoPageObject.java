import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContatoPageObject {
    private WebDriver browser;

    public ContatoPageObject(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.navigate().to("https://www.dbserver.com.br/");
    }

    public String todoConteudoPagina(){ return browser.getPageSource(); }

    public String getUrlAtual(){
        return browser.getCurrentUrl();
    }

    public void fechar() {
        browser.quit();
    }

    public void acessoPageContatos(){ browser.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/div/div/div[2]/ul/li[6]/a")).click(); }

    public void preencherFaleConosco(String nome, String email, String assunto) {
        browser.findElement(By.xpath("//*[@id=\"main-contact-form\"]/div[1]/input")).sendKeys(nome);
        browser.findElement(By.xpath("//*[@id=\"main-contact-form\"]/div[2]/input")).sendKeys(email);
        browser.findElement(By.xpath("//*[@id='textAssunto']")).sendKeys(assunto);
        //Selecina Setor Comercial
        browser.findElement(By.cssSelector("#setor > option:nth-child(2)")).click();
        //Pode fazer com o submit do form ver qual é melhor!
        browser.findElement(By.xpath("//*[@id=\"main-contact-form\"]/div[6]/input")).click();
    }

}
