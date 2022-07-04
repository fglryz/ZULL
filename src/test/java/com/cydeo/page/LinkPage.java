package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkPage extends LoginPage {
    public LinkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//span[@title='Link']")
    public WebElement LinkSignButton;

@FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement LinkTextButton;

@FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement uploadLink;

@FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveButton;


@FindBy(xpath = "//a[.='how to use jira']")
    public WebElement display;









}
