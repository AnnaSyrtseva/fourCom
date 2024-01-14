package by.itacademy.asyrtseva;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void baseStart() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://4f.com.pl/");
    }

    @AfterEach
    public void baseFinish() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
