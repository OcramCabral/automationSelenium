package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tasks.ContatoTasks;

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

    public String getEndereco(){ return browser.findElement(By.xpath("//*[@id=\"voltarTopo\"]/div[7]/div/div[2]/ul/li[1]/p[1]")).getText();}

    public void fechar() {
        browser.quit();
    }

    public void acessoPageContatos(){ browser.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/div/div/div[2]/ul/li[6]/a")).click(); }

    public void inputFaleConosco(String nome, String email, String assunto) {
        ContatoTasks ct = new ContatoTasks(browser);
        ct.preencherFaleConosco(nome, email, assunto);
    }

}
