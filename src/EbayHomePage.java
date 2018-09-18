import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import org.junit.BeforeClass;
import org.junit.Test;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EbayHomePage {
    public static WebDriver driver;
    public static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException, NullPointerException, ParserConfigurationException {
        File configXmlFile = new File("C:\\Users\\Karam\\Desktop\\browsers.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;

        dBuilder = dbFactory.newDocumentBuilder();

        Document doc = null;

        assert dBuilder != null;
        doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }
    @BeforeClass
    public static void beforeStarting() throws IOException, SAXException, ParserConfigurationException {
        String databrowser = getData("browser1");
        switch (databrowser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karam\\Desktop\\selenum+drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "firfox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karam\\Desktop\\selenum+drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get("https://www.ebay.com/");
                break;

        }

    }
    @Before
    public void waitforaction(){
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
    }
   @Test
    public void test1_signinTest(){
        //this function click at sign in button in home page
    EbaySignIn.signInFunction(driver);
    //this function insert email
    EbaySignIn.emailFunction(driver);
    //this function insert password
    EbaySignIn.passwordFunction(driver);
    //this function click on sign in button at the sign in page
    EbaySignIn.signInFunction2(driver);
    }
    @Test
    public void test2_regestrationTest() throws InterruptedException {
        //this function click on regestration button at home page
Regestrationpage.regestrationFunction(driver);
//this function insert first name
Regestrationpage.firstNameFunction(driver);
//this function insert last name
        Regestrationpage.lastNameFunction(driver);
        //THIS FUNCTION INSERT EMAIL
        Regestrationpage.emailFunction(driver);
        //this function insert password
        Regestrationpage.passwordFunction(driver);
        //this function click on show checkbox in regestration page
        Regestrationpage.showCheckBoxFunction(driver);
        //this function click on creat acount button in regestration page
       Regestrationpage.creatAcountFunction(driver);
    }

    @Test
    public void test3_homePageTest() throws InterruptedException, AWTException {
        //this function take the user to the top page when clicked
        Ebay15IteamTest.hoveOvereEbayFun(driver);
        //this function click on shop by catagory at top page
        Ebay15IteamTest.shopByCatagorylist(driver);
        //this function hove over the bil icon and click the sign in button and circle back to home page
        Ebay15IteamTest.billButtonFun(driver);
        //this function click on the shoping cart and circle back to home page
        Ebay15IteamTest.shopingCartFun(driver);
        //this function send text to search field
        Ebay15IteamTest.searchFieldFun(driver);
        //this function click on serach button at top hom page
        Ebay15IteamTest.searchButtonFun(driver);
        //this function click on catagory and select catagory from the list
        Ebay15IteamTest.catagoryListFun(driver);
        //this function click on advance button at top page and back to home page
        Ebay15IteamTest.advanceButtonFun(driver);
        //this function hover on electronic catagory
        Ebay15IteamTest.electronicCatagoryFun(driver);
        //this function pick help and contact button
        Ebay15IteamTest.helpAndContactFun(driver);
        //this function click on sell button at top page
        Ebay15IteamTest.sellFun(driver);
//this function scrol to see all deals button and click on it
        Ebay15IteamTest.seealldealsFun(driver);
        //this function select from the daily deals scale and pick point 3
        Ebay15IteamTest.selectfromscalefunction(driver);
//this function click on trend collection button
        Ebay15IteamTest.trendingCollectionfun(driver);
        //this function click on first option of tools and apps catagory
        Ebay15IteamTest.toolsAndAppsFun(driver);


    }
    @AfterClass
    public static void afterclass(){
        driver.quit();
    }
}
