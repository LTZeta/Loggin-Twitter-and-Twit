package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends  AbstractPage{

    private static By loginButton;
    private static By loginData;
    public SearchPage(WebDriver driver) { super(driver); }

    public void loadPage(String page){
        getDriver().get(page);
    }

    public void clickLoginButton(){
        getDriver().manage().window().maximize();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        getDriver().findElement(loginButton).sendKeys(Keys.ENTER);
    }

    public void clickLoginWithGoogle(){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(loginData));
        getDriver().findElement(loginData).sendKeys(Keys.ENTER);
    }

    public void setLoginButton(By loginButton) {
        SearchPage.loginButton = loginButton;
    }

    public void setLoginWithGoogle(By loginWithGoogle) {
        SearchPage.loginData = loginWithGoogle;
    }
}
