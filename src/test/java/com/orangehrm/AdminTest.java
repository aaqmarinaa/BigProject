package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Admin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AdminTest {
    WebDriver driver = Utils.getDriver();
    Admin admin = new Admin(driver);
    LoginTest logintest = new LoginTest();

    private String usernameAlreadyExists = "Already exists";
    private String wrongConfirmPassword = "Passwords do not match";

    public AdminTest() throws IOException {
    }

    // add Employee with Valid data
    @Test
    public void addEmployee() throws InterruptedException {
//        logintest.LoginWithValidFormatAdmin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Almas Aqmarina");
        admin.inputUsername("aaqmarinaa5");
        admin.inputPassword("Aqmarina18@");
        admin.inputConfirmPassword("Aqmarina18@");
        admin.clickButtonSave();
        Utils.closeWebsite();
    }

    // add Employee with Existing Username
    @Test
    public void addEmployeeWithExistingUsername() throws InterruptedException {
        logintest.LoginWithValidFormatAdmin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Almas Aqmarina");
        admin.inputUsername("aaqmarinaa");
        admin.inputPassword("Aqmarina18@");
        admin.inputConfirmPassword("Aqmarina18@");
        admin.clickButtonSave();
        admin.errorMessageUsernameAlreadyExist();
//        String textErrorMessage = driver.findElement(By.xpath("//*[@id=\"frmSystemUser\"]/fieldset/ol/li[3]/span")).getText();
//        if (usernameAlreadyExists.equals(textErrorMessage))
//            System.out.println("The Error message is same as expected -> "+textErrorMessage);
//        else System.out.println("The Error message isn't same as expected -> "+textErrorMessage);
        Utils.closeWebsite();
    }

    // add Employee With Wrong Confirm Password
    @Test
    public void addEmployeeWithWrongConfirmPassword() throws InterruptedException {
        logintest.LoginWithValidFormatAdmin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Almas Aqmarina");
        admin.inputUsername("aaqmarinaa2");
        admin.inputPassword("Aqmarina18@");
        admin.inputConfirmPassword("Aqmarina1@");
        admin.clickButtonSave();
        admin.errorMessageConfirmPasswordWrong();
//        String textErrorMessage = driver.findElement(By.xpath("//*[@id=\"frmSystemUser\"]/fieldset/ol/li[7]/span")).getText();
//        if (wrongConfirmPassword.equals(textErrorMessage))
//            System.out.println("The Error message is same as expected -> "+textErrorMessage);
//        else System.out.println("The Error message isn't same as expected -> "+textErrorMessage);
        Utils.closeWebsite();
    }
}
