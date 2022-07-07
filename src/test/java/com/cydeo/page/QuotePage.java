package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotePage {
    public QuotePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quoteButton;

    @FindBy(xpath = "//body")
    public WebElement input;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iFrame;

    @FindBy(xpath = "//div[@class='blog-post-quote']//td")
    public WebElement actualQuote;

    @FindBy(id  ="blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement getQuoteTextRibbon;








}