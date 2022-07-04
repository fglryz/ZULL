package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMentionPage  {
    public AddMentionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Appreciation']")
    public WebElement appreciationButton;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteText;
    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement addTo;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"blg-post-img-867\"]/div[2]/span/a")
    public WebElement SalesDepText;

    @FindBy(linkText = "helpdesk26@cybertekschool.com")
    public WebElement chosenMail;
    @FindBy(xpath = "(//a[contains(text(),'hr101@cybertekschool.com')])[1]\n")
    public WebElement displayChosenMail;


}
