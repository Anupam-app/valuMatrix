package pages;

import helper.seleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import dataObjects.*;
import org.openqa.selenium.support.PageFactory;

public class XIinterviewerPage {

    private  slots slots;
    public XIinterviewerPage(slots slots){
        this.slots = slots;
        PageFactory.initElements(this.driver, this);
    }


    private WebDriver driver;

    @FindBy(xpath = "//button[text()='Interviewer']")
    public WebElement interviewerTab;

    @FindBy(xpath = "//span[text()='Slots']")
    public WebElement slotsMenu;

    @FindBy(xpath= "//*[contains(text(),'Create slots')]")
    public WebElement createSlots;

    String selectMonth = "//*[contains(text(),'Select Dates')]/following::div[contains(text(),'%s')]";
    String selectDate = "//div[contains(text(),'%s')]/following::button[text()='%s']";
    String time = "(//div[text()='%s' and text()='%s']/following::div)[%s]";

    public void clickOnInterviewerTab(){
        seleniumHelper.WaitForElement(interviewerTab,60);
        interviewerTab.click();
    }

    public void clickOnSlots() throws InterruptedException {
        seleniumHelper.fluentWaiter();
        slotsMenu.click();
    }

    public void createSlots(){
        seleniumHelper.fluentWaiter();
        createSlots.click();

    }

    public void monthVerify(String month){
        WebElement monthSlot = driver.findElement(By.xpath(String.format(selectMonth,month)));
        seleniumHelper.WaitForElement(monthSlot,10);
        monthSlot.isDisplayed();
        slots.setMonth(monthSlot.getText());
    }

    public void selectDate(String date, String month){
        seleniumHelper.fluentWaiter();
        WebElement dateSelect = driver.findElement(By.xpath(String.format(selectDate,month,date)));
        dateSelect.click();
        slots.setDate(dateSelect.getText());
    }

    public void bookSlotTime(String time){

    }
}
