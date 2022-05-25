package com.Hepsiburada.Page;

import com.Hepsiburada.PageConst.PageContants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Hepsiburada.util.BasePageUtil;

public class SecondPage extends BasePageUtil implements PageContants {
    public SecondPage(WebDriver driver) {
        super(driver);
    }

    public void search_plus() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(3000);


    }
}
