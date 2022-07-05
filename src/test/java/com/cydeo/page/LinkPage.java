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

    @FindBy(xpath = "//*[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement uploadLink;

    @FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=GWxMTvRGIpc'])[1]")
    public WebElement display;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement LinkSaveButton;
    @FindBy(id  ="blog-submit-button-save")
    public WebElement sendButton;








}
