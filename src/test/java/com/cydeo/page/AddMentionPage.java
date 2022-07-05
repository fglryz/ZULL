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

    @FindBy(xpath = "//*[@id=\"bx-destination-tag\"]")
    public WebElement addTo;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(linkText = "SalesDepartment")
    public WebElement SalesDepText;

    @FindBy(xpath ="//div[contains(text(),'hr99@cybertekschool.com')]")
    public WebElement chosenMail;

    @FindBy(xpath = "//span[contains(text(),'All employees')]")
    public WebElement allEmployees;

    @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")
    public WebElement messageIframe;
    @FindBy(xpath = "//body")
    public WebElement messageText;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement employeeDeleteIcon;

    @FindBy(xpath = "//a[contains(text(),'hr99@cybertekschool.com')][1]")
    public WebElement displayChosenMail;

}
