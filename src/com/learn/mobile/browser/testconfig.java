package com.learn.mobile.browser;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class testconfig {
public static AppiumDriver wd ;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() throws MalformedURLException {
	 /* DesiredCapabilities capabilities = new DesiredCapabilities();
	   capabilities.setCapability("deviceName", "QA Team (galaxy S5)");
	   capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	   capabilities.setCapability(CapabilityType.VERSION, "6.0");
	   wd = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);*/
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "iPhone 6");
	  capabilities.setCapability("platformName", "iOS");
	  capabilities.setCapability("platformVersion", "9.3"); 
	  capabilities.setCapability("BROWSER_NAME", "safari");
	  wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//instantiate driver
	  //wd.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
	   
  }

  @AfterSuite
  public void afterSuite() {
  }

}
