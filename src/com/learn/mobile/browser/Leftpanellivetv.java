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
public class Leftpanellivetv extends testconfig {

 private String showall;
 private String entertainment;
 private String sports;
 private String kids;
 private String learning;
 private String music;
 private String news;

 String style;
 String [] name_list= {"show all","entertainment","sports","kids","learning","music","news" };

	
@Test
 public void leftpanellivetv() throws InterruptedException {
	
    wd.get("http://live.viddigo.com");
    Thread.sleep(10000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[1]/a")).click();
   wd.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
   showall = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/div/div[2]/a")).getText().toLowerCase();
   entertainment = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[1]/a")).getText().toLowerCase();
   sports = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[2]/a")).getText().toLowerCase();
   kids = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[3]/a")).getText().toLowerCase();
   learning = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[4]/a")).getText().toLowerCase();
   music = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[5]/a")).getText().toLowerCase();
   news= wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[6]/a")).getText().toLowerCase();
  
	
 
  if ( showall.equalsIgnoreCase (name_list[0]) && entertainment.equalsIgnoreCase(name_list[1]) && sports.equalsIgnoreCase(name_list[2]) && kids.equalsIgnoreCase(name_list[3]) && learning.equalsIgnoreCase(name_list[4]) && music.equalsIgnoreCase(name_list[5]) && news.equalsIgnoreCase(name_list[6]))
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