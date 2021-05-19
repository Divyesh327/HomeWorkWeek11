package program3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Program3 {
    WebDriver driver;

    @Before
    public void setup() {
        String baseurl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
    }

    @Test
    public void UserPerformingTest()
    {
        driver.findElement(By.xpath("//div[@class='header_user_info']/a")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345@abcdef");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

        String expected_results= "AUTHENTICATION";
        WebElement message = driver.findElement(By.xpath("//h1"));
        String actual_results = message.getText();

        String expected_results2= "There is 1 error";
        WebElement message2 = driver.findElement(By.xpath("//div[@class='alert alert-danger']/p"));
        String actual_results2 = message2.getText();
        Assert.assertEquals("",actual_results2,expected_results2);



    }

}
