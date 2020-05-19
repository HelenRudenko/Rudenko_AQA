import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class RegistrationTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(); //Открываем браузер
        driver.manage().window().maximize(); //Открываем окно браузера на весь экран
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.i.ua/"); //Переходим по URL
    }

    @AfterMethod
    public void tearDown() {
        driver.close(); //Закрываем браузер
        driver.quit(); //Закрываем браузер
    }

    @Test
    public void testValidLogin(){
        WebElement login = driver.findElement(By.xpath("//form/ul/li/p/input"));
        login.sendKeys("olena1993@i.ua");
        WebElement password = driver.findElement(By.xpath("//div/div/form/ul/li[1]/input"));
        password.sendKeys("helen25041993");
        WebElement enter = driver.findElement(By.xpath("//div/div/form/p/input"));
        enter.click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("mail.i.ua"));
    }
    @Test
    public void testInvalidLogin(){
        WebElement login = driver.findElement(By.xpath("//form/ul/li/p/input"));
        login.sendKeys("olena@i.ua");
        WebElement password = driver.findElement(By.xpath("//div/div/form/ul/li[1]/input"));
        password.sendKeys("helen");
        WebElement enter = driver.findElement(By.xpath("//div/div/form/p/input"));
        enter.click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("passport"));
    }
}
