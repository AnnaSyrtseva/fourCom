package by.itacademy.asyrtseva.utils;

import by.itacademy.asyrtseva.driver.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {
        public static void wait(String element){
            new WebDriverWait(WebDriver.getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
        }

}
