package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardTab;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksTab;

    @FindBy(xpath = "//h2[@id = 'user_count']")
    public WebElement userCount;

    @FindBy(linkText = "Users")
    public WebElement usersTab;


}
