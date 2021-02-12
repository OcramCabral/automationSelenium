import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContatoPageObject {
    private WebDriver browser;

    public ContatoPageObject(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
        browser.navigate().to("https://www.dbserver.com.br/");
        browser.manage().window().maximize();
    }

    public void cliqueEmContato(){
        browser.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/div/div/div[2]/ul/li[6]/a")).click();
    }

    public String getUrlAtual(){
        return browser.getCurrentUrl();
    }

    public void fechar() {
        browser.quit();
    }
}
