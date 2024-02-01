package by.itacademy.asyrtseva.page;

import by.itacademy.asyrtseva.driver.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {
    private String textResultSearchKapelusz = "//div[@class='prefixbox-product-name-container']//a[@href='https://4f.com.pl/kapelusz-bucket-hat-sztruksowy-damski-4faw2acapf18-83s.html']";
    private String textResultSearchKoszulka = "//a[@title='Koszulka kibica męska']";
    private String getCountOfItems = "//div[@class='prefixbox-products-container tile-view']";
    private String buttonItem = "//div[@data-prefixbox-title_dl='Buty zimowe DCX-22 z impregnacją chłopięce - czarne 4FJRAW23FWINM033-21S Czarny']";
    private String buttonSize = "//section[@class= 'productFullDetail-options-oo3']//button[@title='35']";
    private String buttonSubmit = "//*[@id='root']/main/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/form/section[5]/div/button";
    private String textCartItems = "//*[@id='header-main']/header/div/div[2]/aside/div/div[2]/div[1]/div/div/a[2]";
    private org.openqa.selenium.WebDriver driver;

    public SearchPage() {this.driver = WebDriver.getDriver();}

    public List<WebElement> getProductCards() {
        return driver.findElements(By.xpath(getCountOfItems));
    }

    public String getTextResultSearchItemKapelusz(){return driver.findElement(By.xpath(textResultSearchKapelusz)).getText(); }

    public String getTextResultSearchItemKoszulka(){return driver.findElement(By.xpath(textResultSearchKoszulka)).getText();}

    public void clickButtonItem(){driver.findElement(By.xpath(buttonItem)).click();}

    public void clickButtonSize(){driver.findElement(By.xpath(buttonSize)).click();}

    public void clickButtonSubmit(){driver.findElement(By.xpath(buttonSubmit)).click();}

    public String getTextCartItems(){return driver.findElement(By.xpath(textCartItems)).getText(); }

}
