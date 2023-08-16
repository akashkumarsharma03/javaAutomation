package test.java;

import main.java.org.example.Main;
import main.java.org.example.logincheck;
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
         driver.get("https://www.saucedemo.com/");

    }


@Test()
    public void test() {
       Main loginvalue = new Main(driver);
       loginvalue.usernamefill("standard-user");
       loginvalue.setPassword("secret_sauce");
       loginvalue.clicklogin();

    logincheck verify = new logincheck(driver);
    String expected = verify.loginverify().getText();
    String actual = "";
    Assert.assertEquals(expected,actual);
    }

    @AfterSuite()
    public void close(){
        driver.close();
    }
}