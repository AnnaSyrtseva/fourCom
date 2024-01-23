package by.itacademy.asyrtseva.ui;

import by.itacademy.asyrtseva.BaseTest;
import by.itacademy.asyrtseva.steps.FourConStep;
import by.itacademy.asyrtseva.domain.RandomUserData;
import by.itacademy.asyrtseva.page.FourComPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FourComTest extends BaseTest {

    @Test
    public void testFourComInvalidCredentials() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        FourConStep fourComStep = new FourConStep(driver);
        fourComStep.openLoginFormFillAndSubmit(RandomUserData.getRandomEmail(),"qwertyyu");
        Thread.sleep(3000);
        String actualResult = fourComPage.getTextErrorCredentials();
        String expectedResult = "Podany e-mail lub hasło są niepoprawne. Upewnij się, że używasz poprawnego adresu e-mailowego i hasła, a następnie ponownie spróbuj się zalogować.";
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testFourComEmptyEmail() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        FourConStep fourComStep = new FourConStep(driver);
        fourComStep.openLoginFormFillAndSubmit("","qwertyyu");
        Thread.sleep(3000);
        String actualResult = fourComPage.getTextErrorEmptyEmail();
        String expectedResult = "To jest wymagane pole.";
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testFourComEmptyPassword() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        FourConStep fourComStep = new FourConStep(driver);
        fourComStep.openLoginFormFillAndSubmit(RandomUserData.getRandomEmail(),"");
        Thread.sleep(3000);
        String actualResult = fourComPage.getTextErrorEmptyPassword();
        String expectedResult = "To jest wymagane pole.";
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testFourComEmptyCredentials() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        FourConStep fourComStep = new FourConStep(driver);
        fourComStep.openLoginFormFillAndSubmit("","");
        Thread.sleep(3000);
        String actualResult = fourComPage.getTextErrorEmptyPassword();
        String expectedResult = "To jest wymagane pole.";
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testFourComIncorrectEmail() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        FourConStep fourComStep = new FourConStep(driver);
        fourComStep.openLoginFormFillAndSubmit("1111111111","qwertyyu");
        Thread.sleep(3000);
        String actualResult = fourComPage.getTextErrorCredentials();
        String expectedResult = "Podany e-mail lub hasło są niepoprawne. Upewnij się, że używasz poprawnego adresu e-mailowego i hasła, a następnie ponownie spróbuj się zalogować.";
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testFourComSearchKapelusz() throws InterruptedException{
        FourComPage fourComPage = new FourComPage(driver);
        Thread.sleep(3000);
        fourComPage.clickButtonCookie();
        fourComPage.sendKeysSearch("KAPELUSZ");
        List<WebElement> productCards = fourComPage.getProductCards();
        fourComPage.printProductCardText();
    }


}
