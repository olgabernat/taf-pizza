package by.terrapizza.taf.ui;

import by.terrapizza.taf.po.HomePage;
import by.terrapizza.taf.po.MenuPage;
import by.terrapizza.taf.po.PizzaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTest extends BaseTest {
    @Test
    public void testPizzaOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMenuLink();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickPizzaLink();
        PizzaPage pizzaPage = new PizzaPage(driver);
        String actualHeader = pizzaPage.getHeaderText();
        String eхpectedHeader = "Пицца";
        Assertions.assertEquals(eхpectedHeader, actualHeader);
    }
}
