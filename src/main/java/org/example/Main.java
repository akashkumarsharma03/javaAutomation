package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
//

    WebDriver driver;

     By username = By.id("user-name");
     By password = By.name("password");

     By loginButton = By.xpath("//input[@value='Login']");

    public Main(WebDriver driver){
        this.driver = driver;
    }

    public  void usernamefill(String username1){
        driver.findElement(username).sendKeys(username1);
    }
    public  void setPassword(String password1){
        driver.findElement(password).sendKeys(password1);
    }
    public  void clicklogin(){
        driver.findElement(loginButton).click();
    }
}