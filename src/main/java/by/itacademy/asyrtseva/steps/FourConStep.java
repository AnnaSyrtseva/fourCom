package by.itacademy.asyrtseva.steps;

import by.itacademy.asyrtseva.driver.MyDriver;
import by.itacademy.asyrtseva.page.FourComPage;
import org.openqa.selenium.WebDriver;

public class FourConStep {
    public void openLoginFormFillAndSubmit (String email, String password) throws InterruptedException{
        Thread.sleep(5000);
        fourComPage.clickButtonCookie();
        fourComPage.clickButtonMyAccount();
        fourComPage.sendKeysInputEmail(email);
        fourComPage.sendKeysInputPAssword(password);
        fourComPage.clickButtonSubmit();
    }
    private WebDriver driver;
    FourComPage fourComPage;
    public FourConStep() {
        this.driver = MyDriver.getDriver();
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
