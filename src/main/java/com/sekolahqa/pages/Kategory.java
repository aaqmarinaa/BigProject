package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kategory extends BasePage{
    private By feildEmail = new By.ByXPath("//span[contains(text(),'Semua Promo')]");
    private By pembayaran = new By.ByXPath("//span[contains(text(),'Pembayaran & Top Up')]");
    public Kategory (WebDriver driver) {
        super(driver);
    }

    public void userGoToPembayaran() throws InterruptedException {
//        clickButton(semuaPromoButton);
        waitUntilElementIsVisible(pembayaran);
    }
}
