package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearshProductPage extends BasePage
{
    By SearchproductField = By.id("search_product");
    By searchBtn = By.id("submit_search");



    public SearshProductPage(WebDriver driver){super(driver);}


    public HomePage shearchToAppWithValidCredentials (String productname){
        typeOnInputField(SearchproductField, productname);
        clickElement(searchBtn);
        return new HomePage(driver);

    }
    public SearshProductPage searchToAppWithInvalidCredentials (String invalidproductname)
    {
        typeOnInputField(SearchproductField, invalidproductname);
        clickElement(searchBtn);
        return new SearshProductPage(driver);
    }


}
