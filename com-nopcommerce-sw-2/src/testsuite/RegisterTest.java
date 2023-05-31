package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
public class RegisterTest extends BaseTest {
    String baseurl="https://demo.nopcommerce.com/";
    @Before
    public void setup(){ openBrowser(baseurl);}
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.xpath("//div[@class='header-upper']/div[2]/div/ul/li[1]//a[@class='ico-register']")).click();
        String actualtext=driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText();
        String expectedtext="Register";
        Assert.assertEquals("Verifying text",expectedtext,actualtext);
        System.out.println(actualtext);}
        @Test
                public void userSholdRegisterAccountSuccessfully(){
              driver.findElement(By.xpath("//div[@class='header-upper']/div[2]/div/ul/li[1]//a[@class='ico-register']")).click();
             driver.findElement(By.xpath("//div[@id='gender']/span[1]/label")).click();
             driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("jignesh");
             driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kanani");
             driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[1]/option[7]"));
             driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[2]/option[7]"));
             driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[3]/option[3]"));
             driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jigneshkananiabpharm@gmail.com");
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");//enter password
            driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");//confirm password
            driver.findElement(By.xpath("//button[@id='register-button']")).click();
            driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[2]/div[1]"));


        }


       // WebElement emailField = driver.findElement(By.id("Email"));
       // emailField.sendKeys(("codebuster@gmail.com"));





        @After
                public void tearDown(){ closeBrowser();}





}
