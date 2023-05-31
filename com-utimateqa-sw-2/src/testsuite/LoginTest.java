package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl="https://courses.ultimateqa.com/";

    @Before
    public void setup(){ openBrowser(baseurl);}
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        WebElement loginlink=driver.findElement(By.xpath("//div[@class='header__wrapper']/nav[1]/ul[1]/li[1]/a"));
        loginlink.click();
        String actualpagetext=driver.findElement(By.xpath("//h2[@class='page__heading']")).getText();
        String expectedpagetext="Welcome Back!";
        Assert.assertEquals("verifying welcome page",expectedpagetext,actualpagetext);
        System.out.println(actualpagetext);}
        @Test
public void verifyTheErrorMessage(){
            WebElement loginlink=driver.findElement(By.xpath("//div[@class='header__wrapper']/nav[1]/ul[1]/li[1]/a"));
            loginlink.click();
            WebElement email=driver.findElement(By.id("user[email]"));
            email.sendKeys("jignesh@gmail.com");
            WebElement password=driver.findElement(By.id("user[password]"));
            password.sendKeys("123456");
            WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
            signin.click();
            String actualerrormessage=driver.findElement(By.xpath("//div[@id='notice']/ul[1]/li")).getText();
            String expectederrormessage="Invalid email or password.";
            Assert.assertEquals("Verifying Error message",expectederrormessage,actualerrormessage);
            System.out.println(actualerrormessage);
    }
    @After
    public void closebrowser(){ closeBrowser();}
}
