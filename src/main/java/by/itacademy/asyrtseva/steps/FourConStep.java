package by.itacademy.asyrtseva.steps;

import by.itacademy.asyrtseva.driver.WebDriver;
import by.itacademy.asyrtseva.page.FourComPage;
import by.itacademy.asyrtseva.utils.Waiter;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FourConStep {
    private org.openqa.selenium.WebDriver driver;

    FourComPage fourComPage;


    public void openLoginFormFillAndSubmit (String email, String password) throws InterruptedException{
        fourComPage.clickButtonCookie();
        fourComPage.clickButtonMyAccount();
        fourComPage.sendKeysInputEmail(email);
        fourComPage.sendKeysInputPAssword(password);
        fourComPage.clickButtonSubmit();
        Thread.sleep(3000);
    }

    public FourConStep() {
        this.driver = WebDriver.getDriver();
        this.fourComPage = new FourComPage();
    }

}
