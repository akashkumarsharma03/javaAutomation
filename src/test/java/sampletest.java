package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class sampletest {
    WebDriver driver;

    @BeforeSuite()
    public void driver (){
        System.setProperty("webderiver.chrome.driver", "assets/chromedriver.exe");
        driver = new ChromeDriver();
         driver.get("https://google.com");

    }


@Test()
    public void test() {
        String title = driver.getTitle();
    System.out.println(title);
    }

    @AfterSuite()
    public void close(){
        driver.close();
    }
}