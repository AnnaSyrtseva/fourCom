package by.itacademy.asyrtseva.page;

import by.itacademy.asyrtseva.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SearchPage {
    private String textSearchResult = "/html/body/div[3]/main/div[2]/div/section/div[6]/div[5]/div[2]/div[1]/div/div[2]/a";
    private String textResultSearchKapelusz = "//div[@class='prefixbox-product-name-container']//a[@href='https://4f.com.pl/kapelusz-bucket-hat-sztruksowy-damski-4faw2acapf18-83s.html']";
    private String textResultSearchKoszulka = "//a[@title='Koszulka kibica męska']";
    private WebDriver driver;
    private String getCountOfItems = "//div[@class='prefixbox-products-container tile-view']";
    public SearchPage() {this.driver = MyDriver.getDriver();}

    public String getTextSearch(){return driver.findElement(By.xpath(textSearchResult)).getText();
    }

    public List<WebElement> getProductCards() {
        return driver.findElements(By.xpath(getCountOfItems));
    }

    public String getTextResultSearchItemKapelusz(){return driver.findElement(By.xpath(textResultSearchKapelusz)).getText();
    }
    public String getTextResultSearchItemKoszulka(){return driver.findElement(By.xpath(textResultSearchKoszulka)).getText();
    }

}
