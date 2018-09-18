import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Regestrationpage {
    private static By regestrationbutton = By.linkText("register");
    private static By firstnamefeald = By.name("firstname");
    private static By lastnamefeald = By.name("lastname");
    private static By emailfeald = By.name("email");
    private static By passwordfeald = By.name("PASSWORD");
    private static By showcheckbox = By.name("checkbox-default");
    private static By creatacountbutton = By.id("ppaFormSbtBtn");

    public static void regestrationFunction(WebDriver driver) {
        driver.findElement(Regestrationpage.regestrationbutton).click();
    }

    public static void firstNameFunction(WebDriver driver) {
        driver.findElement(Regestrationpage.firstnamefeald).sendKeys("karam");
    }

    public static void lastNameFunction(WebDriver driver) {
        driver.findElement(Regestrationpage.lastnamefeald).sendKeys("naser");
    }

    public static void emailFunction(WebDriver driver) {
        driver.findElement(Regestrationpage.emailfeald).sendKeys("karam_m_n@hotmail.com");
    }
    public static void passwordFunction(WebDriver driver) {
        driver.findElement(Regestrationpage.passwordfeald).sendKeys("0000000LLkkS1234");
    }
    public static void showCheckBoxFunction(WebDriver driver) {
        driver.findElement(Regestrationpage.showcheckbox).click();
        driver.findElement(Regestrationpage.showcheckbox).click();
    }
    public static void creatAcountFunction(WebDriver driver) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,30);
        driver.findElement(Regestrationpage.emailfeald).click();
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Regestrationpage.creatacountbutton)));
        driver.findElement(Regestrationpage.creatacountbutton).click();
    }
}