package GlbTraderProject.tests;

import GlbTraderProject.pages.WomensClothesPage;
import GlbTraderProject.utilities.Driver;
import GlbTraderProject.utilities.TestBaseFinal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WomenClothesTest extends TestBaseFinal {
    WomensClothesPage womensClothes = new WomensClothesPage();
    @Test
    public void womenClothesTest01(){
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get("https://glbtrader.com");
        womensClothes.seeAllLinks.click();
        String url = Driver.getDriver().getCurrentUrl();
        // User verifies the link is true or not.
        softAssert.assertTrue(url.contains("categories"));
        Select select = new Select(womensClothes.searchBox);
        select.selectByVisibleText("Women Clothing & Accessories");
        softAssert.assertEquals("Women Clothing & Accessories",select.getFirstSelectedOption().getText());
        womensClothes.womenClothes.click();
        for (WebElement w:womensClothes.womenClothesList) {
            System.out.println(w.getText());
        }
        System.out.println(womensClothes.womenClothesList.size());
        softAssert.assertTrue(womensClothes.womenClothesList.size()==1);
        womensClothes.accessoriesLink.click();
        softAssert.assertTrue(womensClothes.sunGlassesImage.isDisplayed());
        Driver.getDriver().navigate().back();
        womensClothes.blousesLink.click();
        softAssert.assertAll();
    }
}

