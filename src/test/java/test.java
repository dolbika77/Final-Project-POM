import PageObject.RemoveProductObject;
import StepObject.*;
import Utils.BrowserActions;
import Utils.WebdriverAction;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.concurrent.ThreadSafe;
import java.time.Duration;
import java.util.List;

import static DataObject.RegistrationData.*;
import static DataObject.LoginData.*;
import static DataObject.ContactUsData.*;
import static DataObject.ProductData.*;


public class test extends BrowserActions {

    @Step("login ფუნქციონალის ტესტირება სწორი მონაცემებით")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void loginWithCorrectData(){
        LoginStep step=new LoginStep(driver);

//        Click on 'Signup / Login' button
        step.loginButtonAction();

//        Verify 'Login to your account' is visible
        checkTextIsVisibleByXPath("Login to your account",
                "//*[@id=\"form\"]/div/div/div[1]/div/h2");

//        Enter correct email address and password
        step.fillEmailAdress(correctEmail);
        step.fillPassword(correctPassword);

//        7. Click 'login' button
        step.clickLoginToAccountButton();

        softAssert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).isDisplayed());
    }

    @Step("login ფუნქციონალის ტესტირება არასწორი მონაცემებით")
    @Test
    public void loginWithIncorrectData(){
        LoginStep step=new LoginStep(driver);

//        Click on 'Signup / Login' button
        step.loginButtonAction();

//        Enter incorrect email address and password
        step.fillEmailAdress(incorrectEmail);
        step.fillPassword(incorrecctPassword);

//        Click 'login' button
        step.clickLoginToAccountButton();

//        Verify error 'Your email or password is incorrect!' is visible
        checkTextIsVisibleByXPath("Your email or password is incorrect!",
                "//*[@id=\"form\"]/div/div/div[1]/div/form/p");
    }

    @Step("logout ფუნქციონალის ტესტირება")
    @Test
    public void logoutUser(){
        LoginStep stepLogin=new LoginStep(driver);
        LogOutStep stepLogout=new LogOutStep(driver);

//        Click on 'Signup / Login' button
        stepLogin.loginButtonAction();

//        Enter correct email address and password
        stepLogin.fillEmailAdress(correctEmail);
        stepLogin.fillPassword(correctPassword);

//        Click 'login' button
        stepLogin.clickLoginToAccountButton();

//        Click 'Logout' button
        stepLogout.clickOnLogoutButton();

//        Verify that user is navigated to login page
        String expectedURL="https://automationexercise.com/login";
        String actualURL=driver.getCurrentUrl();

        softAssert.assertTrue(expectedURL.equals(actualURL));
    }


    @Step("რეგისტრაციის ფუნქციონალის ტესტირება სწორი მონაცემებით")
    @Test
    public void registerNewUser(){
        RegistrationStep step=new RegistrationStep(driver);

//        Click on 'Signup / Login' button
        step.clickSignUpButton();

//        Verify 'New User Signup!' is visible
        checkTextIsVisibleByXPath("New User Signup!",
                "//*[@id=\"form\"]/div/div/div[3]/div/h2");

//        Enter name and email address
        step.fillSignUpNameField(name);
        step.fillSignUpEmailField(emailAdress);

//        Click 'Signup' button
        step.clickNewUserSignUpButton();

//        Verify that 'ENTER ACCOUNT INFORMATION' is visible
        checkTextIsVisibleByXPath("ENTER ACCOUNT INFORMATION",
                "//*[@id=\"form\"]/div/div/div/div[1]/h2/b");

//        Fill details: Title, Name, Email, Password, Date of birth
        step.selectGender();
        step.fillPassword(password);
        step.fillDateOfBirthDay(dayOfBirth);
        step.fillDateOfBirthMonth(monthOfBirth);
        step.fillDateOfBirthYear(yearOfBirth);

//        Select checkboxes
        step.acceptNewsLettersCheckbox();
        step.acceptOffersCheckbox();

//        Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        step.fillFirstName(firstName);
        step.fillLastNameField(lastName);
        step.fillCompanyName(company);
        step.fillAdress(adress1,adress2);
        step.fillCountry(country);
        step.fillState(state);
        step.fillCity(city);
        step.fillZipCode(zipcode);
        step.fillMobileNumber(mobileNumber);

//        Click 'Create Account button'
        step.clickOnCreateAccountButton();

//        Verify that 'ACCOUNT CREATED!' is visible
        checkTextIsVisibleByXPath("ACCOUNT CREATED!",
                "//*[@id=\"form\"]/div/div/div/h2/b");

//        Click 'Continue' button
        step.clickOnContinueButton();

//        Click 'Delete Account' button
        step.clickOnDeleteButton();

//        Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        checkTextIsVisibleByXPath("ACCOUNT DELETED!",
                "//*[@id=\"form\"]/div/div/div/h2/b");
    }

    @Step("რეგისტრაციის ფუნქციონალის ტესტირება უკვე არსებული მონაცემებით")
    @Test
    public void registerUserWithExistingEmail(){
        RegistrationStep step=new RegistrationStep(driver);


//        Click on 'Signup / Login' button
        step.clickSignUpButton();

//        Enter name and already registered email address
        step.fillSignUpNameField(name);
        step.fillSignUpEmailField(correctEmail);

//        Click 'Signup' button
        step.clickNewUserSignUpButton();

//        Verify error 'Email Address already exist!' is visible
        String expectedText="Email Address already exist!";
        WebElement el=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));
        String text=el.getText();
        softAssert.assertTrue(text.matches(expectedText));
    }

    @Step("Contact Us ფუნქციონალის ტესტირება (მესიჯის გაგზავნა)")
    @Test
    public void contactUsFormUploadFile() throws InterruptedException {
        ContactUsStep step=new ContactUsStep(driver);


//        Click on 'Contact Us' button
        step.clickContactUs();

//        Enter name, email, subject and message
        step.fillName(nameContactUs);
        step.fillEmail(emailContactUs);
        step.fillSubject(subject);
        step.fillMessage(message);

//        Upload file
        step.uploadFile(uploadFileLocation);

//        Click 'Submit' button
        step.clickSubmitButton();

//        Click OK button
        Alert alert=driver.switchTo().alert();
        alert.accept();

//        Verify "Get In Touch" is visible
        WebElement element=driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2"));
        String actualText=element.getText();
        String expectedText="Get In Touch";
        softAssert.assertEquals(expectedText,actualText);
        if (expectedText.toUpperCase().equals(actualText)){
            step.clickToHomeButton();
        }
    }

    @Step("პროდუქციის ძებნა და შემოწმება რამდენად შეესაბამება მოძებნილი პროდუქცია მოთხოვნილს")
    @Test
    public void searchProductAndVerifyResults() throws InterruptedException {
        ProductStep step=new ProductStep(driver);

//        Click on 'Products' button
        step.clickOnProductsButton();
        Thread.sleep(3000);

//        Enter product name in search input and click search button
        step.insertSearchProduct(productName);
        Thread.sleep(3000);
        step.clickOnSearchButton();
        Thread.sleep(5000);

//        6. Verify 'SEARCHED PRODUCTS' is visible

        java.util.List<WebElement> searchResults=driver.findElements(By.xpath("//div[@class='single-products']//p"));
        for (int i=0;i<searchResults.size();i++){
//            if (searchResults.get(i).getText().contains(productName)){

            softAssert.assertTrue(searchResults.get(i).getText().toLowerCase().contains(productName.toLowerCase()));
//            System.out.println(searchResults.get(i).getText());
            }
        }
