package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_Po;


public class Contac_Us_Steps extends Base_PO {
    private Contact_Us_Po contactUsPo;

    public Contac_Us_Steps(Contact_Us_Po contact_us_po) {
        this.contactUsPo = contact_us_po;
    }
    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contactUsPo.navigateToUrl_WebDriverUniversity_Contact_Us_Page();
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUsPo.setFirsName_TextField();
    }
    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUsPo.setLastName_TextField();
    }
    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUsPo.setEmail_TextFiel();
    }
    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUsPo.setComment_TextField();
    }
    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUsPo.setSpecific_FirstName(firstName);
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUsPo.setSpecific_LastName(lastName);
    }
    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        contactUsPo.setSpecific_Email(email);
    }
    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        contactUsPo.setSpecific_Comment(comment);
    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactUsPo.clickOn_Submit_Button();
    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUsPo.validate_Successful_SubmissionMessageText();
    }
}
