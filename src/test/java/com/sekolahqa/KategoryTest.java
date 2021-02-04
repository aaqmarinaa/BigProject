package com.sekolahqa;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Kategory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class KategoryTest {
    WebDriver driver = Utils.getDriver();

    public KategoryTest() throws IOException {
    }

    @Test
    public void userShouldSeePromoPageAfterClickSemuaPromoButton() throws InterruptedException {
        Utils.openWebsite("https://www.tokopedia.com/");
        Kategory kategory = new Kategory(driver);
        kategory.userGoToPembayaran();
        Utils.closeWebsite();
    }
}
