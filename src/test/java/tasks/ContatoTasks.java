package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContatoTasks {

    private WebDriver browser;

    public ContatoTasks(WebDriver browser){
        this.browser = browser;
    }

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
