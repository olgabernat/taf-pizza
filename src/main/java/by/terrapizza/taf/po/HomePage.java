package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private String copyrightText = "//div[@class='page-footer__copyright']";
    private String menuLink = "//a[@href='https://terrapizza.by/menu']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCopyright() {
        WebElement copyrightTextElement = driver.findElement(By.xpath(copyrightText));
        return copyrightTextElement.getText();
    }

    public void clickMenuLink() {
        WebElement menuButtonElement = driver.findElement(By.xpath(menuLink));
        menuButtonElement.click();
    }
}
