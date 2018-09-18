import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EbaySignIn {
    private static By singinbutton=By.linkText("Sign in");
    private static By emailbutton=By.id("userid");
    private static By Passwordbutton=By.cssSelector("[type=password]");
    private static By signinbutton2=By.id("sgnBt");

    public static void signInFunction(WebDriver driver){
        driver.findElement(EbaySignIn.singinbutton).click();
    }
    public static void passwordFunction(WebDriver driver){
        driver.findElement(EbaySignIn.Passwordbutton).sendKeys("i dont have one");
    }
    public static void emailFunction(WebDriver driver){
        driver.findElement(EbaySignIn.emailbutton).sendKeys("im_not_regesterd@hotmail.com");
    }
    public static void signInFunction2(WebDriver driver){
        driver.findElement(EbaySignIn.signinbutton2).click();
    }
}

