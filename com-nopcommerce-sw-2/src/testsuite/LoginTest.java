package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*userShouldNavigateToLoginPageSuccessfully
userShouldNavigateToLoginPageSuccessfully

        * click on the ‘Login’ link
        * Verify the text ‘Welcome, Please Sign

        In!’
        2. userShouldLoginSuccessfullyWithValidCredentials

        * click on the ‘Login’ link
        * Enter valid username
        * Enter valid password
        * Click on ‘LOGIN’ button
        * Verify the ‘Log out’ text is display

        3. verifyTheErrorMessage

        * click on the ‘Login’ link
        * Enter invalid username
        * Enter invalid password
        * Click on Login button
        * Verify the error message ‘Login was unsuccessful.
        Please correct the errors and try again. No customer account found’*/
public class LoginTest extends BaseTest {
    String baseurl="https://demo.nopcommerce.com/";
    @Before
    public void setup(){ openBrowser(baseurl);}
    @Test
    public void Test1() {
        //userShouldNavigateToLoginPageSuccessfully
        WebElement loginlink = driver.findElement(By.className("ico-login"));
        loginlink.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = welcomeMessage.getText();
        Assert.assertEquals("Verifying welcome Message", expectedMessage, actualMessage);
    }
    @Test
            public void Test() {

        driver.findElement(By.className("ico-login")).click();
        //userShouldLoginSuccessfullyWithValidCredentials

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys(("codebuster@gmail.com"));

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();
    }
      //  WebElement loginout = driver.findElement(By.linkText("Log out"));
       // System.out.println(loginout);
  @Test
          public void Test3(){
        WebElement loginlink= driver.findElement(By.className("ico-login"));
                loginlink.click();
       //verifyTheErrorMessage
       WebElement emialField=driver.findElement(By.id("Email"));
      emialField.sendKeys("codebuster1@gmail.com");

      WebElement password=driver.findElement(By.name("codebuster1@gmail.com"));
     password.sendKeys("234567");
      WebElement loginButton = driver.findElement(By.linkText("Log in"));
      loginButton.click();

      String Errormessage=driver.findElement(By.xpath("//div[@class='returning-wrapper fieldset']/form[1]/div")).getText();
      System.out.println(Errormessage);

    }






        @After
        public void tearDown()
             { closeBrowser();
             }
}
