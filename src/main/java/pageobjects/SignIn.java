package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignIn extends AbstractPage{
    private static By emailInput;
    private static By passwordInput;
    public SignIn(WebDriver driver){super(driver);}

    public void signIn(String email, String password){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        getDriver().findElement(emailInput).sendKeys(email + Keys.ENTER);
        getWait().until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        getDriver().findElement(passwordInput).sendKeys(password + Keys.ENTER);
    }


    public void setEmailInput(By emailInput) {
        SignIn.emailInput = emailInput;
    }

    public void setPasswordInput(By passwordInput) {
        SignIn.passwordInput = passwordInput;
    }

}
