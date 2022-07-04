package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement inputEmail;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(className = "login-btn")
    public WebElement logInButton;

    @FindBy(xpath = "//button[contains(text(),'Send')]")
    public  WebElement send;

    @FindBy(xpath = "//div[@id='blog_post_body_922']/div/table/tbody/tr/td")
    public WebElement activeStream;
}
