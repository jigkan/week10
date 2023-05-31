package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    /*
    userSholdLoginSuccessfullyWithValidCredentials

* Enter “Admin” username
* Enter “admin123 password
* Click on ‘LOGIN’ button
* Verify the ‘Welcome’ text is display
     */
String baseurl="https://opensource-demo.orangehrmlive.com/";
@Before
    public void setup(){ openBrowser(baseurl);}
@Test
    public void Test1(){
    // userSholdLoginSuccessfullyWithValidCredentials
    WebElement username=driver.findElement(By.xpath("//div[@id='app']/div[1]/div[1]//div[1]/div[1]/div[2]/div[2]/form/div[1]/div[1]/div[2]/input"));
    username.sendKeys("Admin");
    WebElement password=driver.findElement(By.xpath("//div[@id='app']/div[1]/div[1]//div[1]/div[1]/div[2]/div[2]/form/div[2]/div[1]/div[2]/input"));
    password.sendKeys("admin123");
    WebElement loginlink=driver.findElement(By.xpath("//div[@id='app']/div[1]/div[1]//div[1]/div[1]/div[2]/div[2]/form/div[3]/button"));
    loginlink.click();
    String actualtext= driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']/span[1]/h6")).getText();
    String expectedtext="Dashboard";
    Assert.assertEquals("Verifying text", expectedtext,actualtext);
    System.out.println(actualtext);
}
@After
    public void teardown(){ closeBrowser();}
}
