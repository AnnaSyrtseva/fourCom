package by.itacademy.asyrtseva.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyDriver {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }

    public static void closerDriver(){
        driver.close();
        driver.quit();
    }

}
