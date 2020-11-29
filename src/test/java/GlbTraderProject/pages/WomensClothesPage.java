package GlbTraderProject.pages;

import GlbTraderProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WomensClothesPage {

    public WomensClothesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//select[@id='header_search_category']")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@class='text-muted']")
    public WebElement seeAllLinks;
    @FindBy (id ="main_v1")
    public WebElement womenClothes;
    @FindBy (xpath = "/html/body/section[2]/div[4]/div/div[1]/div/div[2]/ul")
    public List<WebElement> womenClothesList;
    @FindBy (linkText = "Dresses")
    public WebElement dressesLink;
    @FindBy (xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Blouses-Shirts/2/18']")
    public WebElement blousesLink;
    @FindBy (xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Tops-Tees/2/19']")
    public WebElement topsTeesLink;
    @FindBy(xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Hoodies-Sweatshirts/2/23']")
    public WebElement hoodiesSweatShirtsLink;
    @FindBy(xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Jumpsuits/2/24']")
    public WebElement jumpSuitsLink;
    @FindBy(xpath = "/html/body/section[2]/div[4]/div/div[1]/div/div[2]/ul/li[6]/a")
    public WebElement accessoriesLink;
    @FindBy (xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Intimates/2/26']")
    public WebElement intiMatesLin;
    @FindBy(xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Bottoms/2/27']")
    public WebElement bottomsLink;
    @FindBy (xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Rompers/2/109']")
    public WebElement rompersLink;
    @FindBy(xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Bodysuits/2/110']")
    public WebElement bodySuitsLink;
    @FindBy (xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Jackets-Coats/2/111']")
    public WebElement jacketsCoatsLink;
    @FindBy (xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Suits-Sets/2/112']")
    public WebElement suitsSetsLink;
    @FindBy (xpath = "https://www.glbtrader.com/listing/Women-Clothing-Accessories-Socks-Hosiery/2/113")
    public WebElement socksHoiseryLink;
    @FindBy (xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Sweaters/2/115']")
    public WebElement sweatersLink;
    @FindBy (xpath = "//a[@href='https://www.glbtrader.com/listing/Women-Clothing-Accessories-Shoes/2/590']")
    public WebElement shoesLink;
    @FindBy (xpath = "//button[@name='price_range']")
    public  WebElement filterPriceButton;
    @FindBy (xpath = "/html/body/div[1]/div/div[1]/button[3]")
    public WebElement filterBrandButton;
    @FindBy (xpath = "/html/body/div[1]/div/div[1]/button[4]")
    public WebElement filterColorButton;
    @FindBy (xpath = "/html/body/div[1]/div/div[1]/button[5]")
    public WebElement filterDressLengthButton;
    @FindBy (xpath = "/html/body/div[1]/div/div[1]/button[6]")
    public WebElement filterSleeveLength;
    @FindBy (id = "cart")
    public WebElement addToCart;
    @FindBy (xpath = "/html/body/div[1]/div[4]/div/div/div[2]/div[4]/div[1]/div/div[2]/a")
    public WebElement contactSeller;
    @FindBy (xpath = "//a[@class='default_link_cursor padd_btn poll-right']")
    public WebElement addWishList;
    @FindBy (xpath = "/html/body/div[1]/div/div[3]/div/div/div[1]/div/a/img")
    public WebElement sunGlassesImage;
}
