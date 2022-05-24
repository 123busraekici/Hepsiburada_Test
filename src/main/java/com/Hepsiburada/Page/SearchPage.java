package com.Hepsiburada.Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Hepsiburada.util.BasePageUtil;

public class SearchPage extends BasePageUtil {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void search() throws InterruptedException {
        Thread.sleep(3000);
        sendKey(By.id("SearchBoxOld"),"Samsung");
        Thread.sleep(1000);
   }
}