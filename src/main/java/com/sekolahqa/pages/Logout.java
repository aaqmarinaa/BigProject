package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends BasePage {
    private By btnWelcome = new By.ByXPath("//*[@id=\"welcome\"]");
    private By btnLogout = new By.ByXPath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");

    public Logout (WebDriver driver) {super(driver);}

    public void userClickProfile() throws InterruptedException{
        clickButton(btnWelcome);
    }

    public void userClickLogout() throws InterruptedException{
        clickButton(btnLogout);
    }
}
