import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.PhraseToTwit;
import pageobjects.SearchPage;
import pageobjects.SignIn;
public class TwitSomething {
    private WebDriver driver;

    @BeforeClass
    public void initWebDriver() { driver = new ChromeDriver(); }

    @Test
    public void twitSomething(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.loadPage("https://www.twitter.com");
        searchPage.setLoginButton(By.xpath("//a[@class='css-4rbku5 css-18t94o4 css-1dbjc4n r-1niwhzg r-sdzlij r-1phboty r-rs99b7 r-1loqt21 r-2yi16 r-1qi8awa r-1ny4l3l r-ymttw5 r-o7ynqc r-6416eg r-lrvibr']"));
        searchPage.clickLoginButton();
        searchPage.setLoginWithGoogle(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe  hJDwNd-SxQuSe i5vt6e-Ia7Qfc JGcpL-RbRzK']"));
        searchPage.clickLoginWithGoogle();
        searchPage.getDriver().manage().window().maximize();

        SignIn signIn = new SignIn(driver);
        signIn.setEmailInput(By.id("identifierId"));
        signIn.setPasswordInput(By.name("Passwd"));
        signIn.signInWithGoogle("leituz1023@gmail.com","asddsa");

        PhraseToTwit twit = new PhraseToTwit(driver);
        twit.twitThis("Estoy publicando esto automaticamente :v");
    }

    @AfterClass
    public void quitWebDriver() { driver.quit(); }
}
