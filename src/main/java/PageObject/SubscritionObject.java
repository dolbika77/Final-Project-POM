package PageObject;

import org.openqa.selenium.By;

public class SubscritionObject {
    final public static By
        subscritionInpute=By.id("susbscribe_email"),
        successfulSubscrition=By.className("alert-success"),
        arrowButton=By.id("subscribe"),
        viewProductSelector=By.className("fa-plus-square");
}
