package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private WebElement login = driver.findElement(By.xpath("//form/ul/li/p/input"));
    private WebElement password = driver.findElement(By.xpath("//div/div/form/ul/li[1]/input"));
    private WebElement enter = driver.findElement(By.xpath("//div/div/form/p/input"));

    public void setLoginData(String loginData) {
        login.sendKeys(loginData);
    }
    public void setPasswordData(String passwordData) {
        password.sendKeys(passwordData);
    }
    public void clickEnterButton(){
        enter.click();
    }
}
