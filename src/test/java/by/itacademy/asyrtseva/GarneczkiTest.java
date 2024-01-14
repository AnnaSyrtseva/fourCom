package by.itacademy.asyrtseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GarneczkiTest extends BaseTest {

    @Test
    public void testCartersLoginIncorrectCredentials() throws InterruptedException {
        GarneczkiPage garneczkiPage = new GarneczkiPage(driver);
        garneczkiPage.clickButtonMyAccount();
        garneczkiPage.sendKeysInputEmail("test123@mail.com");
        garneczkiPage.sendKeysInputPassword("qwertyu123");
        garneczkiPage.clickButtonSubmit();
        String actualRsult = garneczkiPage.getTextErrorIncorrectCredentials();
        String expectedResult = "Błędny login lub hasło";
        Assertions.assertEquals(expectedResult, actualRsult);

    }
}