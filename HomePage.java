package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;
    private By welcomeMsg;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public String getWelcomeMsg() {
        return this.driver.findElement(this.welcomeMsg).getText("Website for automation practice");
    }
}
}
