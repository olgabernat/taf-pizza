package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    private WebDriver driver;
    private String pizzaLink = "//a[@class='menu-cats-list-item__info'][contains(@href,'/catalog/picca')]";
    private String barLink = "//a[@class='menu-cats-list-item__info'][contains(@href,'/catalog/bar')]";

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPizzaLink() {
        WebElement pizzaButtonElement = driver.findElement(By.xpath(pizzaLink));
        pizzaButtonElement.click();
    }

    public void clickBarLink() {
        WebElement barButtonElement = driver.findElement(By.xpath(barLink));
        barButtonElement.click();
    }
}
