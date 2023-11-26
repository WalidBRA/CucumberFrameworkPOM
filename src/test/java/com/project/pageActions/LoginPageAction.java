package com.project.pageActions;

import com.project.commonUtils.BasePage;
import com.project.pageLocators.LoginPageLocators;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAction {

    LoginPageLocators loginPageLocators = null;

    public LoginPageAction ()
    {
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(BasePage.getDriver(),loginPageLocators);
    }

    public void setUserName(String strUserName) {
        loginPageLocators.userName.sendKeys(strUserName);
    }

    public void setPassword(String strPassword) {
        loginPageLocators.password.sendKeys(strPassword);
    }

    // Click on login button
    public void clickLogin() {
        loginPageLocators.submitBtn.click();
    }




}
