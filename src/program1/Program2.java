package program1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2
{

        WebDriver driver;

        @Before
        public void setup()
        {
            String baseurl = "https://www.google.com/";
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseurl);


        }

        @Test
        public void UserPerformingTest()
        {
            WebElement agree = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
            agree.click();
            WebElement searchlink = driver.findElement(By.xpath("//input[@name='q']"));
            searchlink.sendKeys("nopCommerce demo store");
            WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
            searchbar.click();
            WebElement select1 = driver.findElement(By.xpath("//*[@class='LC20lb DKV0Md' and contains(text(),'nopCommerce demo store')]"));
            select1.click();
            WebElement nopcommerce = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
            nopcommerce.click();

        }

        @After
        public void AfterProgram()
        {
            driver.quit();

        }

    }



