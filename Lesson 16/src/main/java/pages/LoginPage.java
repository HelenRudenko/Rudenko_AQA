package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement login = $(By.xpath("//form/ul/li/p/input"));
    private WebElement password = $(By.xpath("//div/div/form/ul/li[1]/input"));
    private WebElement enter = $(By.xpath("//div/div/form/p/input"));

    public void setLoginData(String loginData) {
        login.sendKeys(loginData);
    }

    public void setPasswordData(String passwordData) {
        password.sendKeys(passwordData);
    }

    public void clickEnterButton() {
        enter.click();
    }
}
