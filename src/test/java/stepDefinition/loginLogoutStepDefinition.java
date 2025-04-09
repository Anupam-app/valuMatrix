package stepDefinition;

import dataObjects.login;
import helper.LoginUtils;
import pages.loginLogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginLogoutStepDefinition {

    private  final loginLogoutPage loginLogoutPage;
    private final login login;
    private final LoginUtils loginUtils;


    public loginLogoutStepDefinition(loginLogoutPage loginLogoutPage, login login, LoginUtils loginUtils){
        this.loginLogoutPage = loginLogoutPage;
        this.login = login;
        this.loginUtils = loginUtils;
    }

    @Given("I am on the Login page URL {string}")
    public void i_am_on_the_Login_page_URL(String url) throws Throwable {
        loginLogoutPage.loginUrl(url);

    }

    @Then("I should see Sign In Page")
    public void i_should_see_Sign_In_Page() throws Throwable {
        loginLogoutPage.validateLogInBtn();
    }

    @When("I enter Candidate username as {string}")
    public void i_enter_username_as(String userName) throws Throwable {
        login.setLogin(userName);
        login.setPasswords(LoginUtils.getPassword(userName));
        loginLogoutPage.enterUserName(login.getLogin());
       // waitHelper.WaitForElement(loginPage.password, 10);
        loginLogoutPage.enterPassword(login.getPasswords());

    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String arg1) throws Throwable {
        loginLogoutPage.enterPassword(arg1);
    }

    @When("click on login button")
    public void click_on_login_button() throws Throwable {
        loginLogoutPage.clickLoginButton();
    }

    @When("I am logged in")
    public void i_am_already_logged_in() throws Throwable {
        loginLogoutPage.validateLogOutBtnDisplayed();
    }

    @When("I Click on Sign out")
    public void i_Click_on_Sign_out() throws Throwable {
        //loginPage.clickLogoutButton();
      //  waitHelper.WaitForElement(loginPage.userName, 60);
    }

    @Then("I got log out from the application and land on sign in page")
    public void i_got_log_out_from_the_application_and_land_on_sign_in_page() throws Throwable {
        //loginPage.userName.isDisplayed();
    }


}
