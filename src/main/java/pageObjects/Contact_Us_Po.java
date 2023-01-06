package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class Contact_Us_Po extends Base_PO {

    public Contact_Us_Po() {
        super();
    }

    public void navigateToUrl_WebDriverUniversity_Contact_Us_Page() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    private @FindBy(how = How.XPATH, using = "//input[@name='first_name']")
    WebElement firsName_TextField;

    public void setFirsName_TextField() {
        sendKeys(firsName_TextField, "AutoFN" + generateRandomNumber(5));
    }

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName_TextField;

    public void setLastName_TextField() {
        sendKeys(lastName_TextField, "AutoLN" + generateRandomNumber(5));
    }

    private @FindBy(xpath = "//form[@id='contact_form']/input[@name='email']")
    WebElement email_TextField;

    public void setEmail_TextFiel() {
        sendKeys(email_TextField, "AutoEmail" + generateRandomString(10) + "@mail.com");
    }

    private @FindBy(xpath = "//form[@id='contact_form']/textarea[@name='message']")
    WebElement comment_TextField;
    private @FindBy(xpath = "//div[@id='form_buttons']/input[@value='SUBMIT']")
    WebElement submit_Button;
    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfullSubmission_Message;


    public void setComment_TextField() {
        sendKeys(comment_TextField, "Hello world" + generateRandomString(10));
    }

    public void setSpecific_FirstName(String firstName) {
        sendKeys(firsName_TextField, firstName);
    }

    public void setSpecific_LastName(String lastName) {
        sendKeys(lastName_TextField, lastName);
    }

    public void setSpecific_Email(String email) {
        sendKeys(email_TextField, email);
    }

    public void setSpecific_Comment(String comment) {
        sendKeys(comment_TextField, comment);
    }

    public void clickOn_Submit_Button() {
        waitForWerbElementAndClick(submit_Button);
    }

    public void validate_Successful_SubmissionMessageText() {
        waitFor(successfullSubmission_Message);
        Assert.assertEquals(successfullSubmission_Message.getText(),"Thank You for your Message!");
    }

}
