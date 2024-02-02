package by.itacademy.asyrtseva.ui;

import by.itacademy.asyrtseva.BaseTest;
import by.itacademy.asyrtseva.steps.FourConStep;
import by.itacademy.asyrtseva.domain.RandomUserData;
import by.itacademy.asyrtseva.page.FourComPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FourComTest extends BaseTest {
    FourComPage fourComPage = new FourComPage();
    FourConStep fourComStep = new FourConStep();

    @Test
    public void testFourComInvalidCredentials() throws InterruptedException{
        fourComStep.openLoginFormFillAndSubmit(RandomUserData.getRandomEmail(),"qwertyyu");
        String expectedResult = "Podany e-mail lub hasło są niepoprawne. Upewnij się, że używasz poprawnego adresu e-mailowego i hasła, a następnie ponownie spróbuj się zalogować.";
        Assertions.assertEquals(expectedResult, fourComPage.getTextErrorCredentials());

    }

    @Test
    public void testFourComEmptyEmail() throws InterruptedException{
        fourComStep.openLoginFormFillAndSubmit("","qwertyyu");
        String expectedResult = "To jest wymagane pole.";
        Assertions.assertEquals(expectedResult, fourComPage.getTextErrorEmptyEmail());

    }

    @Test
    public void testFourComEmptyPassword() throws InterruptedException{
        fourComStep.openLoginFormFillAndSubmit(RandomUserData.getRandomEmail(),"");
        String expectedResult = "To jest wymagane pole.";
        Assertions.assertEquals(expectedResult, fourComPage.getTextErrorEmptyPassword());

    }

    @Test
    public void testFourComEmptyCredentials() throws InterruptedException{
        fourComStep.openLoginFormFillAndSubmit("","");
        String expectedResult = "To jest wymagane pole.";
        Assertions.assertEquals(expectedResult, fourComPage.getTextErrorEmptyPassword());

    }

    @Test
    public void testFourComIncorrectEmail() throws InterruptedException{
        fourComStep.openLoginFormFillAndSubmit("1111111111","qwertyyu");
        String expectedResult = "Podany e-mail lub hasło są niepoprawne. Upewnij się, że używasz poprawnego adresu e-mailowego i hasła, a następnie ponownie spróbuj się zalogować.";
        Assertions.assertEquals(expectedResult, fourComPage.getTextErrorCredentials());

    }

}
