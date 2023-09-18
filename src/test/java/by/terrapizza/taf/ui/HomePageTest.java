package by.terrapizza.taf.ui;

import by.terrapizza.taf.po.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void testHomePageOpened() {
        HomePage homePage = new HomePage();
        String actualCopywriterText = homePage.getCopyright();
        String extendsCopywriterText = "Copyright 2000 - 2023. Все права защищены. Любое копирование контента разрешено только с согласия правообладателя.";
        Assertions.assertEquals(extendsCopywriterText, actualCopywriterText);
    }
}
