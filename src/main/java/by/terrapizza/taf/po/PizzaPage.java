package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaPage {
    private WebDriver driver;
    private String headerText = "//h1[@class='category-title']";
    private String margaritaPizzaAddLink = "//button[@data-id='364']";
    private String cookieLink = "//button[@class='close-icon']";

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getHeaderText() {
        WebElement headerTextElement = driver.findElement(By.xpath(headerText));
        return headerTextElement.getText();
    }
    public void clickPizzaMargaritaAddButton() {
        WebElement cookieCloseElement = driver.findElement(By.xpath(cookieLink));
        cookieCloseElement.click();
        WebElement pizzaAddButtonElement = driver.findElement(By.xpath(margaritaPizzaAddLink));
        pizzaAddButtonElement.click();
    }
}
