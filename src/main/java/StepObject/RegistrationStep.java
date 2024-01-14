package StepObject;

import Functions.Functions;
import Utils.WebdriverAction;
import org.openqa.selenium.WebDriver;
import static PageObject.RegistrationObject.*;

public class RegistrationStep extends WebdriverAction {
    public RegistrationStep(WebDriver driver) {
        super(driver);
    }
    Functions functions=new Functions(driver);

    public void clickSignUpButton(){
        functions.clickOnElementBySelector(mainPageSignUpButton);
    }
    public void fillSignUpEmailField(String email){
        functions.sendKeyBySelector(signUpEmailField,email);
    }
    public void fillSignUpNameField(String name){
        functions.sendKeyBySelector(signUpNameField,name);
    }
    public void clickNewUserSignUpButton(){
        functions.clickOnElementBySelector(signUpButton);
    }
    public void selectGender(){
        functions.clickOnElementBySelector(genderClass);
    }
    public void fillPassword(String password){
        functions.sendKeyBySelector(passwordField, password);
    }
    public void fillDateOfBirthDay(String day){
        functions.sendKeyBySelector(dateOfBirthDay,day);
    }
    public void fillDateOfBirthMonth(String month){
        functions.sendKeyBySelector(dateOfBirthMonth, month);
    }
    public void fillDateOfBirthYear(String year){
        functions.sendKeyBySelector(dateOfBirthYears,year);
    }
    public void acceptNewsLettersCheckbox(){
        functions.clickOnElementBySelector(newsletterCheckbox);
    }
    public void acceptOffersCheckbox(){
        functions.clickOnElementBySelector(offersCheckbox);
    }
    public void fillFirstName(String name){
        functions.sendKeyBySelector(firstNameField, name);
    }
    public void fillLastNameField(String lastname){
        functions.sendKeyBySelector(lastNameField, lastname);
    }
    public void fillCompanyName(String company){
        functions.sendKeyBySelector(companyField,company);
    }
    public void fillAdress(String firstAdress,String secondAdress){
        functions.sendKeyBySelector(adress1, firstAdress);
        functions.sendKeyBySelector(adress2, secondAdress);
    }
    public void fillCountry(String country){
        functions.sendKeyBySelector(countrySelector,country);
    }
    public void fillState(String state){
        functions.sendKeyBySelector(stateSelector,state);
    }
    public void fillCity(String city){
        functions.sendKeyBySelector(citySelector,city);
    }
    public void fillMobileNumber(String mobileNumber){
        functions.sendKeyBySelector(mobileNumberSelector,mobileNumber);
    }
    public void fillZipCode(String zipCode){
        functions.sendKeyBySelector(zipcodeSelector,zipCode);
    }
    public void clickOnCreateAccountButton(){
        functions.clickOnElementBySelector(createAccountButton);
    }
    public void clickOnContinueButton(){
        functions.clickOnElementBySelector(accountCreatedContinueButton);
    }
    public void clickOnDeleteButton(){
        functions.clickOnElementBySelector(deleteAccount);
    }
}
