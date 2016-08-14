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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class Leftsidepanel extends testconfig{
	 String live_tv;
	 String videos;
	 String favorites;
	 String tv_guide;
	 String style;
	 String [] name_list= {"live tv","videos","tv guide","favorites"};
	 
	 
	@Test
 public void leftsidepanel() throws InterruptedException {
	 
	wd.get("http://live.viddigo.com/#/?_k=d66m0l");
   
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   live_tv = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[1]/a")).getText().toLowerCase();
   videos = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[2]/a")).getText().toLowerCase();
   tv_guide = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[3]/a")).getText().toLowerCase();
   favorites =wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[4]/a")).getText().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/div/div/a")).click();
	  style= wd.findElement(By.className("App-cover")).getAttribute("style").toString();
 
  if ( live_tv.equalsIgnoreCase (name_list[0]) && videos.equalsIgnoreCase(name_list[1]) && tv_guide.equalsIgnoreCase(name_list[2]) && favorites.equalsIgnoreCase(name_list[3]) && style .equalsIgnoreCase("display: none;" ))
  {
	 
	  System.out.println("TestCase Passed");
  }
  else
  {
	  Assert.fail();
  }
   
  //wd.navigate().refresh();
 
  
 }



}