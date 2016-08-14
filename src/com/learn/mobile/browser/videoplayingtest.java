package com.learn.mobile.browser;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class videoplayingtest {
 public AppiumDriver wd ;
@Test
 public void testSearchPage() throws InterruptedException {

  
  wd.get("http://live.viddigo.com/#/video/300870?_k=jntun0");
  JavascriptExecutor js =( JavascriptExecutor) wd;
  Thread.sleep(5000);
  wd.findElement(By.xpath("//*[@id=\"videoPlayer\"]")).click();
  Thread.sleep(5000);
 

 
 }
 @BeforeTest
 public void beforeTest() throws MalformedURLException { //set capabilities required
  DesiredCapabilities capabilities = new DesiredCapabilities();
  capabilities.setCapability("deviceName", "iPhone 6");
  capabilities.setCapability("platformName", "iOS");
  capabilities.setCapability("platformVersion", "9.3"); 
  capabilities.setCapability("BROWSER_NAME", "safari");
  
  wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//instantiate driver
  wd.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
 }

 @AfterTest
 public void afterTest() {
  //wd.close();
 }
}