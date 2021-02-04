package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Admin extends BasePage{
    private By btnAdmin = new By.ByXPath("//*[@id='menu_admin_viewAdminModule']/b");
    private By btnAddEmployee = new By.ByXPath("//*[@id='btnAdd']");
    private By fieldEmployeeName = new By.ByXPath("//*[@id='systemUser_employeeName_empName']");
    private By fieldUsername = new By.ByXPath("//*[@id='systemUser_userName']");
    private By fieldPassword = new By.ByXPath("//*[@id='systemUser_password']");
    private By fieldConfirmPassword = new By.ByXPath("//*[@id='systemUser_confirmPassword']");
    private By btnSave = new By.ByXPath("//*[@id=\"btnSave\"]");
    private By errorMessage = new By.ByXPath("//*[@id='frmSystemUser']/fieldset/ol/li[3]/span");

    public Admin (WebDriver driver) { super(driver); }

    public void clickButtonAdmin() throws InterruptedException {
        clickButton(btnAdmin);
    }

    public void clickButtonAddEmployee() throws InterruptedException {
        clickButton(btnAddEmployee);
    }

    public void inputEmployeeName(String employeeName) throws  InterruptedException {
        inputText(fieldEmployeeName, employeeName);
    }

    public void inputUsername(String username) throws InterruptedException {
        inputText(fieldUsername, username);
    }

    public void inputPassword(String password) throws InterruptedException{
        inputText(fieldPassword, password);
    }

    public void inputConfirmPassword(String confirmPassword) throws InterruptedException{
        inputText(fieldConfirmPassword, confirmPassword);
    }

    public void clickButtonSave() throws InterruptedException {
        clickButton(btnSave);
    }

    public void errorMessageUsernameAlreadyExist() throws InterruptedException {
        waitUntilElementIsVisible(errorMessage);
    }

}