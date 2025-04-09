package helper;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class seleniumHelper {

    private static WebDriver driver;
    public seleniumHelper (WebDriver driver){
        this.driver = driver;
    }

    public static void WaitForElement(WebElement element, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

        public static Wait<WebDriver> fluentWaiter() {
            return new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(120)) // 60 * 2 = 120
                    .pollingEvery(Duration.ofSeconds(10))
                    .ignoring(NoSuchElementException.class);
        }


    }

