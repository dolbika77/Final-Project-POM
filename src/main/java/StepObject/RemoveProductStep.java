package StepObject;

import Functions.Functions;
import PageObject.RemoveProductObject;
import Utils.WebdriverAction;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import static PageObject.RemoveProductObject.*;

public class RemoveProductStep extends WebdriverAction {
    Functions functions=new Functions(driver);
    public RemoveProductStep(WebDriver driver) {
        super(driver);
    }
    @Step("პროდუქტის წაშლა ღილაკზე დაჭერა")
    public void clickOnRemoveProductButton(){
        functions.clickOnElementBySelector(deleteFromCart);
    }
}
