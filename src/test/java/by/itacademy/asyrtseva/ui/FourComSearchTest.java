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
    public void testFourComSearchKapelusz() throws InterruptedException{

        Thread.sleep(5000);
        fourComPage.clickButtonCookie();
        fourComPage.sendKeysSearch("KAPELUSZ");
        Thread.sleep(7000);
        //List<WebElement> productCards = fourComPage.getProductCards();
        //fourComPage.printProductCardText();
      //  String productCards = fourComPage.getProductCards();
        List<WebElement> searchItems = searchPage.getProductCards();
        Assertions.assertEquals(5, searchItems.size());
        ;

    }

    @Test
    public void testFourComSearchItemKapelusz() throws InterruptedException{
        FourComPage fourComPage = new FourComPage();
        SearchPage searchPage = new SearchPage();
        Thread.sleep(7000);
        fourComPage.clickButtonCookie();
        fourComPage.sendKeysSearch("KAPELUSZ");
        Assertions.assertEquals("Kapelusz bucket hat sztruksowy damski", searchPage.getTextResultSearchItemKapelusz());

    }

    @Test
    public void testFourComSearchItemKoszulka() throws InterruptedException{
        FourComPage fourComPage = new FourComPage();
        SearchPage searchPage = new SearchPage();
        Thread.sleep(7000);
        fourComPage.clickButtonCookie();
        fourComPage.sendKeysSearch("Koszulka");
        Assertions.assertEquals("Koszulka kibica męska", searchPage.getTextResultSearchItemKoszulka());

    }
}
