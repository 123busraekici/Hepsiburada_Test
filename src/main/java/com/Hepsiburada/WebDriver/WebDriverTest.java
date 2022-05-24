package com.Hepsiburada.WebDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
    public WebDriver driver;
    public String driverName = "webdriver.chrome.driver";
    public String driverPath = "src/main/resources/driver/chromedriver.exe";
    public String url = "http://www.hepsiburada.com";

    @Before
    public void setup() {
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    public void thread(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void close() {
        driver.quit();
    }
}
