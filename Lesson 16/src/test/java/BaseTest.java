import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Data;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {
    @BeforeMethod
    public void setUp() {
        open(Data.URL);
    }

    @AfterMethod
    public void tearDown() {
        clearBrowserCookies();
    }
}
