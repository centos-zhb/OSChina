package com.oschina.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Veryci on 2017/7/31.
 */
public class HomePage {
    private static WebElement element = null;

    //我的空间
    public static WebElement My_space(WebDriver driver){
        element = driver.findElement(By.id("MySpace"));
        return element;
    }

    //我的空间-->我的私信
    public static WebElement My_msg(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@class='msg']/a"));
        return element;
    }

    //我的空间-->我的讨论记录
    public static WebElement My_discuss(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@class='discuss']/a"));
        return element;
    }

    //我的空间-->我分享的代码
    public static WebElement  My_code(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@class='code']/a"));
        return element;
    }

    //我的空间-->我的博客
    public static WebElement My_blog(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@class='blog']/a"));
        return element;
    }

    //我的空间-->我关注的人
    public static WebElement My_friends(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@class='friends']/a"));
        return element;
    }

    //我的空间-->我的收藏夹
    public static WebElement My_favorites(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@class='favorites']/a"));
        return element;
    }

    //我的空间-->个人资料修改
    public static WebElement My_profile(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@class='profile']/a"));
        return element;
    }

    //添加软件
    public static WebElement Add_softwate(WebDriver driver){
        element = driver.findElement(By.xpath("html/body/header/div/div[2]/div/a[1]"));
        return element;
    }
}
