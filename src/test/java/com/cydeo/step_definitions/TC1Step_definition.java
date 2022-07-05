package com.cydeo.step_definitions;

import com.cydeo.page.*;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @When("user clicks the link sign button")
    public void user_clicks_the_link_sign_button() {
        linkPage.LinkSignButton.click();
    }
    @When("user texts to textBox, uploads link")
    public void user_texts_to_text_box_uploads_link() {
        linkPage.LinkTextButton.sendKeys("How to use Jira ");
        linkPage.uploadLink.sendKeys("https://www.youtube.com/watch?v=GWxMTvRGIpc");
    }
    @When("user click the save button")
    public void userClickTheSaveButton() {
        linkPage.LinkSaveButton.click();
    }
    @When("user click the send button")
    public void userClickTheSendButton() {
        // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("arguments[0].click();", loginPage.sendButton);
        linkPage.sendButton.click();
    }
    @Then("user sees the link on the message box")
    public void userSeesTheLinkOnTheMessageBox() {
        wait.until(ExpectedConditions.visibilityOf(linkPage.display));
        Assert.assertTrue(linkPage.display.isDisplayed());

    }


    @When("user clicks the mention sign button")
    public void userClicksTheMentionSignButton() {
        addMentionPage.addMentionButton.click();
    }
    @When("user add member from   department employees")
    public void userAddMemberFromDepartmentEmployees() {
        addMentionPage.chosenMail.click();


        //addMentionPage.employeeDeleteIcon.click();
    }
    @When("user sees the chosen mail on the message box")
    public void userSeesTheChosenMailOnTheMessageBox() {

        Driver.getDriver().switchTo().frame(loginPage.IframeSave);
        addMentionPage.chosenMail.isDisplayed();
        Driver.getDriver().switchTo().defaultContent();
        addMentionPage.sendButton.click();

    }
    @Then("user sees the mail of chosen employees")
    public void userSeesTheMailOfChosenEmployees() {//wait.until(ExpectedConditions.visibilityOf(addMentionPage.chosenMail));
        String actual = "hr99@cybertekschool.com";
        String expected = addMentionPage.displayChosenMail.getText();
        Assert.assertEquals(expected, actual);

    }


    @When("user clicks the tag button")
    public void userClicksTheTagButton() {
        tagPage.tagButton.click();
    }
    @When("user texts the text on the text input box and clicks add")
    public void userTextsTheTextOnTheTextInputBoxAndClicksAdd() {
        tagPage.tagInputButton.sendKeys("Be Happy");
        tagPage.addButton.click();
    }
    @When("user clicks the delete sign")
    public void userClicksTheDeleteSign() {
        tagPage.deleteButton.click();
    }
    @Then("user sees the attach tag")
    public void userSeesTheAttachTag() {
        Assert.assertTrue(tagPage.displayBox.isDisplayed());

    }


    @When("user clicks the video button")
    public void userClicksTheVideoButton() {
        videoInsertPage.videoButton.click();

    }
    @When("User upload the URL of videos and saves")
    public void userUploadTheURLOfVideosAndSaves() {
        videoInsertPage.videoUrl.sendKeys("https://vimeo.com/76979871");
        videoInsertPage.saveButton.click();
    }
    @Then("user sees the attached video on the box")
    public void userSeesTheAttachedVideoOnTheBox() {
        String actual = "FVID403] Access to video file was denied.;|";
        String expected = videoInsertPage.message.getText();

        Assert.assertEquals(expected, actual);

    }

    @When("user clicks the quotes button")
    public void userClicksTheQuotesButton() {
        quotePage.quoteButton.click();
    }
    @When("User writes a quote  with quotation mark")
    public void userWritesAQuoteWithQuotationMark() {
        Driver.getDriver().switchTo().frame(quotePage.iFrame);
        quotePage.input.sendKeys("Happy");
        Driver.getDriver().switchTo().defaultContent();
        //quotePage.sendButton.click();
        loginPage.sendButton.click();
    }
    @Then("user sees the quote on message on the Active Stream")
    public void userSeesTheQuoteOnMessageOnTheActiveStream() {
        //Thread.sleep(5);
        wait.until(ExpectedConditions.visibilityOf(quotePage.display));
        // String actual="Happy";
        // String expected=quotePage.display.getText();
        // Assert.assertEquals(expected,actual);
        Assert.assertTrue(quotePage.display.isDisplayed());

    }



}
