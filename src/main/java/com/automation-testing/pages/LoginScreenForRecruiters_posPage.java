package com.backend.pages;

import com.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class LoginScreenForRecruiters_posPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "showPasswordButton")
    private WebElement showPasswordButton;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "usernameField")
    private WebElement usernameField;

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;

    public LoginScreenForRecruiters_posPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginScreen() {
        try {
            driver.get("http://localhost/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickShowPassword() {
        try {
            elementUtils.clickElement(showPasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDashboardDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void isDashboardLoadedWithoutErrors() {
        // Implement error checking logic as needed
    }

    public boolean isLoginButtonEnabled() {
        try {
            return loginButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void isPasswordVisible() {
        // Implement visibility check based on your application logic
    }

    public void enterUsername(String username) {
        try {
            elementUtils.clearAndSendKeys(usernameField, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logout() {
        try {
            elementUtils.clickElement(logoutButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resizeBrowserToTablet() {
        // Implement browser resizing logic for tablet
    }

    public void resizeBrowserToMobile() {
        // Implement browser resizing logic for mobile
    }

    public void leavePasswordFieldEmpty() {
        try {
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRedirectedToDashboardForSecondRole() {
        // Implement verification for second role dashboard
    }

    public void enterValidPassword() {
        // Implement entering a valid password
    }

    public void clickHidePasswordOption() {
        try {
            elementUtils.clickElement(showPasswordButton); // Assuming this is the hide button too
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void isLoginScreenDisplayedIsDashboardDisplayedForFirstRole() {
        try {
            WebElement loginScreenElement = driver.findElement(By.xpath("//h1[contains(text(),'Login')]"));
            boolean isLoginScreenDisplayed = elementUtils.isElementDisplayed(loginScreenElement);
            Assert.assertTrue(isLoginScreenDisplayed, "Login screen is not displayed!");

            boolean isDashboardDisplayed = elementUtils.isElementDisplayed(dashboard);
            Assert.assertTrue(isDashboardDisplayed, "Dashboard is not displayed for the first role!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}