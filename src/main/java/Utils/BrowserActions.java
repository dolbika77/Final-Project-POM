package Utils;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

public class BrowserActions {
    public static WebDriver driver;
    public static SoftAssert softAssert=new SoftAssert();




    @Step("აქ ხდება ვებ გვერდის გახსნა და რეკლამების ბლოკირება")
    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        ChromeOptions opt =new ChromeOptions();
        opt.addExtensions(new File("C:\\Users\\dolbi\\OneDrive\\Desktop\\crx\\AdBlock.crx"));

        driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        Set<String> windowsHandles= driver.getWindowHandles();
//        System.out.println(windowsHandles);
        Iterator<String > iterator= windowsHandles.iterator();
        String win=iterator.next();
        driver.switchTo().window(win);


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

    @AfterTest
    public void assertAll(){
        softAssert.assertAll();

    }

}
