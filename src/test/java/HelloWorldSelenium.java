import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldSelenium {
    @Test
    public void hello(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://www.dbserver.com.br/");
        browser.quit();
    }
}