package PageObject;

import org.openqa.selenium.By;

public class AddProductObject {
    final public static By
        productsButton=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"),
        addToCartButton=By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"),
        continueShoppingButton=By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"),
        cartButton=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
}
