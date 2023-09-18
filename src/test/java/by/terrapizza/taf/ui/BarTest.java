package by.terrapizza.taf.ui;

import by.terrapizza.taf.po.BarPage;
import by.terrapizza.taf.po.HomePage;
import by.terrapizza.taf.po.MenuPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BarTest extends BaseTest {
    @Test
    public void testBarOpened() {
        HomePage homePage = new HomePage();
        homePage.clickMenuLink();
        MenuPage menuPage = new MenuPage();
        menuPage.clickBarLink();
        BarPage barPage = new BarPage();
        String actualHeader = barPage.getHeaderText();
        String eхpectedHeader = "Бар";
        Assertions.assertEquals(eхpectedHeader, actualHeader);
    }
}
