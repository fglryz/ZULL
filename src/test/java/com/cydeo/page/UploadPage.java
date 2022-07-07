package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {
public UploadPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}


    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadIcon;

    @FindBy(xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[1]")
    public WebElement uploadBox;

    @FindBy(xpath = "//input[@name='autosave_id']")
    public WebElement IframeUpload;

       @FindBy(xpath ="//span[@class='f-wrap']")
          public WebElement display;


}



