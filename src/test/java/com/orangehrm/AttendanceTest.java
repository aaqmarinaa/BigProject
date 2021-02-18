package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Attendance;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AttendanceTest {
    WebDriver driver = Utils.getDriver();
    Attendance attendance = new Attendance(driver);
    LoginTest logintest = new LoginTest();

    public AttendanceTest() throws IOException {
    }

    @Test
    public void punchIn() throws InterruptedException {
//        logintest.LoginWithEmployeeAccount();
        attendance.clickButtonTime();
        attendance.clickButtonPunchIn();
        attendance.inputNote("test in 1");
        attendance.clickButtonIn();
        attendance.userSeePunchInNote();
    }

    @Test
    public void punchOut() throws InterruptedException {
        punchIn();
        attendance.inputNote("test out 1");
        attendance.clickButtonOut();
    }
}
