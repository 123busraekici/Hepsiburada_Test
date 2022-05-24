package com.Hepsiburada.Page;

import com.Hepsiburada.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageUtil {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage callLoginPage() throws InterruptedException {

        clickElement(By.xpath("//*[@id=\"myAccount\"]"));
        Thread.sleep(1000);
        clickElement(By.xpath("//*[@id=\"login\"]"));
        Thread.sleep(4000);
        Assert.assertTrue("Login sayfası yüklenemedi.", getTitle().contains("Üye Giriş Sayfası"));
        System.out.println("Login sayfası yüklendi.");

        return new LoginPage(driver);
    }

}