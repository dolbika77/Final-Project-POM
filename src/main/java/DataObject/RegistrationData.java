package DataObject;

import com.github.javafaker.Faker;

public class RegistrationData {
    static Faker faker=new Faker();
    final public static String
            name=String.valueOf(faker.name().firstName()),
            emailAdress=String.valueOf(faker.internet().emailAddress()),
            password="Gamarjoba",
            dayOfBirth=String.valueOf(faker.number().numberBetween(1,32)),
            monthOfBirth="November",
            yearOfBirth=String.valueOf(faker.number().numberBetween(1900,2023)),
            firstName= String.valueOf(faker.name().firstName()),
            lastName=String.valueOf(faker.name().lastName()),
            company=String.valueOf(faker.company().name()),
            adress1=String.valueOf(faker.address().fullAddress()),
            adress2=String.valueOf(faker.address().fullAddress()),
            country="Canada",
            state="Ontario",
            city="Toronto",
            zipcode=String.valueOf(faker.address().zipCode()),
            mobileNumber=String.valueOf(faker.phoneNumber().cellPhone());
}
