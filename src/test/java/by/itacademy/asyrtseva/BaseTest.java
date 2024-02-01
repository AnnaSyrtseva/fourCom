package by.itacademy.asyrtseva;

import by.itacademy.asyrtseva.driver.WebDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    public org.openqa.selenium.WebDriver driver;

    @BeforeEach
    public void baseStart() throws InterruptedException{
        org.openqa.selenium.WebDriver driver = WebDriver.getDriver();
        driver.get("https://4f.com.pl/");
        }

    @AfterEach
    public void baseFinish() throws InterruptedException {
        org.openqa.selenium.WebDriver driver = WebDriver.getDriver();
        Thread.sleep(1000);
        driver.quit();
    }
}
