package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMentionPage  {
    public AddMentionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "More")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Appreciation']")
    public WebElement appreciationButton;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionSignInButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteText;
    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement addTo;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

}
