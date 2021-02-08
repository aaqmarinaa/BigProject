package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Attendance extends BasePage {
    private By btnTimeNavbar = new By.ByXPath("//*[@id=\"menu_time_viewTimeModule\"]");
    private By btnAttendance = new By.ByXPath("//*[@id=\"menu_attendance_Attendance\"]");
    private By btnPunchIn = new By.ByXPath("//*[@id=\"menu_attendance_punchIn\"]");
    private By textAreaNote = new By.ByXPath("//*[@id=\"note\"]");
    private By btnIn = new By.ByXPath("//*[@id=\"btnPunch\"]");
    private By punchInNote = new By.ByXPath("//*[@id=\"punchTimeForm\"]/fieldset/ol/li[2]/label[1]");
    private By btnOut = new By.ByXPath("//*[@id=\"btnPunch\"]");

    public Attendance (WebDriver driver) { super(driver); }

    public void clickButtonTime() throws InterruptedException {
        waitUntilElementIsVisible(btnTimeNavbar);
        clickButton(btnTimeNavbar);
    }

    public void clickButtonPunchIn() throws InterruptedException {
        clickButton(btnAttendance);
        waitUntilElementIsVisible(btnPunchIn);
        clickButton(btnPunchIn);
    }

    public void inputNote(String textNote) throws InterruptedException {
        inputText(textAreaNote, textNote);
    }

    public void clickButtonIn() throws InterruptedException {
        clickButton(btnIn);
    }

    public void userSeePunchInNote() throws InterruptedException {
        clickButton(punchInNote);
    }

    public void clickButtonOut() throws InterruptedException {
        clickButton(btnOut);
    }
}
