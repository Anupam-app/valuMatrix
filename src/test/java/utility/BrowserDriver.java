package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {
    private WebDriver driver;

    //for headless run
//    ChromeOptions options = new ChromeOptions();
//    options.addArguments("--headless"); // Optional: Run in headless mode
//    this.driver = new ChromeDriver(options);

    public BrowserDriver() {
        try {
            // Uncomment and set if ChromeDriver isn’t in PATH
//             System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

             this.driver = WebDriverManager.chromedriver().getWebDriver();
            System.out.println("BrowserDriver initialized successfully");
        } catch (Exception e) {
            System.err.println("Failed to initialize ChromeDriver: " + e.getMessage());
            throw new RuntimeException("WebDriver initialization failed", e);
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized");
        }
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}