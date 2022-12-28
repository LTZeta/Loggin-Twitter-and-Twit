package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(200));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

}
