package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{
    private By loginPanel = new By.ByXPath("//*[@id='logInPanelHeading']");
    private By fieldUsername = new By.ByXPath("//*[@id='txtUsername']");
    private By fieldPassword = new By.ByXPath("//*[@id='txtPassword']");
    private By btnLogin = new By.ByXPath("//*[@id='btnLogin']");
    private By errorMessage = new By.ByXPath("//*[@id='spanMessage']");
    private By dashboardPage = new By.ByXPath("//*[@id='content']/div/div[1]/h1");

    public Login (WebDriver driver) { super(driver); }

    public void userSeeLoginPage() throws InterruptedException{
        waitUntilElementIsVisible(loginPanel);
    }

    public void inputUsername(String email) throws InterruptedException {
        inputText(fieldUsername, email);
    }

    public void inputPassword(String password) throws InterruptedException{
        inputText(fieldPassword, password);
    }

    public void clickButtonLogin() throws InterruptedException{
        clickButton(btnLogin);
    }
    public void userSeeErrorMessage() throws InterruptedException {
        waitUntilElementIsVisible(errorMessage);
    }
    public void userSeeDashboardPage() throws  InterruptedException {
        waitUntilElementIsVisible(dashboardPage);
    }

}
