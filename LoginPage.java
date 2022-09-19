package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends BasePage {
    By emailField = By.id("Email Address");
    By passwordField = By.id("Password");
    By loginBtn = By.cssSelector("login-button");


    public LoginPage(WebDriver driver){
        super(driver);}


    public HomePage loginToAppWithValidCredentials (String email, String password){
        typeOnInputField(passwordField, password);
        clickElement(loginBtn);
        return new HomePage(driver);

    }

    /**
     * @return
     */
    public LoginPage loginToAppWithInvalidCredentials () {
        return loginToAppWithInvalidCredentials(null, null);
    }

    public LoginPage loginToAppWithInvalidCredentials (String invalidEmail, String invalidPassword)
    {
        typeOnInputField(emailField, invalidEmail);
        typeOnInputField(passwordField, invalidPassword);
        clickElement(loginBtn);
        return new LoginPage(driver);
    }

}
