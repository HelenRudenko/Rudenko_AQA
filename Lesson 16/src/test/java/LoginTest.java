import data.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.WebDriverRunner.url;

public class LoginTest extends BaseTest{
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.setLoginData(Data.LOGIN);
        loginPage.setPasswordData(Data.PASSWORD);
        loginPage.clickEnterButton();
        String url = url();
        Assert.assertTrue(url.contains("mbox2"));
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.setLoginData(Data.INVALID_LOGIN);
        loginPage.setPasswordData(Data.INVALID_PASSWORD);
        loginPage.clickEnterButton();
        String url = url();
        Assert.assertTrue(url.contains("passport"));
    }

}
