package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl="https://www.saucedemo.com/ ";
    @Before
    public void setup(){openBrowser(baseurl);}
    @Test
    public void userSholdLoginSuccessfullyWithValid(){
        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
      WebElement password=driver.findElement(By.id("password"));
      password.sendKeys("secret_sauce");
      WebElement loginlink=driver.findElement(By.id("login-button"));
      loginlink.click();
      String actualtext=driver.findElement(By.xpath("//div[@class='header_secondary_container']/span")).getText();
      String expectedtext="Products";
        Assert.assertEquals("Verifying text",expectedtext,actualtext);
        System.out.println(actualtext);
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginlink=driver.findElement(By.id("login-button"));
        loginlink.click();
        String actualprduct1=driver.findElement(By.xpath("//div[@id='inventory_container']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]")).getText();
        String expectedproduct1="Sauce Labs Backpack";
        Assert.assertEquals("Verifying text",expectedproduct1,actualprduct1);
        System.out.println(actualprduct1);
        String actualprduct2=driver.findElement(By.xpath("//div[@id='inventory_container']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]")).getText();
        String expectedproduct2="Sauce Labs Bike Light";
        Assert.assertEquals("Verifying text",expectedproduct2,actualprduct2);
        System.out.println(actualprduct2);
        String actualprduct3=driver.findElement(By.xpath("//div[@id='inventory_container']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/div[1]")).getText();
        String expectedproduct3="Sauce Labs Bolt T-Shirt";
        Assert.assertEquals("Verifying text",expectedproduct3,actualprduct3);
        System.out.println(actualprduct3);
        String actualprduct4=driver.findElement(By.xpath("//div[@id='inventory_container']/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/a[1]/div[1]")).getText();
        String expectedproduct4="Sauce Labs Fleece Jacket";
        Assert.assertEquals("Verifying text",expectedproduct4,actualprduct4);
        System.out.println(actualprduct4);
        String actualprduct5=driver.findElement(By.xpath("//div[@id='inventory_container']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/a[1]/div[1]")).getText();
        String expectedproduct5="Sauce Labs Onesie";
        Assert.assertEquals("Verifying text",expectedproduct5,actualprduct5);
        System.out.println(actualprduct5);
        String actualprduct6=driver.findElement(By.xpath("//div[@id='inventory_container']/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/a[1]/div[1]")).getText();
        String expectedproduct6="Test.allTheThings() T-Shirt (Red)";
        Assert.assertEquals("Verifying text",expectedproduct6,actualprduct6);
        System.out.println(actualprduct6);
    }
    @After
    public void closebrowser(){ closeBrowser();}
}
