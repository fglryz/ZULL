package com.cydeo.step_definitions;

import com.cydeo.page.*;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TC1Step_definition {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    AddMentionPage addMentionPage = new AddMentionPage();
    LinkPage linkPage = new LinkPage();
    QuotePage quotePage = new QuotePage();
    TagPage tagPage = new TagPage();
    VideoInsertPage videoInsertPage = new VideoInsertPage();
    Actions actions = new Actions(Driver.getDriver());
    UploadPage uploadPage = new UploadPage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //Driver.getDriver().get("https://qa.azulcrm.com/");
        loginPage.inputEmail.sendKeys("helpdesk1@cybertekschool.com");
        loginPage.inputPassword.sendKeys("UserUser");
        loginPage.logInButton.click();
    }

    @Given("user clicks the More drop down")
    public void user_clicks_the_more_drop_down() {
        addMentionPage.moreButton.click();
    }

    @Given("user click the Appreciation")
    public void user_click_the_appreciation() {
        addMentionPage.appreciationButton.click();

    }


    @When("user clicks the mention sign button")
    public void userClicksTheMentionSignButton() {
        addMentionPage.addMentionButton.click();
    }

    @When("user add member {string} from department employees")
    public void userAddMemberFromDepartmentEmployees(String chosenMail) {
        addMentionPage.chosenMail.click();

    }

    @When("user sees the chosen mail on the message box")
    public void userSeesTheChosenMailOnTheMessageBox() {

        Driver.getDriver().switchTo().frame(loginPage.IframeSave);
        addMentionPage.chosenMail.isDisplayed();
        Driver.getDriver().switchTo().defaultContent();
        addMentionPage.sendButton.click();

    }

    @Then("user sees the mail of chosen employees {string}")
    public void userSeesTheMailOfChosenEmployees(String chosen) {
        String actual = "hr99@cybertekschool.com";
        String expected = addMentionPage.displayChosenMail.getText();
        Assert.assertEquals(expected, actual);
    }


    @When("user clicks the link sign button")
    public void user_clicks_the_link_sign_button() {
        linkPage.LinkSignButton.click();
    }
    @When("user texts to textBox {string}, uploads {string} link")
    public void userTextsToTextBoxUploadsLink(String text, String url) {
        linkPage.LinkTextButton.sendKeys("How to use Jira ");
        linkPage.uploadLink.sendKeys("https://www.youtube.com/watch?v=GWxMTvRGIpc");
    }
    @When("user click the {string} button")
    public void userClickTheButton(String save) {
        linkPage.LinkSaveButton.click();
    }
    @When("user click the send button")
    public void userClickTheSendButton() {
        // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("arguments[0].click();", loginPage.sendButton);
        linkPage.sendButton.click();
    }
    @Then("user sees the link {string} on the message box")
    public void userSeesTheLinkOnTheMessageBox(String link) {
        wait.until(ExpectedConditions.visibilityOf(linkPage.display));
        Assert.assertTrue(linkPage.display.isDisplayed());
    }

    @When("user clicks the video button")
    public void userClicksTheVideoButton() {
        videoInsertPage.videoButton.click();

    }
    @When("User upload the URL of videos {string} and saves")
    public void userUploadTheURLOfVideosAndSaves(String url) {
        videoInsertPage.videoUrl.sendKeys("https://vimeo.com/76979871");
        videoInsertPage.saveButton.click();
    }
    @Then("user sees the {string} on the box")
    public void userSeesTheOnTheBox(String attachedVideo) {
        String actual = "FVID403] Access to video file was denied.;|";
        String expected = videoInsertPage.message.getText();

        Assert.assertEquals(expected, actual);
    }


    @When("user clicks a Quote Text Button")
        public void userClicksAQuoteTextButton() {
            quotePage.quoteButton.click();
        }
    @When("User enter a {string} in a yellow quote ribbon")
    public void userEnterAInAYellowQuoteRibbon(String quote) {
        Driver.getDriver().switchTo().frame(quotePage.iFrame);
        quotePage.input.sendKeys(quote);
        Driver.getDriver().switchTo().defaultContent();

    }
    @Then("user sees the quote  on the Active Stream")
    public void userSeesTheQuoteOnTheActiveStream() {

        Assert.assertTrue(quotePage.actualQuote.isDisplayed());
    }


    @When("user clicks the tag button")
    public void userClicksTheTagButton() {
        tagPage.tagButton.click();
    }
    @When("user texts {string} on the text input box and clicks add")
    public void userTextsOnTheTextInputBoxAndClicksAdd(String arg0) {
        tagPage.tagInputButton.sendKeys("Happy");
        tagPage.addButton.click();
    }
    @And("user enters {string} on the input  message box")
    public void userEntersOnTheInputMessageBox(String arg0) {
        Driver.getDriver().switchTo().frame(tagPage.messageIFrame);
        tagPage.input.sendKeys("I hope you are happy");
        Driver.getDriver().switchTo().defaultContent();
        //quotePage.sendButton.click();


    }
    @When("user clicks the delete sign")
    public void userClicksTheDeleteSign() {
        tagPage.deleteButton.click();
    }
    @Then("user sees tags  on the Active Stream")
    public void userSeesTagsOnTheActiveStream() {
        Assert.assertTrue(tagPage.input.isDisplayed());
    }
    @Then("user removes tag")
    public void userRemovesTag() {
        Assert.assertTrue(tagPage.tagsAddButton.isDisplayed());

    }


    @When("user clicks upload button")
    public void user_clicks_upload_button() {
        uploadPage.uploadIcon.click();
    }
    @When("user drag and drop  a picture")
    public void user_drag_and_drop_a_picture() {
        uploadPage.uploadBox.sendKeys("/Users/atlantic/Desktop/picture1.jpeg" );
    }
    @Then("user sees the picture on the Active Stream")
    public void user_sees_the_picture_on_the_active_stream() {
        uploadPage.display.isDisplayed();
    }

}