import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.PhraseToTwit;
import pageobjects.SearchPage;
import pageobjects.SignIn;

import java.util.Scanner;

public class TwitSomething {

    private WebDriver driver;

    @BeforeClass
    public void initWebDriver() { driver = new ChromeDriver(); }
    @Test
    public void twitSomething(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribi tu email de twitter:");
        String email = scanner.next();
        System.out.println("Escribi tu contraseña de twitter:");
        String password = scanner.next();
        System.out.println("Escribi el tweet que deseas publicar:");
        String tweet = scanner.next();


        SearchPage searchPage = new SearchPage(driver);
        searchPage.loadPage("https://www.twitter.com");
        searchPage.getDriver().manage().window().maximize();
        searchPage.setLoginButton(By.xpath("//a[@class='css-4rbku5 css-18t94o4 css-1dbjc4n r-1niwhzg r-sdzlij r-1phboty r-rs99b7 r-1loqt21 r-2yi16 r-1qi8awa r-1ny4l3l r-ymttw5 r-o7ynqc r-6416eg r-lrvibr']"));
        searchPage.clickLoginButton();

        SignIn signIn = new SignIn(driver);
        signIn.setEmailInput(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-xd6kpl r-1pn2ns4 r-ttdzmv']//input[@name='text']"));
        signIn.setPasswordInput(By.xpath("//input[@name='password']"));
        signIn.signIn(email,password);

        PhraseToTwit twit = new PhraseToTwit(driver);
        twit.twitThis(tweet);
    }
    @AfterClass
    public void quitWebDriver() { driver.quit(); }

}
