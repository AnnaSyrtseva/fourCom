package by.itacademy.asyrtseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FixPriceTest extends BaseTest {
   /* @Test
    public void testCartersLoginIncorrectCredentials() throws InterruptedException{
        CartersPage cartersPage = new CartersPage(driver);
        cartersPage.clickCloseButtonModalPage();
        cartersPage.clickButtonAccount();
        cartersPage.sendKeysInputEmail("test@mail.com");
        cartersPage.sendKeysInputPassword("qwertyu123*");
        cartersPage.clickButtonSignIn();
        String actualAllertText = cartersPage.getTextAllertSignIn();
        String expectedAllertText = "Incorrect username or password. Please update the required fields and try again.";
        Assertions.assertEquals(expectedAllertText, actualAllertText);
    }*/
    @Test
    public void testFixPriceLoginIncorrectCredentials() throws InterruptedException{
        FixPricePage fixPricePage = new FixPricePage(driver);
        fixPricePage.clickButtonLogIn();
        fixPricePage.clickButtonLogViaEmail();
        fixPricePage.sendKeysInputEmail("qgfvdsdvhyu@mail.com");
        fixPricePage.sendKeysInputPassword("qwerty123*");
        fixPricePage.clickButtonCheckbox();
        Thread.sleep(2000);
        fixPricePage.clickButtonEnter();
        String actualErrorIncorrectCredentials = fixPricePage.getTextErrorIncorrectCredentials();
        String expectedErrorIncorrectCredentials = "Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4";
        Assertions.assertEquals(actualErrorIncorrectCredentials, expectedErrorIncorrectCredentials);

    }

}