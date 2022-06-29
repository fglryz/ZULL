package com.cydeo.step_definitions;

import com.cydeo.page.AddMentionPage;
import com.cydeo.page.BasePage;
import com.cydeo.page.LinkPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC2_step_definition {
    BasePage basePage = new BasePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    LinkPage linkPage = new LinkPage();
    AddMentionPage addMentionPage = new AddMentionPage();

    @Given("user is on the Appreciation tab")
    public void user_is_on_the_appreciation_tab() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.inputMail.sendKeys("loginMail");
        basePage.inputPassword.sendKeys("loginPassword");
        addMentionPage.moreButton.click();
        addMentionPage.appreciationButton.click();

    }

    @When("user clicks the link sign buttonWhen user texts {string}, {string} and saves")
    public void user_clicks_the_link_sign_button_when_user_texts_and_saves(String string, String string2) {
        linkPage.LinkSignButton.click();
        linkPage.LinkTextButton.sendKeys("How to download Selenium");
        linkPage.uploadLink.sendKeys("https://www.youtube.com/watch?v=U-JRw7yRFcA");
    }

    @When("user clicks the send button.")
    public void user_clicks_the_send_button() {
        linkPage.saveButton.click();

    }

    @Then("user sees his\\/her link on the “Active Stream")
    public void user_sees_his_her_link_on_the_active_stream() {
        String expected = "How to download Selenium";
        String actual = linkPage.output.getText();
        Assert.assertTrue(expected.contains(actual));


    }


    @When("user clicks the link sign button")
    public void userClicksTheLinkSignButton() {
        linkPage.LinkSignButton.click();
    }

    @When("user texts {string}, {string} and saves")
    public void userTextsAndSaves(String textbox, String uploadFiles) {
        linkPage.LinkTextButton.sendKeys("textbox");
        linkPage.uploadLink.sendKeys("uploadFiles");
    }



    @Then("user sees his\\/her link on the “Active Stream\"")
    public void userSeesHisHerLinkOnTheActiveStream() throws Throwable {
        String expected = "How to download Selenium";
        String actual = linkPage.output.getText();
        Assert.assertTrue(expected.contains(actual));

    }
}