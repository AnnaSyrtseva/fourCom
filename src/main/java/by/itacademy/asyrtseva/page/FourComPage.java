package by.itacademy.asyrtseva.page;

import by.itacademy.asyrtseva.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FourComPage {
    private String buttonCookie = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    private String buttonMyAccount = "//span[@class = 'accountChip-root-QGz']";
    private String inputEmail = "//div[@class='signIn-root-gus']//input[@autocomplete='email']";
    private String inputPassword = "//div[@class='signIn-root-gus']//input[@autocomplete='current-password']";
    private String buttonSubmit = "//button[@type='submit']";
    private String textErrorCredentials ="//div[@class= 'errorMessage-root-CkJ']";//html/body/div[3]/main/div[2]/div[2]/div[1]/div/div[1]/span";//*[contains(@class, 'errorMessage-errorMessage-4tj')]";
    private String textEmptyEmailField = "//*[contains(@class, 'message-root_error-WKA message-root-rPy')]";
    private String textEmptyPasswordField = "//*[contains(@class, 'message-root_error-WKA message-root-rPy')]";
    private String inputSearchFiled = "//input[@placeholder='Znajdź produkt...']";
    private String productCard = "//div[@class= 'prefixbox-product-container ']";

    private WebDriver driver;
    public FourComPage() {this.driver = MyDriver.getDriver();}

    //public void clickButtonSearch() {
    //        new WebDriverWait(MyDriver.getDriver(), Duration.ofSeconds(20))
    //                .until(ExpectedConditions.presenceOfElementLocated(getButtonResetSearch()));
    //        driver.findElement(By.xpath(buttonSearch)).click();
    //        new WebDriverWait(MyDriver.getDriver(), Duration.ofSeconds(20))
    //                .until(ExpectedConditions.presenceOfElementLocated(getHeaderSearchResult()));
    //    }



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

    public void sendKeysSearch(String textSearch){
        driver.findElement(By.xpath(inputSearchFiled)).sendKeys(textSearch + Keys.ENTER);
    }

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
