package StepObject;

import Functions.Functions;
import Utils.WebdriverAction;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static PageObject.SubscritionObject.*;

public class SubscritionStep extends WebdriverAction {

    public SubscritionStep(WebDriver driver) {
        super(driver);
    }
    Functions functions =new Functions(driver);


    @Step("SubscritionInput -მდე ჩასქროლვა")
    public void scrollToSubscritionInput(){
        functions.scrollToElementBySelector(subscritionInpute);
    }
    @Step("მეილის ჩაწერა")
    public void insertMailToSubscritionInput(String mail){
        functions.sendKeyBySelector(subscritionInpute,mail);
    }
    @Step("გამოწერა ღილაკზე დაჭერა")
    public void clickOnArrowButton(){
        functions.clickOnElementBySelector(arrowButton);
    }

}
