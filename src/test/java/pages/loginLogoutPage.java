package pages;

import helper.seleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;

public class loginLogoutPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Log In']")
    WebElement loginButton;

    @FindBy(xpath = "//img[@class='TopBar_avatarImg__xXJdM']")
    WebElement profileIcon;

    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logoutBtn;

    public loginLogoutPage(BrowserDriver browserDriver) {
        if (browserDriver == null) {
            throw new IllegalArgumentException("BrowserDriver cannot be null");
        }
        this.driver = browserDriver.getDriver();
        if (this.driver == null) {
            throw new IllegalStateException("WebDriver is null in BrowserDriver");
        }
        PageFactory.initElements(this.driver, this);
    }

    public void loginUrl(String url) {
        driver.get(url);
    }

    public void validateLogInBtn() {
        loginButton.isDisplayed();
    }

    public void enterUserName(String userName) {

        this.userName.sendKeys(userName);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickOnProfile(){
        seleniumHelper.WaitForElement(profileIcon,10);
        profileIcon.click();
    }

    public void logOutBtn(){
        seleniumHelper.WaitForElement(logoutBtn,5);
        logoutBtn.click();
    }

    public void validateLogOutBtnDisplayed(){
        clickOnProfile();
        logoutBtn.isDisplayed();
        seleniumHelper.WaitForElement(profileIcon,5);
        profileIcon.click();
    }

}

