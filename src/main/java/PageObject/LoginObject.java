package PageObject;

import org.openqa.selenium.By;

public class LoginObject {
    public final static By
            loginButton=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"),
            loginEmailField=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"),
            loginPasswordField=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"),
            loginToAccountButton=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

}
