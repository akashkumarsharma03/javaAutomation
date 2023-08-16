package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logincheck {
    WebDriver driver;

    public logincheck(WebDriver driver){
        this.driver= driver;
    }
    By footer = By.xpath("//div[@class='footer-copy']");

    public WebElement loginverify(){
        return driver.findElement(footer);
    }
}
