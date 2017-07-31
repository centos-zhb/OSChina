package com.oschina.test;

import com.oschina.pom.OSHome;
import com.oschina.pom.OSLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Veryci on 2017/7/31.
 */
public class Home_Case {
    private WebDriver driver;
    private String Base_Url;
    Date date = new Date();

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        Base_Url = "https://www.oschina.net";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(Base_Url);
        OSLogin.login(driver,"zb194236@sina.com","zb194236");
    }

    @Test
    public void test_home_msg_case() throws InterruptedException{
        OSHome.Home_msg(driver);
        Thread.sleep(3000);
        System.out.println(date+" "+driver.getCurrentUrl());
    }

    @Test
    public void test_home_discuss_case() throws InterruptedException {
        OSHome.Home_discuss(driver);
        Thread.sleep(3000);
        System.out.println(date+" "+driver.getCurrentUrl());
    }

    @Test
    public void test_home_code_case() throws InterruptedException {
        OSHome.Home_code(driver);
        Thread.sleep(3000);
        System.out.println(date+" "+driver.getCurrentUrl());
    }

    @Test
    public void test_home_blog_case() throws InterruptedException {
        OSHome.Home_blog(driver);
        Thread.sleep(3000);
        System.out.println(date+" "+driver.getCurrentUrl());
    }

    @Test
    public void test_home_friends_case() throws InterruptedException {
        OSHome.Home_friends(driver);
        Thread.sleep(3000);
        System.out.println(date+" "+driver.getCurrentUrl());
    }

    @Test
    public void test_home_favorites_case() throws InterruptedException {
        OSHome.Home_favorites(driver);
        Thread.sleep(3000);
        System.out.println(date+" "+driver.getCurrentUrl());
    }

    @Test
    public void test_home_profile_case() throws InterruptedException {
        OSHome.Home_profile(driver);
        Thread.sleep(3000);
        System.out.println(date+" "+driver.getCurrentUrl());
    }

    @Test
    public void test_home_add_software_case() throws InterruptedException {
        OSHome.Home_addsoftware(driver);
        Thread.sleep(3000);
        System.out.println(date+" "+driver.getCurrentUrl());
    }

    @AfterMethod
    public void afertMethod(){
        //关闭浏览器
        driver.close();
    }
}
