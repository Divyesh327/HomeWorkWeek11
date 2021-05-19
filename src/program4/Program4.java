package program4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Program4
{
    WebDriver driver;

    @Before
    public void setup()
    {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
    }

    @Test
    public void UserPerformingTest()
    {

        driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("admin123");
        driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
        String expected_results2= "Welcome Paul";
        WebElement message2 = driver.findElement(By.xpath("//a[text()='Welcome Paul']"));
        String actual_results2 = message2.getText();
        Assert.assertEquals("",actual_results2,expected_results2);

    }

    @After
    public void tearDown()
    {

        driver.quit();
    }

}


