package com.sekolahqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TokoPediaTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverWait webDriverWait;
        System.setProperty("webdriver.chrome.driver", "D:\\Program\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.tokopedia.com");
        WebElement kategoryButton = driver.findElements(new By.ByXPath("//div[contains(text(),'Kategori')]")).get(0);
        kategoryButton.click();
        Thread.sleep(500);
        driver.quit();
        driver.close();
    }
}
