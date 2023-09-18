package by.terrapizza.taf.po;

import by.terrapizza.taf.util.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BarPage {
    private WebDriver driver;
    private String headerText = "//h1[@class='category-title']";
    private String latteAddLink = "//button[@data-id='491']";

    public BarPage() {
        this.driver = Singleton.getDriver();
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
