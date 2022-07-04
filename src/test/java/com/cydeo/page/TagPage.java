package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TagPage {
public TagPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(xpath = "//span[@title='Add tag']")
    public WebElement tagButton;

@FindBy(xpath = "//input[@id='TAGS_blogPostForm67abSn']")
    public WebElement tagInputButton;

@FindBy(xpath= "//span[@class='popup-window-button']")
    public WebElement addButton;

@FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[1]")
public WebElement deleteButton;
@FindBy(id = "post-tags-container-blogPostForm")
    public WebElement displayBox;



}
