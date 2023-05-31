package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseurl="https://demo.nopcommerce.com/";
   // userShouldNavigateToComputerPageSuccessfully
    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void test1() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[1]//a[@href=\"/computers\"]")).click();
        String actualtext= driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        String expectedtext="Computers";

        Assert.assertEquals("Verifying text",expectedtext,actualtext);
        System.out.println(actualtext);
                  }
        @Test
        public void test2(){
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]//a[@href='/electronics']")).click();
            String actualtext= driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
            String expectedtext="Electronics";

            Assert.assertEquals("Verifying text",expectedtext,actualtext);
            System.out.println(actualtext);
        }
        @Test
        public void test3()
        {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]//a[@href='/apparel']")).click();
            String actualtext= driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
            String expectedtext="Apparel";

            Assert.assertEquals("Verifying text",expectedtext,actualtext);
            System.out.println(actualtext);
        }
        @Test
        public void test4(){
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]//a[@href='/digital-downloads']")).click();
            String actualtext= driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
            String expectedtext="Digital downloads";

            Assert.assertEquals("Verifying text",expectedtext,actualtext);
            System.out.println(actualtext);
        }

    @Test
    public void test5(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]//a[@href='/books']")).click();
        String actualtext= driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        String expectedtext="Books";

        Assert.assertEquals("Verifying text",expectedtext,actualtext);
        System.out.println(actualtext);
    }
    @Test
    public void test6(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]//a[@href='/jewelry']")).click();
        String actualtext= driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        String expectedtext="Jewelry";

        Assert.assertEquals("Verifying text",expectedtext,actualtext);
        System.out.println(actualtext);
    }
    @Test
    public void test7(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]//a[@href='/gift-cards']")).click();
        String actualtext= driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        String expectedtext="Gift Cards";

        Assert.assertEquals("Verifying text",expectedtext,actualtext);
        System.out.println(actualtext);
    }



            @After
            public void tearDown()
            { closeBrowser();
            }
        }
