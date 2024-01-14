package StepObject;

import Functions.Functions;
import Utils.WebdriverAction;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import static PageObject.ContactUsObject.*;

public class ContactUsStep extends WebdriverAction {
    Functions functions=new Functions(driver);
    public ContactUsStep(WebDriver driver) {
        super(driver);
    }

    @Step("Contact us ღილაკზე დაკლიკება")
    public void clickContactUs(){
        functions.clickOnElementBySelector(contactUsButton);
    }
    public void fillName(String name){
        functions.sendKeyBySelector(nameField,name);
    }
    public void fillEmail(String email){
        functions.sendKeyBySelector(emailField,email);
    }
    public void fillSubject(String subject){
        functions.sendKeyBySelector(subjectField,subject);
    }
    public void fillMessage(String message){
        functions.sendKeyBySelector(messageField,message);
    }
    @Step("ფაილის ატვირთვა")
    public void uploadFile(String filename){
        functions.sendKeyBySelector(uploadFile, filename);
    }
    public void clickSubmitButton(){
        functions.clickOnElementBySelector(submitButton);
    }
    public void clickToHomeButton(){
        functions.clickOnElementBySelector(goToHomePageButton);
    }

}
