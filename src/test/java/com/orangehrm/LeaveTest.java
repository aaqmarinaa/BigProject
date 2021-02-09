package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Leave;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LeaveTest {
    WebDriver driver = Utils.getDriver();
    Leave leave = new Leave(driver);
    LoginTest loginTest = new LoginTest();

    public LeaveTest() throws IOException {
    }

    // Admin assignee leave for employee
    @Test
    public void assigneeLeaveForEmployee() throws InterruptedException {
        loginTest.LoginWithValidFormatAdmin();
        leave.clickMenuLeave();
        leave.clickAssignLeave();
        leave.inputEmployeeName("Almas Aqmarina");
        leave.setSelectLeaveType("Cuti");
    }

//    @Test
}
