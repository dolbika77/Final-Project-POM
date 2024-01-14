package StepObject;

import Functions.Functions;
import Utils.WebdriverAction;
import static PageObject.ProductsObject.*;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductStep extends WebdriverAction {

    Functions functions=new Functions(driver);
    public ProductStep(WebDriver driver) {
        super(driver);
    }

    @Step("product ღილაკზე დაკლიკება")
    public void clickOnProductsButton(){
        functions.clickOnElementBySelector(productsButton);
    }
    @Step("სასურველი პროდუქციის ჩაწერა")
    public void insertSearchProduct(String product){
        functions.sendKeyBySelector(searchInput,product);
    }
    public void clickOnSearchInput(){
        functions.clickOnElementBySelector(searchInput);
    }
    @Step("ძებნა ღილაკზე დაჭერა")
    public void clickOnSearchButton(){
        functions.clickOnElementBySelector(searchButton);
    }

}
