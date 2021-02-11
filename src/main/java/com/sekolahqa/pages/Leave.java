package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Leave extends BasePage {
    private By btnLeave = new By.ByXPath("//*[@id=\"menu_leave_viewLeaveModule\"]");
    private By btnAssignLeave = new By.ByXPath("//*[@id=\"menu_leave_assignLeave\"]");
    private By btnApplyLeave = new By.ByXPath("//*[@id=\"menu_leave_applyLeave\"]");
    private By fieldEmployeeName = new By.ByXPath("//*[@id=\"assignleave_txtEmployee_empName\"]");
    private By selectAssignLeaveType = new By.ByXPath("//*[@id=\"assignleave_txtLeaveType\"]");

    private By fromDateAssignleave = new By.ByXPath("//*[@id=\"assignleave_txtFromDate\"]");
    private By toDateAssignLeave = new By.ByXPath("//*[@id=\"applyleave_txtToDate\"]");

    private By fromDateApplyleave = new By.ByXPath("//*[@id=\"applyleave_txtFromDate\"]");
    private By toDateApplyLeave = new By.ByXPath("//*[@id=\"applyleave_txtToDate\"]");

    private By btnAssignleave = new By.ByXPath("//*[@id=\"assignBtn\"]");
    private By menuLeaveList = new By.ByXPath("//*[@id=\"menu_leave_viewLeaveList\"]");

    private By toDateLabelAssign = new By.ByXPath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[5]/label");
    private By toDateLabelApply = new By.ByXPath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[4]/label");

    private By btnSubmitApply = new By.ByXPath("//*[@id=\"applyBtn\"]");
    private By menuApplyLeave = new By.ByXPath("//*[@id=\"menu_leave_applyLeave\"]");
    private By selectApplyLeaveType = new By.ByXPath("//*[@id=\"applyleave_txtLeaveType\"]");

    public Leave(WebDriver driver) { super(driver); }

    public void clickMenuLeave() throws InterruptedException {
        clickButton(btnLeave);
    }

    public void clickApplyLeave() throws InterruptedException {
        clickButton(menuApplyLeave);
    }

    public void clickAssignLeave() throws InterruptedException {
        clickButton(btnAssignLeave);
    }

    public void inputEmployeeName(String employeeName) throws InterruptedException {
        inputText(fieldEmployeeName, employeeName);
    }

    public void setSelectAssignLeaveType(String leaveType) throws InterruptedException {
        inputText(selectAssignLeaveType, leaveType);
    }

    public void setSelectApplyLeaveType(String leaveType) throws InterruptedException {
        inputText(selectApplyLeaveType, leaveType);
    }

    public void inputAssignFromDateLeave(String fromDate) throws InterruptedException {
        clickButton(fromDateAssignleave);
        inputText(fromDateAssignleave, fromDate);
    }

    public void inputAssignToDateLeave(String toDate) throws InterruptedException {
        clickButton(toDateLabelAssign);
        clickButton(toDateAssignLeave);
        inputText(toDateAssignLeave, toDate);
    }

    public void inputApplyFromDateLeave(String fromDate) throws InterruptedException {
        clickButton(fromDateApplyleave);
        inputText(fromDateApplyleave, fromDate);
    }
    public void inputApplyToDateLeave(String toDate) throws InterruptedException {
        clickButton(toDateLabelApply);
        clickButton(toDateApplyLeave);
        inputText(toDateApplyLeave, toDate);
    }

    public void clickAssignButton() throws InterruptedException {
        clickButton(btnAssignLeave);
    }

    public void clickApplyButton() throws InterruptedException {
        clickButton(btnSubmitApply);
    }
}
