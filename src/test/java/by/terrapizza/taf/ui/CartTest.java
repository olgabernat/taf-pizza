package by.terrapizza.taf.ui;

import by.terrapizza.taf.po.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CartTest extends BaseTest {
    @Test
    public void testAddingToCart() {
        HomePage homePage = new HomePage();
        homePage.clickMenuLink();

        MenuPage menuPage = new MenuPage();
        menuPage.clickPizzaLink();

        PizzaPage pizzaPage = new PizzaPage();
        pizzaPage.clickPizzaMargaritaAddButton();

        homePage.clickMenuLink();
        menuPage.clickBarLink();

        BarPage barPage = new BarPage();
        barPage.clickLatteAddButton();

        CartPage cartPage = new CartPage();
        cartPage.clickCartButton();
        List<String> actualCartProducts = cartPage.getProductNames();
        List<String> expectedCartProducts = List.of("Пицца Маргарита Классическая 32 см", "Латте");
        System.out.println(actualCartProducts);
        System.out.println(expectedCartProducts);
        //Assertions.assertTrue(actualCartProducts.containsAll(expectedCartProducts));
        Assertions.assertEquals(expectedCartProducts, actualCartProducts);
    }
}
