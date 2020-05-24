package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement loginInput = driver.findElement(By.xpath("//form/ul/li/p/input"));
    private WebElement passwordInput = driver.findElement(By.xpath("//div/div/form/ul/li[1]/input"));
    private WebElement enterButton = driver.findElement(By.xpath("//div/div/form/p/input"));

    public void setLogin(String login) {
        loginInput.sendKeys(login);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickEnterButton() {
        enterButton.click();
    }
}
