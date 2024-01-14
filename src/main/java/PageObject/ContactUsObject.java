package PageObject;

import org.openqa.selenium.By;

public class ContactUsObject {
    public final static By
        contactUsButton=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a"),
        nameField=By.name("name"),
        emailField=By.name("email"),
        subjectField=By.name("subject"),
        messageField=By.name("message"),
        uploadFile=By.name("upload_file"),
        submitButton=By.name("submit"),
        goToHomePageButton=By.xpath("//*[@id=\"form-section\"]/a");
}
