package DataObject;

import com.github.javafaker.Faker;

public class ContactUsData {
    static Faker faker=new Faker();
    public final static String
        nameContactUs=String.valueOf(faker.name()),
        emailContactUs=String.valueOf(faker.internet().emailAddress()),
        subject=String.valueOf(faker.lorem().word()),
        message=String.valueOf(faker.lorem()),
        uploadFileLocation="C:\\Users\\dolbi\\OneDrive\\Desktop\\Test.docx";        ;
}
