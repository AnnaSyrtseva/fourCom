package by.itacademy.asyrtseva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FourComPage {
    private String buttonCookie = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    private String buttonMyAccount = "//span[@class = 'accountChip-root-QGz']";
    private String inputEmail = "//div[@class='signIn-root-gus']//input[@autocomplete='email']";
    private String inputPassword = "//div[@class='signIn-root-gus']//input[@autocomplete='current-password']";
    private String buttonSubmit = "//button[@type='submit']";
    private String textErrorCredentials ="//html/body/div[3]/main/div[2]/div[2]/div[1]/div/div[1]/span";//*[contains(@class, 'errorMessage-errorMessage-4tj')]";
    private String textEmptyEmailField = "//*[contains(@class, 'message-root_error-WKA message-root-rPy')]";
    private String textEmptyPasswordField = "//*[contains(@class, 'message-root_error-WKA message-root-rPy')]";

    private WebDriver driver;
    public FourComPage(WebDriver driver) {this.driver = driver;}

    public void clickButtonCookie(){
        driver.findElement(By.xpath(buttonCookie)).click();
    }
    public void clickButtonMyAccount(){
        driver.findElement(By.xpath(buttonMyAccount)).click();
    }
    public void sendKeysInputEmail(String newEmail){
        driver.findElement(By.xpath(inputEmail)).sendKeys(newEmail);
    }
    public void sendKeysInputPAssword(String newPassword){
        driver.findElement(By.xpath(inputPassword)).sendKeys(newPassword);
    }
    public void clickButtonSubmit(){
        driver.findElement(By.xpath(buttonSubmit)).click();
    }
    public String getTextErrorCredentials(){return driver.findElement(By.xpath(textErrorCredentials)).getText();
    }
    public String getTextErrorEmptyEmail(){return driver.findElement(By.xpath(textEmptyEmailField)).getText();}

    public String getTextErrorEmptyPassword(){return driver.findElement(By.xpath(textEmptyPasswordField)).getText();}



}
