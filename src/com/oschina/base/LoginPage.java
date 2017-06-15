package com.oschina.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private static WebElement element = null;
	
	public static WebElement login_click(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/header/div/div[2]/div/a[1]"));
		return element;
	}
	
	public static WebElement login_username(WebDriver driver) {
		element = driver.findElement(By.id("userMail"));
		return element;
	}
	
	public static WebElement login_password(WebDriver driver) {
		element = driver.findElement(By.id("userPassword"));
		return element;
	}
	
	public static WebElement login_button(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='account_login']/form/div/div[5]/button"));
		return element;
	}
	
	public static WebElement login_user_null(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='account_login']/form/div/div[1]/div[2]/span"));
		return element;
	}
	
	public static WebElement login_pwd_null(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='account_login']/form/div/div[2]/div[2]/span"));
		return element;
	}
	
	public static WebElement login_error(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='account_login']/form/div/div[5]/div/span"));
		return element;
	}
	
	public static WebElement login_assert(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/span"));
		return element;
	}
	
	public static WebElement logout(WebDriver driver) {
		element = driver.findElement(By.linkText("退出"));
		return element;
	}

}
