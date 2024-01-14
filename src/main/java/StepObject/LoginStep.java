package StepObject;
import Functions.Functions;
import Utils.WebdriverAction;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import static DataObject.LoginData.correctEmail;
import static DataObject.LoginData.correctPassword;
import static PageObject.LoginObject.*;


public class LoginStep extends WebdriverAction {
    Functions functions=new Functions(driver);
    public LoginStep(WebDriver driver) {
        super(driver);
    }

    @Step("login ღილაკზე დაკლიკება")
    public void loginButtonAction(){
        functions.clickOnElementByXPath(loginButton);
    }
    @Step("მეილის შეყვანა")
    public void fillEmailAdress(String email){
        functions.sendKeysByXPath(loginEmailField,email);
    }
    public void fillPassword(String password){
        functions.sendKeysByXPath(loginPasswordField,password);
    }
    public void clickLoginToAccountButton(){
        functions.clickOnElementByXPath(loginToAccountButton);
    }
}
