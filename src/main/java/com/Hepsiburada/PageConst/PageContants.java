package com.Hepsiburada.PageConst;

import org.openqa.selenium.By;

public interface  PageContants {

       By EMAIL = By.id("txtUserName");
       By PASSWORD = By.id("txtPassword");
       By LOGIN = By.id("btnLogin");
       By LOGINX=By.id("btnEmailSelect");

       By SEARCH_BOX =By.cssSelector("#SearchBoxOld > div > div > div.SearchBoxOld-inputContainer > div.desktopOldAutosuggestTheme-container > input");
       By SEARCH = By.className("SearchBoxOld-buttonContainer");

       By FAVORITE = By.xpath("//*[@id=\"i2\"]/div/a/div[2]/div[3]/div/svg/g/g/path");
       By FAVORITEADD= By.className("moria-ProductCard-iZomLi");


    }

