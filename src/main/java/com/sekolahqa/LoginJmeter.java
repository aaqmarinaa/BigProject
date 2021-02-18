package com.sekolahqa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoginJmeter {
    WebDriver driver;
    Properties properties;

    @Before
    public void beforeTest() throws IOException {
        System.out.println("Before test");
        System.setProperty("webdriver.chrome.driver", "D:\\QA life\\Selenium\\BigProject\\sekolahqa\\driver\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin(){
        driver.get("https://qa.cilsy.id");
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("s3Kol4HQA!*");
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        driver.close();

    }
    @After
    public void afterTest() {
        System.out.println("After test.");
    }

}
