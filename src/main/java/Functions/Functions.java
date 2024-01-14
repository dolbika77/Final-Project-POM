package Functions;

import Utils.WebdriverAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static PageObject.AddProductObject.continueShoppingButton;

public class Functions extends WebdriverAction {
    public Functions(WebDriver driver) {
        super(driver);
    }

    public void clickOnElementByXPath(By xPath){
        WebElement el=driver.findElement(xPath);
        el.click();
    }

    public static void clickOnElementById(By id){
        WebElement el=driver.findElement(id);
        el.click();
    }

    public void sendKeysByXPath(By xPath, String value){
        WebElement el=driver.findElement(xPath);
        el.sendKeys(value);
    }
    public void sendKeysById(By id, String value){
        WebElement el=driver.findElement(id);
        el.sendKeys(value);
    }

    public void clickOnElementBySelector(By selector){
        WebElement el=driver.findElement(selector);
        el.click();
    }
    public void sendKeyBySelector(By selector,String value){
        WebElement el=driver.findElement(selector);
        el.sendKeys(value);

    }
    public void scrollToElementBySelector(By selector){
        WebElement el=driver.findElement(selector);
        Actions actions=new Actions(driver);
        actions.moveToElement(el).perform();
    }
    public void waitUntilElementToBeClickable(By selector){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath())));
    }
}
