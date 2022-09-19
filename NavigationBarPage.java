package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBarPage extends BasePage{

    private loginbNavBar = By.ByClassName("a[href="/login"]");
    private registerNavBar =  By.ByClassName("ul[class="nav navbar-nav"]");


    public NavigationBarPage(WebDriver driver){super(driver);}

    public LoginPage clickLoginFromNavigationBar()
    {
        clickElement(loginNavBar);
        return new LoginPage(driver);
    }
    public RegistratioPage clickRegisterFromNavigationBar()
    {
        clickElement(registerNavBar);
        return new registeratuonPage(driver);
    }
    }


