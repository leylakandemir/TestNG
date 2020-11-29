package GlbTraderProject.tests;

import GlbTraderProject.pages.SignInPage;
import GlbTraderProject.utilities.ConfigurationReader;
import GlbTraderProject.utilities.Driver;
import org.testng.annotations.Test;

public class SignInTest {

    SignInPage signInPage = new SignInPage();

    @Test
    public void loginTest() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbtrader_url"));
        signInPage.signIn.click();
        signInPage.email.sendKeys(ConfigurationReader.getProperty("email"));
        signInPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        signInPage.loginButonu.click();

    }
}