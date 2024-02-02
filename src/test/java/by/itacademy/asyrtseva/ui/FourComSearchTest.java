package by.itacademy.asyrtseva.ui;

import by.itacademy.asyrtseva.BaseTest;
import by.itacademy.asyrtseva.page.FourComPage;
import by.itacademy.asyrtseva.page.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FourComSearchTest extends BaseTest {
    FourComPage fourComPage = new FourComPage();
    SearchPage searchPage = new SearchPage();

    @Test
    public void testFourComSearchItemKapelusz() throws InterruptedException{
        fourComPage.clickButtonCookie();
        fourComPage.sendKeysSearch("KAPELUSZ");
        Assertions.assertEquals("Kapelusz bucket hat sztruksowy damski", searchPage.getTextResultSearchItemKapelusz());

    }

    @Test
    public void testFourComSearchItemKoszulka() throws InterruptedException{
        fourComPage.clickButtonCookie();
        fourComPage.sendKeysSearch("Koszulka");
        Assertions.assertEquals("Koszulka kibica męska", searchPage.getTextResultSearchItemKoszulka());

    }

    @Test void addToCartItem() throws InterruptedException{
        fourComPage.clickButtonCookie();
        fourComPage.sendKeysSearch("BUTY ZIMOWE DCX-22 Z IMPREGNACJĄ CHŁOPIĘCE - CZARNE");
        searchPage.clickButtonItem();
        searchPage.clickButtonSize();
        searchPage.clickButtonSubmit();
        Thread.sleep(2000);
        Assertions.assertEquals("Buty zimowe DCX-22 z impregnacją chłopięce - czarne", searchPage.getTextCartItems());

    }
}
