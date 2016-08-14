package com.learn.mobile.browser;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
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
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class searchtest extends testconfig {

@Test
 public void testSearchPage() throws InterruptedException {

  wd.get("http://live.viddigo.com/#/channels/57a7388e377404f2223c386a?_k=4vppv4");
  wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[1]/div[1]")).click();
  Thread.sleep(2000);
  WebElement searchtext=wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[1]/div[2]/form/input"));
  searchtext.sendKeys("kids");
  Thread.sleep(2000);
  wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div/div/a")).click();
  
  Thread.sleep(3000);
  if(wd.findElement(By.xpath("//*[@id=\"videoPlayer\"]")).getTagName().equalsIgnoreCase("video"))
  {
	  
  }
  else
  {
	  Assert.fail("New page is not loaded");
  }
  



 
 }

}