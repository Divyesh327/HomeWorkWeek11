package program2;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2
{
        WebDriver driver;

        @Before
        public void setup()
        {
            String baseurl = "https://demo.nopcommerce.com/";
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseurl);
        }

        @Test
        public void UserPerformingTest()
        {
            WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
            register.click();

            /*WebElement radio = driver.findElement(By.xpath("//input[@value='M']"));
            radio.click();*/

            driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Div");

            driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Son");

            Select dob = new Select(driver.findElement(By.name("DateOfBirthDay")));
            dob.selectByIndex(2);

            Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
            month.selectByVisibleText("November");

            Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
            year.selectByValue("1990");

            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("djs@gmail.com");

            driver.findElement(By.id("Company")).sendKeys("DIV Ltd");

            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcdef@123");

            driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("abcdef@123");

            driver.findElement(By.xpath("//button[@id='register-button']")).click();





        }





        }






















