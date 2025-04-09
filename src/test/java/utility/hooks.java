package utility;

import io.cucumber.java.After;

public class hooks {
    private final BrowserDriver browserDriver;

    public hooks(BrowserDriver browserDriver) {
        this.browserDriver = browserDriver;
    }

    @After
    public void tearDown() {
        browserDriver.quitDriver();
    }
}