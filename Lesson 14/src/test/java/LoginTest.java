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


public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.i.ua/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testValidLogin(){
        WebElement loginInput = driver.findElement(By.xpath("//form/ul/li/p/input"));
        loginInput.sendKeys("olena1993@i.ua");
        WebElement passwordInput = driver.findElement(By.xpath("//div/div/form/ul/li[1]/input"));
        passwordInput.sendKeys("helen25041993");
        WebElement enterButton = driver.findElement(By.xpath("//div/div/form/p/input"));
        enterButton.click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("mail.i.ua"));
    }
    @Test
    public void testInvalidLogin(){
        WebElement loginInput = driver.findElement(By.xpath("//form/ul/li/p/input"));
        loginInput.sendKeys("olena@i.ua");
        WebElement passwordInput = driver.findElement(By.xpath("//div/div/form/ul/li[1]/input"));
        passwordInput.sendKeys("helen");
        WebElement enter = driver.findElement(By.xpath("//div/div/form/p/input"));
        enter.click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("passport"));
    }
}
