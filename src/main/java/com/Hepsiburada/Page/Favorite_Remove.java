package com.Hepsiburada.Page;

import com.Hepsiburada.PageConst.PageContants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Hepsiburada.util.BasePageUtil;

public class Favorite_Remove extends BasePageUtil implements PageContants {
    public Favorite_Remove(WebDriver driver) {
        super(driver);
    }

    public void favorite() throws InterruptedException {

        Thread.sleep(3000);
        click(FAVORITEADD);
        Thread.sleep(5000);
    }
}
