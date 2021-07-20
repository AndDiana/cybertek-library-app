package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.pages.MainPage;
import com.library.pages.UsersPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    UsersPage usersPage = new UsersPage();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user enters valid librarian username and password")
    public void userEntersValidLibrarianUsernameAndPassword() {
        loginPage.emailField.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        loginPage.passwordField.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        loginPage.signInButton.click();
    }

    @When("user enters valid student username and password")
    public void userEntersValidStudentUsernameAndPassword() {
        loginPage.emailField.sendKeys(ConfigurationReader.getProperty("student_username"));
        loginPage.passwordField.sendKeys(ConfigurationReader.getProperty("student_password"));
        loginPage.signInButton.click();
    }

    @Then("user should see the dashboard tab")
    public void userShouldSeeTheDashboardTab() {

        Assert.assertTrue("Dashboard tab is not displayed" , mainPage.dashboardTab.isDisplayed());
        Driver.closeDriver();

    }

    @Then("user should see the books tab")
    public void userShouldSeeTheBooksTab() {

        Assert.assertTrue("Books tab is not displayed", mainPage.booksTab.isDisplayed());
        Driver.closeDriver();

    }


    @When("user clicks the sign in button")
    public void user_clicks_the_sign_in_button() {
        loginPage.signInButton.click();

    }

    @Then("there should be {int} users")
    public void there_should_be_users(int int1) throws InterruptedException {

        wait.until(ExpectedConditions.titleIs("Library"));
        int actualUserCount = Integer.parseInt(mainPage.userCount.getText());
        System.out.println("actual user count = " + actualUserCount);

        Assert.assertEquals("Number of user is not as expected", int1, actualUserCount );

    }

    @When("user enters librarian username {string}")
    public void userEntersLibrarianUsername(String arg0) {
        loginPage.emailField.sendKeys(arg0);

    }

    @When("user enters student username {string}")
    public void userEntersStudentUsername(String arg0) {
        loginPage.emailField.sendKeys(arg0);
    }

    @And("user enters librarian password {string}")
    public void userEntersLibrarianPassword(String arg0) {
        loginPage.passwordField.sendKeys(arg0);
    }

    @And("user enters student password {string}")
    public void userEntersStudentPassword(String arg0) {
        loginPage.passwordField.sendKeys(arg0);
    }

    @When("user enters librarian username {string} and password {string}")
    public void userEntersLibrarianUsernameAndPassword(String arg0, String arg1) {
        loginPage.emailField.sendKeys(arg0);
        loginPage.passwordField.sendKeys(arg1);
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
        loginPage.emailField.sendKeys(arg0);
        loginPage.passwordField.sendKeys(arg1);
        loginPage.signInButton.click();
        
    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String arg0) {


        String expectedAccountName = arg0;
        String actualAccountName  = usersPage.accountName.getText();

        Assert.assertEquals(actualAccountName, expectedAccountName);

        Driver.closeDriver();

    }
}
