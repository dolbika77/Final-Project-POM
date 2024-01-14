package PageObject;

import org.openqa.selenium.By;

public class RegistrationObject {
    final public static By
            mainPageSignUpButton=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"),
            signUpNameField=By.xpath("//input[@type='text' and @data-qa='signup-name']"),
            signUpEmailField=By.xpath("//input[@type='email' and @data-qa='signup-email']"),
            signUpButton=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"),
            genderClass=By.className("radio"),
            passwordField=By.id("password"),
            dateOfBirthDay=By.id("days"),
            dateOfBirthMonth=By.id("months"),
            dateOfBirthYears=By.id("years"),
            newsletterCheckbox=By.id("newsletter"),
            offersCheckbox=By.id("optin"),

    //    adress information
            firstNameField=By.name("first_name"),
            lastNameField=By.name("last_name"),
            companyField=By.name("company"),
            adress1=By.name("address1"),
            adress2=By.name("address2"),
            countrySelector=By.name("country"),
            stateSelector=By.name("state"),
            citySelector=By.name("city"),
            zipcodeSelector=By.name("zipcode"),
            mobileNumberSelector=By.name("mobile_number"),
            createAccountButton=By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"),
            accountCreatedContinueButton=By.linkText("Continue"),
            deleteAccount=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
}
