package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoInsertPage {

    public VideoInsertPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement videoButton;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoUrl;

    @FindBy(id = "undefined")
    public WebElement saveButton;

    @FindBy(xpath = "//span[contains(text(),'The message title is not specified')]")
    public WebElement message;

    @FindBy(xpath = "//span[contains(text(),'[FVID403] Access to video file was denied.;')]")
    public WebElement alertVimeo;

    @FindBy(xpath = "//span[contains(text(),'[FVID404] The video was not found;')]")
    public WebElement alertyTube;


}
