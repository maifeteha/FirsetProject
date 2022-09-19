package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistratioPage extends  BasePage {
    By nameField = By.id("name");
    By emailField = By.id("email");
    By passwordField = By.id("password");
    By firstNameField = By.id("first_name");
    By lastNameField = By.id("last_name");
    By companyField = By.id("company");
    By addressField = By.id("address1");
    By address2Field = By.id("address2");
    By stateField = By.id("state");
    By cityField = By.id("city");
    By zipcodeField = By.id("zipcode");
    By mobile_numberField = By.id("mobile_number");
    By registerBtn = By.id("create-account");

    public RegistratioPage(WebDriver driver){ super(driver);}

    public void registerNewUser (String fname, String lname, String email, String password, String company, String address, String address2, String state, String city, String zipcode, String mobile_number)
    {
        typeOnInputField(firstNameField, fname);
        typeOnInputField(lastNameField, lname);
        typeOnInputField(companyField , company);
        typeOnInputField(addressField, address);
        typeOnInputField(address2Field, address2);
        typeOnInputField(stateField, state);
        typeOnInputField(cityField, city);
        typeOnInputField(zipcodeField, zipcode);
        typeOnInputField(mobile_numberField, mobile_number);
        clickElement(registerBtn);
        new SuccessfulRegistrationPage(driver);
    }
}


