package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
//Enter “tomsmith” username
//* Enter “SuperSecretPassword!” password
//
//* Click on ‘LOGIN’ button
//* Verify the text “Secure Area”

        WebElement username=driver.findElement(By.xpath("//form[@id='login']/div[1]/div[1]/input"));
        username.sendKeys("tomsmith");
        WebElement password=driver.findElement(By.xpath("//form[@id='login']/div[2]/div[1]/input"));
        password.sendKeys("SuperSecretPassword!");
        WebElement loginlink= driver.findElement(By.xpath("//form[@id='login']/button/i"));
        loginlink.click();
        String actualpagetext=driver.findElement(By.xpath("//div[@id='content']/div[1]/h4")).getText();
        String expectedpagetext="Welcome to the Secure Area. When you are done click logout below.";
         Assert.assertEquals("verifying text", expectedpagetext,actualpagetext);
        System.out.println(actualpagetext);
    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        ///* Enter “tomsmith1” username
        //* Enter “SuperSecretPassword!” password
        //* Click on ‘LOGIN’ button
        //* Verify the error message “Your username
        //
        //    is invalid!”
        WebElement username=driver.findElement(By.xpath("//form[@id='login']/div[1]/div[1]/input"));
        username.sendKeys("tomsmith1");
        WebElement password=driver.findElement(By.xpath("//form[@id='login']/div[2]/div[1]/input"));
        password.sendKeys("SuperSecretPassword!");
        WebElement loginlink= driver.findElement(By.xpath("//form[@id='login']/button/i"));
        loginlink.click();
        String actualpageerrortext=driver.findElement(By.xpath("//div[@class=\"row\"]/div[1]/div[1]")).getText();
        System.out.println(actualpageerrortext);
}
@Test
public void verifyThePasswordErrorMessage(){
        //Enter “tomsmith” username
    //* Enter “SuperSecretPassword” password
    //* Click on ‘LOGIN’ button
    //* Verify the error message “Your password
    //
    //is invalid!”
    WebElement username=driver.findElement(By.xpath("//form[@id='login']/div[1]/div[1]/input"));
    username.sendKeys("tomsmith");
    WebElement password=driver.findElement(By.xpath("//form[@id='login']/div[2]/div[1]/input"));
    password.sendKeys("SuperSecretPassword");
    WebElement loginlink= driver.findElement(By.xpath("//form[@id='login']/button/i"));
    loginlink.click();
    String actualpageerrortext=driver.findElement(By.xpath("//div[@class=\"row\"]/div[1]/div[1]")).getText();
    System.out.println(actualpageerrortext);
}
    @After
    public void closebrowser(){
        closeBrowser();
    }
}