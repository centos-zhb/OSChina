package com.oschina.test;

import org.testng.annotations.Test;

import com.oschina.pom.OSLogin;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login_Case {
	private WebDriver driver;
	private String Base_Url;
	private String username = "zb194236@sina.com";
	private String password = "zhb194236";
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  Base_Url = "https://www.oschina.net";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test_user_null_case() throws InterruptedException {
	  driver.get(Base_Url);
	  //调用登录模块
	  OSLogin.login(driver, "", "");
	  Thread.sleep(5000);
	  //验证错误
	  String text = OSLogin.login_user_null(driver);
	  Thread.sleep(5000);
	  Assert.assertEquals(text, "用户名不能为空");
  }
  
  @Test
  public void test_pwd_null_case() throws InterruptedException {
	  driver.get(Base_Url);
	  //调用登录模块
	  OSLogin.login(driver, username, "");
	  Thread.sleep(5000);
	  //验证错误
	  String text = OSLogin.login_pwd_null(driver);
	  Thread.sleep(5000);
	  Assert.assertEquals(text, "密码不能为空");
  }
  
  @Test
  public void test_user_pwd_error_case() throws InterruptedException {
	  driver.get(Base_Url);
	  //调用登录模块
	  OSLogin.login(driver, username, "123456");
	  Thread.sleep(5000);
	  //验证错误
	  String text = OSLogin.login_user_pwd_error(driver);
	  Thread.sleep(5000);
	  Assert.assertEquals(text, "登录失败，请确认是否输入正确的用户名和密码");
  }
  
  @Test
  public void test_login_case() throws InterruptedException {
	  driver.get(Base_Url);
	  //调用登录模块
	  OSLogin.login(driver, username, password);
	  Thread.sleep(5000);
	  //验证错误
	  String text = OSLogin.login_assert(driver);
	  Thread.sleep(5000);
	  Assert.assertEquals(text, "无量-大善");
  }
  
  @AfterMethod
  public void afterMethod() {
	  //关闭浏览器
	  driver.close();
  }

}
