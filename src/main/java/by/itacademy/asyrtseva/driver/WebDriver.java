package by.itacademy.asyrtseva.driver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriver {
    private static org.openqa.selenium.WebDriver driver;

    public static org.openqa.selenium.WebDriver getDriver(){
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }

    public static org.openqa.selenium.WebDriver quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        return null;
    }

}
