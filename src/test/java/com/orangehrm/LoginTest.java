package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class LoginTest {
    WebDriver driver = Utils.getDriver();
    Login login = new Login(driver);

    private String blankUsername = "Username cannot be empty";
    private String invalidCredentials = "Invalid credentials";
    private String blankPassword = "Password cannot be empty";

    public LoginTest() throws IOException {
    }

    // Login with valid username and  valid password
    @Test
    public void LoginWithValidFormatAdmin() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        login.userSeeDashboardPage();
//        Utils.closeWebsite();
    }

    // Login with valid username and  invalid password
    @Test
    public void LoginWithInvalidPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("Admin");
        login.inputPassword("invalidpassword");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        String textErrorMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
        if(invalidCredentials.equals(textErrorMessage))
            System.out.println("The Error message is same as expected -> " +textErrorMessage);
        else
            System.out.println("The Error message doesn't match ->" +textErrorMessage);
        Utils.closeWebsite();
    }

    // Login with invalid username and  valid password
    @Test
    public  void LoginWithInvalidUsername() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("invalidusername");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        String textErrorMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
        if(invalidCredentials.equals(textErrorMessage))
            System.out.println("The Error message is same as expected -> " +textErrorMessage);
        else
            System.out.println("The Error message doesn't match ->" +textErrorMessage);
        Utils.closeWebsite();
    }

    // Login with invalid username and  invalid password
    @Test
    public  void LoginWithInvalidData() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("invalidusername");
        login.inputPassword("invalidpassword");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        String textErrorMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
        if(invalidCredentials.equals(textErrorMessage))
            System.out.println("The Error message is same as expected -> " +textErrorMessage);
        else
            System.out.println("The Error message doesn't match ->" +textErrorMessage);
        Utils.closeWebsite();
    }

    // Login with valid username and  blank password
    @Test
    public  void LoginWithBlankPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("Admin");
        login.inputPassword("");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        String textErrorMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
        if(blankPassword.equals(textErrorMessage))
            System.out.println("The Error message is same as expected -> " +textErrorMessage);
        else
            System.out.println("The Error message doesn't match ->" +textErrorMessage);
        Utils.closeWebsite();
    }

    // Login with blank username and  valid password
    @Test
    public  void LoginWithBlankUsername() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        String textErrorMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
        if(blankUsername.equals(textErrorMessage))
            System.out.println("The Error message is same as expected -> " +textErrorMessage);
        else
            System.out.println("The Error message doesn't match ->" +textErrorMessage);
        Utils.closeWebsite();
    }

    // Login with blank username and  blank password
    @Test
    public  void LoginWithBlankField() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("");
        login.inputPassword("");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        String textErrorMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
        if(blankUsername.equals(textErrorMessage))
            System.out.println("The Error message is same as expected -> " +textErrorMessage);
        else
            System.out.println("The Error message doesn't match ->" +textErrorMessage);
        Utils.closeWebsite();
    }

    // login with employee account
    @Test
    public void LoginWithEmployeeAccount() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("aaqmarinaa");
        login.inputPassword("Aqmarina18@");
        login.clickButtonLogin();
        login.userSeeDashboardPage();
    }
}


