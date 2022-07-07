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

        @FindBy(id = "TAGS_blogPostForm67abSn")
        public WebElement tagInputButton;

        @FindBy(xpath= "//span[@class='popup-window-button']")
        public WebElement addButton;

        @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[1]")
        public WebElement deleteButton;

        @FindBy(id = "blog_post_outer_1281")
        public WebElement displayBox;

        @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")
        public WebElement messageIFrame;

        @FindBy(xpath = "//body")
        public WebElement input;

        @FindBy(id = "post-tags-container-blogPostForm")
        public WebElement tagsAddButton;
        @FindBy(id  ="blog-submit-button-save")
        public WebElement sendButton;
        @FindBy(xpath = "//button[contains(text(),'Send')]")
        public  WebElement send;
}
