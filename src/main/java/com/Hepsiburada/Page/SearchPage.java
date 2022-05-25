package com.Hepsiburada.Page;

import com.Hepsiburada.PageConst.PageContants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Hepsiburada.util.BasePageUtil;

import javax.xml.stream.FactoryConfigurationError;

public class SearchPage extends BasePageUtil implements PageContants {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SecondPage search() throws InterruptedException {
        Thread.sleep(3000);
        sendKey(SEARCH_BOX, "Samsung");
        click(SEARCH);
        Thread.sleep(10000);

        return new SecondPage(driver);

    }

    public Favorite_Add favoriteAdd()throws InterruptedException{
        Thread.sleep(3000);
        sendKey(SEARCH_BOX, "Samsung");
        click(SEARCH);
        Thread.sleep(10000);
        return new Favorite_Add(driver);
    }
    public Favorite_Remove favoriteRemove()throws InterruptedException{
        Thread.sleep(3000);
        sendKey(SEARCH_BOX, "Samsung");
        click(SEARCH);
        Thread.sleep(10000);
        return new Favorite_Remove(driver);
    }
}