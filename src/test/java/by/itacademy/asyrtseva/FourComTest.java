package by.itacademy.asyrtseva;

import by.itacademy.asyrtseva.FourComPage;
import by.itacademy.asyrtseva.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FourComTest extends BaseTest {

    @Test
    public void testFourComInvalidCredentials() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        FourConStep fourComStep = new FourConStep(driver);
        fourComStep.openLoginFormFillAndSubmit("teee434k@mail.com", "qwertyyu");
        Thread.sleep(2000);
        String actualResult = fourComPage.getTextErrorCredentials();
        String expectedResult = "Podany e-mail lub hasło są niepoprawne. Upewnij się, że używasz poprawnego adresu e-mailowego i hasła, a następnie ponownie spróbuj się zalogować.";
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testFourComEmptyEmail() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        fourComPage.clickButtonCookie();
        fourComPage.clickButtonMyAccount();
        fourComPage.sendKeysInputEmail("");
        fourComPage.sendKeysInputPAssword("qwerty123");
        fourComPage.clickButtonSubmit();
        String actualResult = fourComPage.getTextErrorEmptyEmail();
        String expectedResult = "To jest wymagane pole.";
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testFourComEmptyPassword() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        fourComPage.clickButtonCookie();
        fourComPage.clickButtonMyAccount();
        fourComPage.sendKeysInputEmail("testy@mail.com");
        fourComPage.sendKeysInputPAssword("");
        fourComPage.clickButtonSubmit();
        String actualResult = fourComPage.getTextErrorEmptyPassword();
        String expectedResult = "To jest wymagane pole.";
        Assertions.assertEquals(expectedResult, actualResult);

    }



}
