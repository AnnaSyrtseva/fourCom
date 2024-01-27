package by.itacademy.asyrtseva;

import by.itacademy.asyrtseva.driver.MyDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

    @BeforeEach
    public void baseStart() {
        WebDriver driver = MyDriver.getDriver();
        driver.get("https://4f.com.pl/");
        /*driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://4f.com.pl/");*/
    }

    @AfterEach
    public void baseFinish() throws InterruptedException {
        WebDriver driver = MyDriver.getDriver();
        Thread.sleep(1000);
        driver.quit();
    }
}
