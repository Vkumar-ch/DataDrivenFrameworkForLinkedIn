package com.selenium.automation.test;

import com.selenium.automation.base.BaseClass;
import com.selenium.automation.pages.LoginPage;
import com.selenium.automation.readfiles.DataProviderForLinkedIn;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLinkedIn extends BaseClass {

    LoginPage loginPage;
    @BeforeMethod
    public void init(){
        setUp();
        loginPage = new LoginPage(driver);
    }

    @Test(dataProvider = "test data",dataProviderClass = DataProviderForLinkedIn.class)
    public void signInIntoLinkedIn(String username,String password) throws InterruptedException {
        loginPage.clickOnSignIn(username,password);
        String currentUrl = loginPage.validateLogin();
        Assert.assertEquals("https://www.linkedin.com/feed/?trk=homepage-basic_sign-in-submit",currentUrl);
    }



}
