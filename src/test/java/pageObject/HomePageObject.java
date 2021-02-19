package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.List;

public class HomePageObject {

    private WebDriver browser;

    public HomePageObject(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.navigate().to("https://www.dbserver.com.br/");
    }

    public int getCarrossel(){
        WebElement test = browser.findElement(By.xpath("//*[@id=\"myCarousel\"]/div"));
        return test.findElements(By.xpath("./div[@class='item']")).size()+1;
    }

    public String getUrlAtual(){
        return browser.getCurrentUrl();
    }

    public void fechar() {
        browser.quit();
    }

    public String getEndereco(){ return browser.findElement(By.xpath("//*[@id=\"footer\"]/div/div[1]/div[2]/div/ul/li[1]")).getText(); }
}
