package by.terrapizza.taf.ui;

import by.terrapizza.taf.po.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CartTest extends BaseTest {
    @Test
    public void testAddingToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMenuLink();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickPizzaLink();

        PizzaPage pizzaPage = new PizzaPage(driver);
        pizzaPage.clickPizzaMargaritaAddButton();

        homePage.clickMenuLink();
        menuPage.clickBarLink();

        BarPage barPage = new BarPage(driver);
        barPage.clickLatteAddButton();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCartButton();
        List<String> actualCartProducts = cartPage.getProductNames();
        List<String> expectedCartProducts = List.of("Пицца Маргарита Классическая 32 см", "Латте");
        Assertions.assertTrue(actualCartProducts.containsAll(expectedCartProducts));
    }
}
