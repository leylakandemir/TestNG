package GlbTraderProject.pages;

import GlbTraderProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (linkText = "Sign In")
    public WebElement signIn;
    @FindBy (id = "email")
    public WebElement email;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (name = "submit")
    public WebElement loginButonu;
}
