package by.itacademy.asyrtseva.steps;

import by.itacademy.asyrtseva.page.FourComPage;
import org.openqa.selenium.WebDriver;

public class FourConStep {
    public void openLoginFormFillAndSubmit(String email, String password){
        fourComPage.clickButtonCookie();
        fourComPage.clickButtonMyAccount();
        fourComPage.sendKeysInputEmail(email);
        fourComPage.sendKeysInputPAssword(password);
        fourComPage.clickButtonSubmit();
    }

    public FourConStep(WebDriver driver) {
        this.driver = driver;
        fourComPage = new FourComPage(driver);
    }
    WebDriver driver ;
    FourComPage fourComPage;

}
