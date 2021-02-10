package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Leave;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LeaveTest {
    WebDriver driver = Utils.getDriver();
    Leave leave = new Leave(driver);
    LoginTest loginTest = new LoginTest();

    public LeaveTest() throws IOException {
    }

    // Admin assignee leave for employee from admin
    @Test
    public void assigneeLeaveForEmployee() throws InterruptedException {
        loginTest.LoginWithValidFormatAdmin();
        leave.clickMenuLeave();
        leave.clickAssignLeave();
        Thread.sleep(300);
        leave.inputEmployeeName("Almas Aqmarina");
        Thread.sleep(300);
        leave.setSelectAssignLeaveType("Cuti");
        Thread.sleep(300);
        leave.inputAssignFromDateLeave("2021-03-22");
        Thread.sleep(300);
        leave.inputAssignToDateLeave("2021-03-23");
        Thread.sleep(300);
        leave.clickAssignButton();
    }

    // Employee apply leave
    @Test
    public void applyLeaveFromEmployee() throws InterruptedException {
        loginTest.LoginWithEmployeeAccount();
        leave.clickMenuLeave();
        leave.clickApplyLeave();
        leave.setSelectApplyLeaveType("Cuti");
        leave.inputApplyFromDateLeave("2021-04-15");
        leave.inputApplyToDateLeave("2021-04-16");
        leave.clickApplyButton();
    }
}
