package com.selenium.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(name = "session_key")
    WebElement emailElement;

    @FindBy(name = "session_password")
    WebElement passwordElement;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInElement;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnSignIn(String user,String pass) throws InterruptedException {
        Thread.sleep(1000);
        emailElement.sendKeys(user);
        Thread.sleep(1000);
        passwordElement.sendKeys(pass);
        Thread.sleep(1000);
        signInElement.click();
    }

    public String validateLogin(){
        String url = driver.getCurrentUrl();
        return url;
    }




}
