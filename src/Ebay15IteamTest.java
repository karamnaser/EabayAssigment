import javafx.scene.input.MouseEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.SunHints;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Ebay15IteamTest {
    private static By videogame = By.cssSelector("[title=\"Electronics - Video Games & Consoles\"]");
    private static By electroniccatagory = By.linkText("Electronics");
    private static By advancebutton = By.id("gh-as-a");
    private static By searchfield = By.cssSelector("[type=\"text\"]");
    private static By catagorylistbox = By.id("gh-cat");
    private static By searchbutton = By.cssSelector("[type=\"submit\"]");
    private static By shopbycatagorychecklist = By.id("gh-shop-a");
    private static By shopcartbutton = By.id("gh-cart-i");
    private static By billicon = By.id("gh-Alerts-i");
    private static By frameairowleft = By.className("arrow-image");
    private static By frameairowright = By.cssSelector("[aria-label=\"Go to next billboard\"]");
    private static By seealldealsbutton = By.className("daily-deals-link");
    private static By dailydealsselectscale = By.className("page");
    private static By helpandsellbutton = By.className("gh-p");
    private static By hoveOvereEbaybutton = By.linkText("My eBay");
    private static  By ebayelemnts=By.xpath("//*[@id=\"gh-eb-My-o\"]/ul/li[1]/a");
    private static By trendcollectionbutton=By.xpath("//*[@id=\"remainingMainContentFragment\"]/div[5]/a");
    private static By toolsandappsbuttons=By.cssSelector("#gf-BIG > table > tbody > tr > td:nth-child(2) > ul > li:nth-child(7) > a");

    public static void electronicCatagoryFun(WebDriver driver) {
        WebDriverWait wait=new WebDriverWait(driver,30);
        Actions moveoverelement = new Actions(driver);
        moveoverelement.moveToElement(driver.findElement(Ebay15IteamTest.electroniccatagory)).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Ebay15IteamTest.videogame)));
        moveoverelement.moveToElement(driver.findElement(Ebay15IteamTest.videogame)).click().build().perform();
        driver.navigate().back();
    }

    public static void seealldealsFun(WebDriver driver){
        String firstwindowtap=driver.getWindowHandle();
        JavascriptExecutor scrollover = (JavascriptExecutor) driver;
        scrollover.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.className("big-hero-subtitle")));
        driver.findElement(Ebay15IteamTest.seealldealsbutton).click();
        driver.switchTo().window(firstwindowtap);
        driver.get("https://www.ebay.com");
        scrollover.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.className("big-hero-subtitle")));

    }



    public static void selectfromscalefunction(WebDriver driver) {
        String firstwindowtap=driver.getWindowHandle();
       List<WebElement> selectscale = driver.findElements(Ebay15IteamTest.dailydealsselectscale);
        selectscale.get(2).click();
        selectscale.get(1).click();
        selectscale.get(0).click();

    }

    public static void hoveOvereEbayFun(WebDriver driver) {
        WebDriverWait wait=new WebDriverWait(driver,30);
Actions movetoelemnt=new Actions(driver);
Point coordination=driver.findElement(Ebay15IteamTest.hoveOvereEbaybutton).getLocation();
       movetoelemnt.moveByOffset(coordination.getX(),coordination.getY()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Ebay15IteamTest.ebayelemnts)));
       movetoelemnt.moveToElement(driver.findElement(Ebay15IteamTest.ebayelemnts)).click().build().perform();
        String firstwindowtap=driver.getWindowHandle();
        driver.switchTo().window(firstwindowtap);
        driver.navigate().back();
    }


    public static void searchFieldFun(WebDriver driver){
        driver.findElement(Ebay15IteamTest.searchfield).sendKeys("train");
    }



    public static void searchButtonFun(WebDriver driver){
        Actions click=new Actions(driver);
        click.moveToElement(driver.findElement(Ebay15IteamTest.searchbutton)).click().perform();
        driver.navigate().back();

    }


    public static void advanceButtonFun(WebDriver driver){
        driver.findElement(Ebay15IteamTest.advancebutton).click();
        driver.navigate().back();
    }
    static void catagoryListFun(WebDriver driver){
        Select catagorylist=new Select(driver.findElement(Ebay15IteamTest.catagorylistbox));
        catagorylist.selectByValue("20081");

    }


    public static void shopByCatagorylist(WebDriver driver){
        driver.findElement(Ebay15IteamTest.shopbycatagorychecklist).click();
    }


    public static void billButtonFun(WebDriver driver) throws InterruptedException {
        Actions hoveoverelemnt=new Actions(driver);
        hoveoverelemnt.moveToElement(driver.findElement(Ebay15IteamTest.billicon)).perform();
        Thread.sleep(1000);
        driver.findElement(By.id("gh-btn")).click();
        driver.navigate().back();
    }


    public static void shopingCartFun(WebDriver driver){
        driver.findElement(Ebay15IteamTest.shopcartbutton).click();
        driver.navigate().back();
    }


    public static void helpAndContactFun(WebDriver driver){
        List<WebElement>helpandcontact=driver.findElements(Ebay15IteamTest.helpandsellbutton);
        helpandcontact.get(2).click();
        driver.navigate().back();
    }


    public static void sellFun(WebDriver driver){
        List<WebElement>sell=driver.findElements(Ebay15IteamTest.helpandsellbutton);
        sell.get(1).click();
        driver.navigate().back();
    }
    public static void trendingCollectionfun(WebDriver driver){
        driver.findElement(Ebay15IteamTest.trendcollectionbutton).click();
        String firstwindowtap=driver.getWindowHandle();
        driver.switchTo().window(firstwindowtap);
        driver.get("https://www.ebay.com");

    }
    public static void toolsAndAppsFun(WebDriver driver){
        Actions movetoelemnt=new Actions(driver);
        Point coordination=driver.findElement(toolsandappsbuttons).getLocation();
        List<WebElement>toolsandapps=driver.findElements(Ebay15IteamTest.toolsandappsbuttons);
        movetoelemnt.moveToElement(toolsandapps.get(0)).click().build().perform();
        driver.navigate().back();
    }
}


