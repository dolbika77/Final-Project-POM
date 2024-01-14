package StepObject;

import Functions.Functions;
import Utils.WebdriverAction;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import static PageObject.LogOutObject.*;

public class LogOutStep extends WebdriverAction {
    public LogOutStep(WebDriver driver) {
        super(driver);
    }
    Functions functions=new Functions(driver);

    @Step("logout ღილაკზე დაკლიკება")
    public void clickOnLogoutButton(){
        functions.clickOnElementBySelector(logoutButton);
    }
}
