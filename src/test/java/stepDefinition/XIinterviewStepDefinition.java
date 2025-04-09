package stepDefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.XIinterviewerPage;

public class XIinterviewStepDefinition {

    private final XIinterviewerPage XIinterviwerpage;

  public XIinterviewStepDefinition(XIinterviewerPage XIinterviwerpage){
      this.XIinterviwerpage = XIinterviwerpage;
  }

        @And("I click on Interview tab")
        public void interviewTab(){
            XIinterviwerpage.clickOnInterviewerTab();
        }

        @And("select the slots menu")
        public void clickOnSlots() throws InterruptedException {
            XIinterviwerpage.clickOnSlots();
        }

        @And("I click on create slots")
        public void createSlots(){
            XIinterviwerpage.createSlots();
        }

        @And("I verify the month {string}")
        public void slotBookMonth(String month){
            XIinterviwerpage.monthVerify(month);
        }

        @And("I select the date {string} of month {string}")
        public void selectDate(String date, String month){
            XIinterviwerpage.selectDate(date, month);
        }

        @And("I book the slot time {string}")
        public void bookSlotTime(String time){
            XIinterviwerpage.bookSlotTime(time);
        }



}
