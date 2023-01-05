package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login_Steps extends Base_PO {
    private WebDriver driver = getDriver();

    private Login_PO loginPo;

    public Login_Steps(Login_PO loginPo) {
        this.loginPo = loginPo;
    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        loginPo.navigateTo_WebDriverUniversity_Login_Page();
    }

    @When("I enter a username {}")
    public void i_enter_a_username(String username) {
        loginPo.setUsername(username);
    }
    @And("I enter a password {}")
    public void i_enter_a_password_webdriver123(String password) {
        loginPo.setPassword_Texfield(password);
    }

    @And("I clic on thhe login button")
    public void i_clic_on_thhe_login_button() {
        loginPo.clickOn_Login_Button();

    }

    @Then("I should be present with the successful login message")
    public void i_should_be_present_with_the_successful_login_message() {
        loginPo.validate_SuccessfulLogin_Message();
    }

    @Then("I should be present with the unsuccessful login message")
    public void i_should_be_present_with_the_unsuccessful_login_message() {
        loginPo.validate_UnccessfulLogin_Message();
    }


    @Then("i should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String expectedMessage) {
        waitForAlert_AndValidateText(expectedMessage);
    }

}
