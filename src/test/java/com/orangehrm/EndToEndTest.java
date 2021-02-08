package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Admin;
import com.sekolahqa.pages.Login;
import com.sekolahqa.pages.Logout;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class EndToEndTest {
    WebDriver driver = Utils.getDriver();
    Login login = new Login(driver);
    Admin admin = new Admin(driver);
    Logout logout = new Logout(driver);

    public EndToEndTest() throws IOException{
    }

    // login with admin
    @Test
    public void LoginWithValidFormatAdmin() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/");
        Utils.maximizeWindow();
        login.userSeeLoginPage();
        login.inputUsername("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        login.userSeeDashboardPage();

        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Almas Aqmarina");
        admin.inputUsername("aaqmarinaa3");
        admin.inputPassword("Aqmarina18@");
        admin.inputConfirmPassword("Aqmarina18@");
        admin.clickButtonSave();

        logout.userClickProfile();
        logout.userClickLogout();

        login.inputUsername("aaqmarinaa");
        login.inputPassword("Aqmarina18@");

    }
}
