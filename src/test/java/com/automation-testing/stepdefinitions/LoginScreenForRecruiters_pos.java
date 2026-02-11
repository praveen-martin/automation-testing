package com.automation-testing.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.automation-testing.pages.LoginScreenForRecruiters_posPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenForRecruiters_pos extends DriverFactory {
LoginScreenForRecruiters_posPage loginPage = new LoginScreenForRecruiters_posPage(driver);
@Given("the recruiter is on the Login Screen")
public void the_recruiter_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginPage.navigateToLoginScreen();
}
@When("I enter {string} in the Email ID field")
public void i_enter_email_in_the_email_id_field(String email) {
loginPage.enterEmail(email);
}
@When("I enter {string} in the Password field")
public void i_enter_password_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@When("I click on the 'Show Password' option")
public void i_click_on_the_show_password_option() {
loginPage.clickShowPassword();
}
@When("I click the Login button")
public void i_click_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
loginPage.isDashboardDisplayed();
}
@Then("the dashboard loads without errors")
public void the_dashboard_loads_without_errors() {
loginPage.isDashboardLoadedWithoutErrors();
}
@Then("the Login button should be disabled")
public void the_login_button_should_be_disabled() {
loginPage.isLoginButtonEnabled();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
loginPage.isLoginButtonEnabled();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
loginPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
loginPage.isPasswordVisible();
}
@When("the user opens the application in {string}")
public void the_user_opens_the_application_in(String browser) {
driver = DriverFactory.getDriver(browser);
loginPage.navigateToLoginScreen();
}
@Given("the user enters {string} and {string}")
public void the_user_enters_email_and_password(String email, String password) {
loginPage.enterEmail(email);
loginPage.enterPassword(password);
}
@Then("the user is redirected to the dashboard for the first role")
public void the_user_is_redirected_to_the_dashboard_for_the_first_role() {
loginPage.isDashboardDisplayedForFirstRole();
}
@And("the user logs out")
public void the_user_logs_out() {
loginPage.logout();
}
@Then("the login screen is displayed again")
public void the_login_screen_is_displayed_again() {
loginPage.isLoginScreenDisplayed();
}
@Given("the user resizes the browser window to a tablet resolution")
public void the_user_resizes_the_browser_window_to_a_tablet_resolution() {
loginPage.resizeBrowserToTablet();
}
@Given("the user resizes the browser window to a mobile resolution")
public void the_user_resizes_the_browser_window_to_a_mobile_resolution() {
loginPage.resizeBrowserToMobile();
}

@Given("I leave the password field empty")
public void i_leave_the_password_field_empty() {
loginPage.leavePasswordFieldEmpty();
}
@When("the user clicks the login button")
public void the_user_clicks_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user is redirected to the dashboard for the second role")
public void the_user_is_redirected_to_the_dashboard_for_the_second_role() {
loginPage.isRedirectedToDashboardForSecondRole();
}
@When("the user enters {string}")
public void the_user_enters(String username) {
loginPage.enterUsername(username);
}
@And("I enter a valid password in the password field")
public void i_enter_a_valid_password_in_the_password_field() {
loginPage.enterValidPassword();
}
@And("I clickElement on the 'hide password' option")
public void i_click_on_the_hide_password_option() {
loginPage.clickHidePasswordOption();
}
}