package StepObject;

import Functions.Functions;
import Utils.BrowserActions;
import Utils.WebdriverAction;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static PageObject.AddProductObject.*;
import static PageObject.AddProductObject.productsButton;
import static PageObject.ProductsObject.*;
import static PageObject.SubscritionObject.*;

public class AddProductStep extends WebdriverAction {
    public AddProductStep(WebDriver driver) {
        super(driver);
    }
    Functions functions =new Functions(driver);
    @Step("product ღილაკზე დაკლიკება")
    public void clickOnProductsButton(){
        functions.clickOnElementBySelector(productsButton);
    }
    @Step("პირველ პროდუქტის არჩევა")
    public void whichElementClick(int elementNumber){
        List<WebElement> elements=driver.findElements(viewProductSelector);
        try {
            if (!elements.isEmpty()){
                elements.get(elementNumber).click();
            }
        } catch (Exception e){
            System.out.println("There was no elements");
        }
    }
    @Step("კალათაში დამატება")
    public void clickAddToCartButton(){
        functions.clickOnElementBySelector(addToCartButton);
    }
    @Step("continue ღილაკზე დაკლიკება")
    public void clickOnContinueButton(){
        functions.clickOnElementBySelector(continueShoppingButton);
    }
    public void waitContinueButtonToBeClickable(){
        functions.waitUntilElementToBeClickable(addToCartButton);
    }
    @Step("კალათში გადასვლა")
    public void clickCartButton(){
        functions.clickOnElementByXPath(cartButton);
    }

    public void scrollToElement(){
        WebElement el=driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/div[2]/div/ul/li[8]/a"));
        if (!el.isDisplayed()){
            Actions actions=new Actions(driver);
            actions.scrollToElement(el).perform();
        }
    }

}
