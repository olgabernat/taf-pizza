package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BarPage {
    private WebDriver driver;
    private String headerText = "//h1[@class='category-title']";
    private String latteAddLink = "//button[@data-id='491']";

    public BarPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        WebElement headerTextElement = driver.findElement(By.xpath(headerText));
        return headerTextElement.getText();
    }

    public void clickLatteAddButton() {
        WebElement latteAddButtonElement = driver.findElement(By.xpath(latteAddLink));
        latteAddButtonElement.click();
    }
}
