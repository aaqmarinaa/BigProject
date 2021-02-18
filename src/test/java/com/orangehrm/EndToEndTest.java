package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Admin;
import com.sekolahqa.pages.Login;
import com.sekolahqa.pages.Logout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class EndToEndTest {
    WebDriver driver = Utils.getDriver();
    LoginTest loginTest = new LoginTest();
    AdminTest adminTest = new AdminTest();
    AttendanceTest attendanceTest = new AttendanceTest();
    LeaveTest leaveTest = new LeaveTest();
    Logout logout = new Logout(driver);

    public EndToEndTest() throws IOException{
    }

    // login with admin
    @Test
    public void OneBisnisFlowTest() throws InterruptedException {
        loginTest.LoginWithValidFormatAdmin();
        adminTest.addEmployee();
        logout.userClickProfile();
        logout.userClickLogout();
        loginTest.LoginWithEmployeeAccount();
        attendanceTest.punchIn();
        leaveTest.applyLeaveFromEmployee();
        logout.userClickProfile();
        logout.userClickLogout();
    }
}
