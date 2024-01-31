package by.itacademy.asyrtseva.steps;

import by.itacademy.asyrtseva.driver.WebDriver;
import by.itacademy.asyrtseva.page.FourComPage;
import by.itacademy.asyrtseva.utils.Waiter;

public class FourConStep {
    public void openLoginFormFillAndSubmit (String email, String password) throws InterruptedException{
        Thread.sleep(5000);
        fourComPage.clickButtonCookie();
        fourComPage.clickButtonMyAccount();
        fourComPage.sendKeysInputEmail(email);
        fourComPage.sendKeysInputPAssword(password);
        fourComPage.clickButtonSubmit();
        Thread.sleep(3000);
    }
    private org.openqa.selenium.WebDriver driver;
    FourComPage fourComPage;
    public FourConStep() {
        this.driver = WebDriver.getDriver();
        this.fourComPage = new FourComPage();
    }


   /* public FourConStep(WebDriver driver) {
        this.driver = driver;
        fourComPage = new FourComPage();
    }
    WebDriver driver ;
    FourComPage fourComPage;*/

    //private WebDriver driver;
  //  public SearchPage() {this.driver = MyDriver.getDriver();}


}
