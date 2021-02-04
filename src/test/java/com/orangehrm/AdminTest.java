package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Admin;
import com.sekolahqa.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AdminTest {
    WebDriver driver = Utils.getDriver();

    public AdminTest() throws IOException {
    }

    @Test
    public void addEmployee() throws InterruptedException {
    Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
    Login login = new Login(driver);
    Admin admin = new Admin(driver);

    login.inputUsername("Admin");
    login.inputPassword("s3Kol4HQA!*");
    login.clickButtonLogin();
    admin.clickButtonAdmin();
    admin.clickButtonAddEmployee();
    admin.inputEmployeeName("Muhammad Ariansyah Riwendi");
    admin.inputUsername("ariansyah9");
    admin.inputPassword("s3Kol4HQA!*");
    admin.inputConfirmPassword("s3Kol4HQA!*");
    admin.clickButtonSave();
    }

    @Test
    public void addEmployeeWithExistingUsername() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        Admin admin = new Admin(driver);

        login.inputUsername("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Muhammad Ariansyah Riwendi");
        admin.inputUsername("ariansyah9");
        admin.inputPassword("s3Kol4HQA!*");
        admin.inputConfirmPassword("s3Kol4HQA!*");
        admin.clickButtonSave();
        admin.errorMessageUsernameAlreadyExist();
    }

}
