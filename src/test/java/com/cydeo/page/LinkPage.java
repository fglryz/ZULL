package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class LinkPage extends BasePage{
    public LinkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "span[@title='Link']")
    public WebElement LinkSignButton;

@FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement LinkTextButton;

@FindBy(xpath = "input[@id='ƒƒ']")
    public WebElement uploadLink;

@FindBy(xpath = "(input[@value='Save'])[1]")
    public WebElement saveButton;

@FindBy(xpath = "//div[@id='blog_post_body_866']")
    public WebElement output;






}
