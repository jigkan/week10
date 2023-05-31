package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    /*
    userShouldNavigateToForgotPasswordPageSuccessfully
* click on the ‘Forgot your password’ link
* Verify the text ‘Forgot Your Password?’
     */
    String baseurl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup(){openBrowser(baseurl);  }
    @Test
    public void forgotPasswordTest(){
        String forgotpasswordtext=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).getText();
       String expectedtext="Forgot your password? ";
        Assert.assertEquals("verifying text",expectedtext,forgotpasswordtext);
        WebElement forgotpassword=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
        forgotpassword.click();
       String resetpasswordtext=driver.findElement(By.xpath("//div[@class='orangehrm-forgot-password-wrapper']/div[1]/form/h6")).getText();
        String expectedtext1="Reset Password";
        Assert.assertEquals("verifying Text",expectedtext1, resetpasswordtext);
        System.out.println(resetpasswordtext);
    }
    @After
    public void tearDown(){closeBrowser();}
}
