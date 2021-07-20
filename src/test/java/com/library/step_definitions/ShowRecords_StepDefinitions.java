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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ShowRecords_StepDefinitions {

    UsersPage usersPage = new UsersPage();
    MainPage mainPage = new MainPage();

    @And("user clicks on Users link")
    public void userClicksOnUsersLink() {
        mainPage.usersTab.click();
    }


    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer int1) {

        Select select = new Select(usersPage.showRecordsDropdown);
        int expectedDefaultOption = int1;
        int actualDefaultOption = Integer.parseInt(select.getFirstSelectedOption().getText());

        Assert.assertEquals(expectedDefaultOption, actualDefaultOption);


    }
    @Then("show records should have the following options:")
    public void show_records_should_have_the_following_options(List<String> expectedListOfOptions) {

        Select select = new Select(usersPage.showRecordsDropdown);
        List<WebElement> dropDownOptions = select.getOptions();
        List<String> actualListOfOptions = new ArrayList<>();

        for (WebElement each : dropDownOptions) {
            actualListOfOptions.add(each.getText());
        }

        Assert.assertEquals(expectedListOfOptions, actualListOfOptions);

    }


    @Then("table should have the following column names:")
    public void tableShouldHaveTheFollowingColumnNames(List<String> expectedColumnNames) {

        List<String> actualColumnNames = new ArrayList<>();

        for (WebElement each : usersPage.tableColumnTitles) {
            actualColumnNames.add(each.getText());
        }

        Assert.assertEquals(expectedColumnNames, actualColumnNames);

    }
}
