package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.Data;
import org.testng.Assert;

import pages.LoginPage;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class MySteps {
    @After
    public void tearDownMethod(){
        clearBrowserCookies();
    }
   private LoginPage loginPage = new LoginPage();
    @Given("^User is in login page$")
    public void userIsInLoginPage() {
        open(Data.URL);
    }

    @When("^User enters valid login$")
    public void userEntersValidLogin() {
        loginPage.setLoginData(Data.LOGIN);
    }

    @And("^User enters valid password and click Enter button$")
    public void userEntersValidPassword() {
        loginPage.setPasswordData(Data.PASSWORD);
        loginPage.clickEnterButton();
    }

    @Then("^Verify that user is logged in$")
    public void verifyThatUserIsLoggedIn() {
        String url = url();
        Assert.assertTrue(url.contains("mbox2"));
    }

    @When("^User enters invalid login$")
    public void userEntersInvalidLogin() {
        loginPage.setLoginData(Data.INVALID_LOGIN);
    }

    @And("^User enters invalid password and click Enter button$")
    public void userEntersInvalidPasswordAndClickEnterButton() {
        loginPage.setPasswordData(Data.INVALID_PASSWORD);
        loginPage.clickEnterButton();
    }

    @Then("^Verify that user is not logged in$")
    public void verifyThatUserIsNotLoggedIn() {
        String url = url();
        Assert.assertTrue(url.contains("passport"));
    }
}
