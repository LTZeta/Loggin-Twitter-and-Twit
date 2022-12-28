package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PhraseToTwit extends AbstractPage{

    private final static By clickAudience = By.xpath("//div[@class='css-1dbjc4n']/div[@class='css-18t94o4 css-1dbjc4n r-1niwhzg r-1ets6dv r-sdzlij r-1phboty r-rs99b7 r-1ceczpf r-lp5zef r-1ny4l3l r-1e081e0 r-o7ynqc r-6416eg r-lrvibr']");

    private final static By chooseAudience = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1ny4l3l r-ymttw5 r-1f1sjgu r-o7ynqc r-6416eg r-13qz1uu']");

    private final static By twit = By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");

    public PhraseToTwit(WebDriver driver){ super(driver); }

    public void twitThis (String phrase){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(clickAudience));
        getDriver().findElement(clickAudience).click();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(chooseAudience));
        List<WebElement> webElementList = getDriver().findElements(chooseAudience);
        webElementList.get(1).click();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(twit));
        getDriver().findElement(twit).sendKeys(phrase + Keys.ENTER);
    }

}
