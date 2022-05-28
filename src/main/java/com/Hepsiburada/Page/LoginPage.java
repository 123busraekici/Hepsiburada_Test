package com.Hepsiburada.Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Hepsiburada.util.BasePageUtil;
import com.Hepsiburada.PageConst.*;

public class LoginPage extends BasePageUtil implements PageContants {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() throws InterruptedException {

        Thread.sleep(3000);
        sendKey(EMAIL, "test.busrae@gmail.com");
        click(LOGIN);
        Thread.sleep(5000);
        sendKey(PASSWORD, "123456Ab.");
        click(LOGINX);
        Thread.sleep(5000);

        Assert.assertTrue("Uye girisi yapilamadi", getTitle().contains("Üye Giriş Sayfası"));
        System.out.println("Uye girisi basarili.");
    }

}