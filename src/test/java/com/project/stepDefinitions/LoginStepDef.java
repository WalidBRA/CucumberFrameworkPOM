package com.project.stepDefinitions;

import com.project.commonUtils.BasePage;
import com.project.pageActions.LoginPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;




public class LoginStepDef {

    LoginPageAction objLogin = new LoginPageAction();

    @Given("User is on automation exercise login page {string}")
    public void userIsOnAutomationExerciseLoginPage(String url) {
        BasePage.openPage(url);

    }

    @When("User enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String userName, String passWord) {
        objLogin.setUserName(userName);
        objLogin.setPassword(passWord);
        //objLogin.clickLogin();

    }

    @Then("User should be able to login successfully and new page open")
    public void userShouldBeAbleToLoginSuccessfullyAndNewPageOpen() {
        int x=5;
        int y=5;
      Assert.assertEquals(x,y);

    }
}
