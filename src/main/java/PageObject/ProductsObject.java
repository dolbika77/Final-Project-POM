package PageObject;

import org.openqa.selenium.By;

public class ProductsObject {
    public final static By
        productsButton=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"),
        searchInput=By.name("search"),
        searchButton=By.id("submit_search");

}
