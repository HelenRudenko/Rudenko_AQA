import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Data;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginData(Data.LOGIN);
        loginPage.setPasswordData(Data.PASSWORD);
        loginPage.clickEnterButton();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("mail.i.ua"));
    }
    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginData(Data.INVALID_LOGIN);
        loginPage.setPasswordData(Data.INVALID_PASSWORD);
        loginPage.clickEnterButton();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("passport"));
    }

}
