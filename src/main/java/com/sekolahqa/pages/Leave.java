package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leave extends BasePage {
    private By btnLeave = new By.ByXPath("//*[@id=\"menu_leave_viewLeaveModule\"]");
    private By btnAssignLeave = new By.ByXPath("//*[@id=\"menu_leave_assignLeave\"]");
    private By fieldEmployeeName = new By.ByXPath("//*[@id=\"assignleave_txtEmployee_empName\"]");
    private By selectLeaveType = new By.ByXPath("//*[@id=\"assignleave_txtLeaveType\"]");

    public Leave(WebDriver driver) { super(driver); }

    public void clickMenuLeave() throws InterruptedException {
        clickButton(btnLeave);
    }

    public void clickAssignLeave() throws InterruptedException {
        clickButton(btnAssignLeave);
    }

    public void inputEmployeeName(String employeeName) throws InterruptedException {
        inputText(fieldEmployeeName, employeeName);
    }

    public void setSelectLeaveType(String leaveType) throws InterruptedException {
        inputText(selectLeaveType, leaveType);
    }
}
