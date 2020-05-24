import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Data;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLogin(Data.LOGIN);
        loginPage.setPassword(Data.PASSWORD);
        loginPage.clickEnterButton();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("mbox2"));
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLogin(Data.INVALID_LOGIN);
        loginPage.setPassword(Data.INVALID_PASSWORD);
        loginPage.clickEnterButton();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("passport"));
    }

}
