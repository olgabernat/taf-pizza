package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CartPage {
    private WebDriver driver;
    private By cartButton = By.xpath("//div[@class='basket__btn-top basket__top basket__btn-top--sm']");
    private By firstProductInCartText = By.xpath("//div[@class='basket__products-item-name'][contains(text(), 'Пицца Маргарита')]");
    private By secondProductInCartText = By.xpath("//div[@class='basket__products-item-name'][contains(text(), 'Латте')]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCartButton() {
        WebElement cartButtonElement = driver.findElement(cartButton);
        cartButtonElement.click();
    }

    public List<String> getProductNames() {
        List<String> productNames = new ArrayList<>();

        WebElement firstProductElement = driver.findElement(firstProductInCartText);
        productNames.add(firstProductElement.getText());

        WebElement secondProductElement = driver.findElement(secondProductInCartText);
        productNames.add(secondProductElement.getText());

        return productNames;
    }
}
