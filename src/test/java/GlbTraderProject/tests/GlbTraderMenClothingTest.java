package GlbTraderProject.tests;

import GlbTraderProject.pages.GlbTraderMenClothing;
import GlbTraderProject.pages.SignInPage;
import GlbTraderProject.utilities.ConfigurationReader;
import GlbTraderProject.utilities.Driver;
import GlbTraderProject.utilities.TestBaseFinal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlbTraderMenClothingTest extends TestBaseFinal {
    @Test
    public void loginTest() {
        SignInPage loginPage = new SignInPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("glbtrader_url"));
        loginPage.signIn.click();
        loginPage.email.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButonu.click();

    }

  @Test
    public void GlbTraderMenClothingTest(){
      loginTest();
      Driver.getDriver().get(ConfigurationReader.getProperty("glbtrader_url"));
      GlbTraderMenClothing glbTraderMenClothing= new GlbTraderMenClothing();
      glbTraderMenClothing.menclothingbutton.click();
      String link1 = glbTraderMenClothing.sonuclarListesi.get(0).getText();
      System.out.println(link1);
      Assert.assertEquals(link1,"Tops & Tees");

  }
  @Test
    public void GlbTraderMenClothingTest2(){
      loginTest();
      Driver.getDriver().get(ConfigurationReader.getProperty("glbtrader_url"));
      GlbTraderMenClothing glbTraderMenClothing= new GlbTraderMenClothing();
      glbTraderMenClothing.menclothingbutton.click();
      glbTraderMenClothing.topsandteeslinki.click();
      String yazi = glbTraderMenClothing.sort_by_yazisi.getText();
      System.out.println(yazi);
      Assert.assertTrue(yazi.contains("Sort By"));

    }
    @Test
    public void GlbTraderMenClothingTest3(){
        Driver.getDriver().get(ConfigurationReader.getProperty("product_url"));
        GlbTraderMenClothing glbTraderMenClothing= new GlbTraderMenClothing();
        glbTraderMenClothing.product.click();
        boolean visible = glbTraderMenClothing.product_yazisi.isDisplayed();
       // String s= glbTraderMenClothing.product_yazisi.getText();
        Assert.assertTrue(visible);
        //System.out.println(s);

    }
    @Test
    public void GlbTraderMenClothingTest4() {
        Driver.getDriver().get(ConfigurationReader.getProperty("product2_url"));
        GlbTraderMenClothing glbTraderMenClothing= new GlbTraderMenClothing();
        glbTraderMenClothing.sizebutton.click();
        glbTraderMenClothing.colorbutton.click();
        glbTraderMenClothing.numberbutton.click();
        glbTraderMenClothing.buynowbutton.click();
        //boolean iceriyorMu=  glbTraderMenClothing.sonucSayfasi.getText().contains("Shopping Cart");
        //Assert.assertTrue(iceriyorMu);

    }
    }

