package by.itacademy.asyrtseva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GarneczkiPage {
    private String textAllert = "//div[@class='fade alert__tiny alert alert-danger show']//p[contains(text(),'Błędny login lub hasło')]";
    private String buttonMyAccout = "//a[@href=\"/my-account/\"]";
    private String inputLogin = "//input[@name=\"login\"]";
    private String inputPassword = "//*[@id=\"sign-panels-tabpane-login\"]/form/div[3]/div/input";
    private String buttonSubmit = "//button[contains(text(),'Zaloguj')]";

    private WebDriver driver;

    public GarneczkiPage(WebDriver driver) {this.driver = driver;}
    public void clickButtonMyAccount(){driver.findElement(By.xpath(buttonMyAccout)).click();}
    public void sendKeysInputEmail(String newEmail){driver.findElement(By.xpath(inputLogin)).sendKeys(newEmail);}
    public void sendKeysInputPassword(String newPassword){driver.findElement(By.xpath(inputPassword)).sendKeys(newPassword);}
    public void clickButtonSubmit(){driver.findElement(By.xpath(buttonSubmit)).click();}
    public String getTextErrorIncorrectCredentials() {
        return driver.findElement(By.xpath(textAllert)).getText();
    }
}
