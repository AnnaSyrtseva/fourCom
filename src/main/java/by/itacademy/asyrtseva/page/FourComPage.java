package by.itacademy.asyrtseva.page;

import by.itacademy.asyrtseva.driver.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FourComPage {
    private String buttonCookie = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    private String buttonMyAccount = "//span[@class = 'accountChip-root-QGz']";
    private String inputEmail = "//div[@class='signIn-root-gus']//input[@autocomplete='email']";
    private String inputPassword = "//div[@class='signIn-root-gus']//input[@autocomplete='current-password']";
    private String buttonSubmit = "//button[@type='submit']";
    private String textErrorCredentials ="//div[@class= 'errorMessage-root-CkJ']";
    private String textEmptyEmailField = "//*[contains(@class, 'message-root_error-WKA message-root-rPy')]";
    private String textEmptyPasswordField = "//*[contains(@class, 'message-root_error-WKA message-root-rPy')]";
    private String inputSearchFiled = "//input[@placeholder='Znajdź produkt...']";
    private String productCard = "//div[@class= 'prefixbox-product-container ']";

    private org.openqa.selenium.WebDriver driver;
    public FourComPage() {this.driver = WebDriver.getDriver();}

    public void clickButtonCookie(){
        driver.findElement(By.xpath(buttonCookie)).click();
    }

    public void clickButtonMyAccount(){
        driver.findElement(By.xpath(buttonMyAccount)).click();
    }

    public void sendKeysInputEmail(String newEmail){
        driver.findElement(By.xpath(inputEmail)).sendKeys(newEmail);
    }

    public void sendKeysInputPAssword(String newPassword){driver.findElement(By.xpath(inputPassword)).sendKeys(newPassword);}

    public void clickButtonSubmit(){
        driver.findElement(By.xpath(buttonSubmit)).click();
    }

    public String getTextErrorCredentials(){return driver.findElement(By.xpath(textErrorCredentials)).getText();}

    public String getTextErrorEmptyEmail(){return driver.findElement(By.xpath(textEmptyEmailField)).getText();}

    public String getTextErrorEmptyPassword(){return driver.findElement(By.xpath(textEmptyPasswordField)).getText();}

    public void sendKeysSearch(String textSearch){driver.findElement(By.xpath(inputSearchFiled)).sendKeys(textSearch + Keys.ENTER);}

    public List<WebElement> getProductCards(){
        return driver.findElements(By.xpath(productCard));
    }

    public void openHomePage(){
        driver.get("https://4f.com.pl/");
    }

    public void printProductCardText(){
        List<WebElement> productCrads = getProductCards();
        for (WebElement productCard : productCrads){
            System.out.println(productCard.getText() + "\n");
        }
    }

}
