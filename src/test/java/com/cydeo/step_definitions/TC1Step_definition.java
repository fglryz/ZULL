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
    AddMentionPage addMentionPage = new AddMentionPage();
    InsertVideoPage insertVideoPage = new InsertVideoPage();
    LinkPage linkPage = new LinkPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
    TagPage tagPage=new TagPage();
    QuotePage quotePage=new QuotePage();
    uploadPage uploadPage=new uploadPage();

    @Given("user is on the homepage")
    public void userIsOnTheHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("Mail"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("Password"));
        loginPage.logInButton.click();
    }
    @Given("user clicks the More drop down")
    public void userClicksTheMoreDropDown() {
       addMentionPage.moreButton.click();
    }
    @Given("user click the Appreciation")
    public void userClickTheAppreciation() {
        addMentionPage.appreciationButton.click();
    }


    @When("user clicks the link sign button")
    public void userClicksTheLinkSignButton() {
        linkPage.LinkSignButton.click();
    }
    @When("user texts to textBox, uploads link")
    public void userTextsToTextBoxUploadsLink() {
        // wait.until(ExpectedConditions.visibilityOf(linkPage.LinkTextButton));
        linkPage.LinkTextButton.sendKeys("How to use Jira "  );
        linkPage.uploadLink.sendKeys("https://www.youtube.com/watch?v=GWxMTvRGIpc");
        linkPage.saveButton.click();
    }
    @Then("user sees the attached link on the message box")
    public void userSeesTheAttachedLinkOnTheMessageBox() {
        Assert.assertTrue(loginPage.activeStream.isDisplayed());
    }

    @When("user clicks the video button")
    public void userClicksTheVideoButton() {
        insertVideoPage.videoButton.click();
    }
    @When("User pasts the {string} and saves")
    public void userPastsTheAndSaves(String string) {

        insertVideoPage.videoUrl.sendKeys("https://vimeo.com/76979871");
        insertVideoPage.saveButton.click();
    }
    @When("user click the send button")
    public void userClickTheSendButton() {
        loginPage.send.click();
    }
    @Then("user sees the attached video on the box")
    public void userSeesTheAttachedVideoOnTheBox() {
        Assert.assertTrue(loginPage.activeStream.isDisplayed());
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


    @When("user clicks the quotes button")
    public void userClicksTheQuotesButton() {
        quotePage.quoteButton.click();
    }
    @When("User writes a quote  with quotation mark")
    public void userWritesAQuoteWithQuotationMark() {
        quotePage.input.sendKeys("Happy Year");
        BrowserUtils.waitForVisibility(loginPage.send,5);
        loginPage.send.click();
    }
    @Then("user sees the quote on message on the Active Stream")
    public void userSeesTheQuoteOnMessageOnTheActiveStream() {
        Assert.assertTrue(loginPage.activeStream.isDisplayed());
    }


    @When("user clicks the mention sign button")
    public void userClicksTheMentionSignButton() {
        addMentionPage.addMentionButton.click();
    }
    @When("user chooses a department employee")
    public void userChoosesADepartmentEmployee() {
        addMentionPage.chosenMail.click();
    }
    @Then("user sees the mail of chosen employees")
    public void userSeesTheMailOfChosenEmployees() {
        Assert.assertTrue(addMentionPage.chosenMail.isDisplayed());
    }


    @When("User pasts the URL of videos and saves")
    public void userPastsTheURLOfVideosAndSaves() {

    }


    @When("user click the upload icon")
    public void userClickTheUploadIcon() {
        uploadPage.uploadIcon.click();
    }

    @When("user sees upload file box and clicks")
    public void userSeesUploadFileBoxAndClicks() {
        String jpegFilePath="/Users/atlantic/Desktop/USER STORY DATA/picture1.jpeg";
        uploadPage.inputBox.sendKeys(jpegFilePath);
        uploadPage.inputBox.click();

    }


}
