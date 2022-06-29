package com.cydeo.step_definitions;

import com.cydeo.page.AddMentionPage;
import com.cydeo.page.BasePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC1_step_definition {
    BasePage basePage;
    AddMentionPage addMentionPage = new AddMentionPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.inputMail.sendKeys("loginMail");
        basePage.inputPassword.sendKeys("loginPassword");
    }

    @When("user clicks the {string} drop down")
    public void user_clicks_the_drop_down(String string) {
        addMentionPage.moreButton.click();
    }

    @When("user click the {string}")
    public void user_click_the(String string) {
        addMentionPage.appreciationButton.click();
    }

    @When("user clicks the mention sign button")
    public void user_clicks_the_mention_sign_button() {
        addMentionPage.addTo.click();
    }

    @When("user writes mention on blockquote  page")
    public void user_writes_mention_on_blockquote_page() {
        addMentionPage.quoteText.sendKeys("Education is one thing no one can take away from you.");
    }

    @When("user adds mention to Sales Department Employees")
    public void user_adds_mention_to_sales_department_employees() {
        addMentionPage.addTo.sendKeys("Sales Department Employees");
    }

    @Then("user click save button")
    public void user_click_save_button() {
        addMentionPage.sendButton.click();
    }

    @When("user adds mention to All Employees")
    public void userAddsMentionToAllEmployees() {
        addMentionPage.addTo.sendKeys("All Employees");
        String expected="Not no send";
        String actual=Driver.getDriver().getTitle();
        Assert.assertTrue(expected.equals(actual));
    }

}

