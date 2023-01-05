package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Login_PO extends Base_PO {
    public Login_PO(){
        super();
    }

    private @FindBy(id = "text")
    WebElement username_Texfield;

    private @FindBy(id = "password")
    WebElement password_Texfield;

    private @FindBy(id = "login-button")
    WebElement login_button;

    public  void navigateTo_WebDriverUniversity_Login_Page(){
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL +  "/Login-Portal/index.html");
    }
    public void  setUsername(String username){
        sendKeys(username_Texfield,username);
    }

    public void setPassword_Texfield (String password){
        sendKeys(password_Texfield,password);
    }
    public void clickOn_Login_Button(){
        waitForWerbElementAndClick(login_button);
    }
    public void validate_SuccessfulLogin_Message(){
        waitForAlert_AndValidateText("validation succeeded");
    }
    public void validate_UnccessfulLogin_Message(){
        waitForAlert_AndValidateText("validation failed");
    }
}
