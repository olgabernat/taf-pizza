package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CartPage {
    private WebDriver driver;
    private By cartButton = By.xpath("//div[@class='basket__top-right']");
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstProductElement = wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductInCartText));
        productNames.add(firstProductElement.getText());

        WebElement secondProductElement = wait.until(ExpectedConditions.visibilityOfElementLocated(secondProductInCartText));
        productNames.add(secondProductElement.getText());

        return productNames;
    }
}
