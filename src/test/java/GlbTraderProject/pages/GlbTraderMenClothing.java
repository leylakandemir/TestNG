package GlbTraderProject.pages;

import GlbTraderProject.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GlbTraderMenClothing {


    public GlbTraderMenClothing(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy(className = "icon_widh")
        public WebElement menclothingbutton;
        @FindBy(xpath="//h4/a")
        public List<WebElement> sonuclarListesi;
        @FindBy(linkText = "Tops & Tees")
    public WebElement topsandteeslinki;
    @FindBy(className = "short_by")
    public WebElement sort_by_yazisi;
    @FindBy(xpath = "//a[@title='Maniac Solid Mens Round Neck T-Shirt']")
    public WebElement product;
    @FindBy(className = "pro_new_head")
    public WebElement product_yazisi;
    @FindBy (linkText = "S")
    public WebElement sizebutton;
    @FindBy (xpath = "//img[@title='Yellow']")
    public WebElement colorbutton;
    @FindBy (className = "plus")
    public WebElement numberbutton;
    @FindBy (name = "buynow_submit")
    public WebElement buynowbutton;
    @FindBy (className = "page-header")
    public WebElement sonucSayfasi;

}
