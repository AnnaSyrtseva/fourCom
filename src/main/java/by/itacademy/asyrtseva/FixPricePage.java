package by.itacademy.asyrtseva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FixPricePage {
    private String buttonLogIn = "//button[@class='log-in link']";
    private String buttonLogViaEmail = "//button[contains(text(),'По email')]";
    private String inputEmail = "//div[@class='input-custom phone-input show-placeholder email']//input[@type='email']";
    private String inputPassword = "//div[@class='input-custom password-input show-placeholder toggle']//input[@type='password']";
    private String buttonCheckboxAgreement = "//div[@class='gdpr-container gdpr by']//div[@class='checkbox-field']";
    private String buttonEnterLogin = "//div[@class='gdpr-container gdpr by']//button[@class='button enter-button normal']";
    private String textIncorrectCredentials = "///div[@class='form-container']//div[contains(text(),'Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4')]";

    private WebDriver driver;

    public FixPricePage(WebDriver driver) {this.driver = driver;}

    public void clickButtonLogIn(){
        driver.findElement(By.xpath(buttonLogIn)).click();
    }
    public void clickButtonLogViaEmail(){driver.findElement(By.xpath(buttonLogViaEmail)).click();}
    public void sendKeysInputEmail(String newEmail){
        driver.findElement(By.xpath(inputEmail)).sendKeys(newEmail);
    }
    public void sendKeysInputPassword(String newPassword){driver.findElement(By.xpath(inputPassword)).sendKeys(newPassword);
    }
    public void clickButtonCheckbox(){driver.findElement(By.xpath(buttonCheckboxAgreement)).click();}
    public void clickButtonEnter(){driver.findElement(By.xpath(buttonEnterLogin)).click();}
    public String getTextErrorIncorrectCredentials() {
        return driver.findElement(By.xpath(textIncorrectCredentials)).getText();
    }


}
