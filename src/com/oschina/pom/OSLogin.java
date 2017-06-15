package com.oschina.pom;

import org.openqa.selenium.WebDriver;

import com.oschina.base.LoginPage;

public class OSLogin {
	private static WebDriver driver = null;
	
	public static void login(WebDriver driver,String username,String password) {
		LoginPage.login_click(driver).click();
		LoginPage.login_username(driver).clear();
		LoginPage.login_username(driver).sendKeys(username);
		LoginPage.login_password(driver).clear();
		LoginPage.login_password(driver).sendKeys(password);
		LoginPage.login_button(driver).click();
	}

	//用户名不能为空
	public static String login_user_null(WebDriver driver) {
		String text = LoginPage.login_user_null(driver).getText();
		return text;
	}
	
	//密码不能为空
	public static String login_pwd_null(WebDriver driver) {
		String text = LoginPage.login_pwd_null(driver).getText();
		return text;
	}

	//登录失败，请确认是否输入正确的用户名和密码
	public static String login_user_pwd_error(WebDriver driver) {
		String text = LoginPage.login_error(driver).getText();
		return text;
	}
	
	//登录名
	public static String login_assert(WebDriver driver) {
		String text = LoginPage.login_assert(driver).getText();
		return text;
	}
	
	//退出方法
	public static void logout(WebDriver driver) {
		LoginPage.logout(driver).click();
	}
}
