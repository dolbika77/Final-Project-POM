package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebdriverAction {

    public static WebDriver driver;
    public WebdriverAction(WebDriver driver){
        WebdriverAction.driver =driver;
    }

//    public WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10000));

}
