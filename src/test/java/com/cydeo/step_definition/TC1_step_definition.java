package com.cydeo.step_definition;

import com.cydeo.page.AddMentionPage;
import com.cydeo.page.BasePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC1_step_definition {
    BasePage basePage;
    AddMentionPage addMentionPage=new AddMentionPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.inputMail.sendKeys("loginMail");
        basePage.inputPassword.sendKeys("loginPassword");
        basePage.logIn.click();

    }
    @When("user clicks the {string} drop down")
    public void user_clicks_the_drop_down(String More) {
        addMentionPage.moreButton.click();
    }

    @When("user clicks the mention sign button")
    public void user_clicks_the_mention_sign_button() {
        addMentionPage.mentionSignInButton.click();
    }
    @When("user writes mention on blockquote  page")
    public void user_writes_mention_on_blockquote_page() {
        addMentionPage.quoteText.sendKeys("better late than ever ");
    }
    @When("user adds mention to Sales Department Employees")
    public void user_adds_mention_to_sales_department_employees() {
        addMentionPage.addTo.sendKeys("Sales Department Employees");
    }
    @Then("user click save button")
    public void user_click_save_button() {
        addMentionPage.sendButton.click();

    }

    @When("user click the {string}")
    public void userClickThe(String Appreciation) {
        addMentionPage.appreciationButton.click();
    }
}