//        7. Verify all the products related to search are visible
//        8. Add those products to cart
//        9. Click 'Cart' button and verify that products are visible in cart
//        10. Click 'Signup / Login' button and submit login details
//        11. Again, go to Cart page
//        12. Verify that those products are visible in cart after login as well


    @Step("გამოწერის ფუნქციონალის ტესტირება ")
    @Test
    public void subscritionOnHomePage() throws InterruptedException {
        SubscritionStep step=new SubscritionStep(driver);
        waitFullPageLoad();

//        Scroll down to footer
        step.scrollToSubscritionInput();

//        Enter email address in input and click arrow button
        step.insertMailToSubscritionInput(correctEmail);
        step.clickOnArrowButton();

//        Verify success message 'You have been successfully subscribed!' is visible
        WebElement subscritionMessage=driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div"));
        softAssert.assertTrue(subscritionMessage.isDisplayed());

        String actualMessage=subscritionMessage.getText();
        String expectedMessage="You have been successfully subscribed!";
        softAssert.assertEquals(actualMessage,expectedMessage);

    }

    @Step("პროდუქციის დამატება კალათაში")
    @Test
    public void addToCart() throws InterruptedException {
         AddProductStep step=new AddProductStep(driver);

//        Click 'Products' button
        step.clickOnProductsButton();

//        Hover over first product and click 'Add to cart'
        waitFullPageLoad();

        step.scrollToElement();
        step.whichElementClick(0);

        waitFullPageLoad();
        Thread.sleep(3000);


//        Click 'Add to cart' button
        step.clickAddToCartButton();
        Thread.sleep(5000);

//        Click 'Continue Shopping' button
        step.clickOnContinueButton();

//        Verify product is added to Cart
        step.clickCartButton();

        WebElement el=driver.findElement(By.className("cart_product"));
        softAssert.assertTrue(el.isDisplayed());

    }

    @Step("პროდუქციის დამატება და შემდეგ წაშლა კალათიდან")
    @Test
    public void removeProductFromCart() throws InterruptedException {

        AddProductStep addStep=new AddProductStep(driver);
        RemoveProductStep removeStep=new RemoveProductStep(driver);

//        Click on 'Products' button
        addStep.clickOnProductsButton();
        waitFullPageLoad();
        addStep.scrollToElement();

//        Add first product
        addStep.whichElementClick(0);
        waitFullPageLoad();
        addStep.clickAddToCartButton();
        Thread.sleep(3000);
        addStep.clickOnContinueButton();
        addStep.clickAddToCartButton();
        addStep.clickCartButton();
        Thread.sleep(3000);
        removeStep.clickOnRemoveProductButton();
        Thread.sleep(3000);

//        check Cart is empty
        softAssert.assertTrue(driver.findElement(By.id("empty_cart")).isDisplayed());


    }


    public void checkTextIsVisibleByXPath(String expectedText, String xPath){
        WebElement el=driver.findElement(By.xpath(xPath));
        String actualText = el.getText();
        softAssert.assertEquals(expectedText,actualText);

    }

    private static void waitFullPageLoad(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
    }

}
