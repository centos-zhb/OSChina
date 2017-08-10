package com.oschina.pom;

import com.oschina.base.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Veryci on 2017/7/31.
 */
public class OSHome {
    private static WebDriver driver = null;

    public static void Home_msg(WebDriver driver){
        Actions action = new Actions(driver);
        action.clickAndHold(HomePage.My_space(driver)).perform();
        HomePage.My_msg(driver).click();
    }

    public static void Home_discuss(WebDriver driver){
        Actions action = new Actions(driver);
        action.clickAndHold(HomePage.My_space(driver)).perform();
        HomePage.My_discuss(driver).click();
    }

    public static void Home_code(WebDriver driver){
        Actions action = new Actions(driver);
        action.clickAndHold(HomePage.My_space(driver)).perform();
        HomePage.My_code(driver).click();
    }

    public static void Home_blog(WebDriver driver){
        Actions action = new Actions(driver);
        action.clickAndHold(HomePage.My_space(driver)).perform();
        HomePage.My_blog(driver).click();
    }

    public static void Home_friends(WebDriver driver){
        Actions action = new Actions(driver);
        action.clickAndHold(HomePage.My_space(driver)).perform();
        HomePage.My_friends(driver).click();
    }

    public static void Home_favorites(WebDriver driver){
        Actions action = new Actions(driver);
        action.clickAndHold(HomePage.My_space(driver)).perform();
        HomePage.My_favorites(driver).click();
    }

    public static void Home_profile(WebDriver driver){
        Actions action = new Actions(driver);
        action.clickAndHold(HomePage.My_space(driver)).perform();
        HomePage.My_profile(driver).click();
    }

    public static void Home_addsoftware(WebDriver driver){
        HomePage.Add_softwate(driver).click();
    }
}
