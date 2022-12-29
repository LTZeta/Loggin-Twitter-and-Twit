package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends  AbstractPage{

    private static By loginButton;
    public SearchPage(WebDriver driver) { super(driver); }

    public void loadPage(String page){
        getDriver().get(page);
    }

    public void clickLoginButton(){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        getDriver().findElement(loginButton).sendKeys(Keys.ENTER);
    }

    public void setLoginButton(By loginButton) {
        SearchPage.loginButton = loginButton;
    }

}
