package com.learn.mobile.browser;

import org.testng.annotations.Test;

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
public class videocategory extends testconfig {
 
 String style;
 String showall_video;
 String [] name_list= {"show all","80'90's","african drama","cartoon tv" ,"cartoon tv (arabic)","cooking tv","cooking tv (arabic)","english club tv","fight tv","fitness tv", "fitness tv (arabic)","football tv (arabic)", "football tv",
		 "gaming tv", "gossip","how to","joke tv","karaoke tv kids","mad tv","movies news", "one tv","scream tv","series zone","short films tv","speed tv","sports tv","sports tv (arabic)","street tv"};
@Test
 public void leftpanelvideo() throws InterruptedException {
	
    wd.get("http://live.viddigo.com");
    Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[2]/a")).click();
   Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/div/div[2]/a")).click();
   Thread.sleep(2000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   if(wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase("videos"))
   {
	   for (int i=1;i<name_list.length; i++)
	  {
		 wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li["+i+"]/a")).click();
		System.out.println("value in header ="+wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase());
		System.out.println("Value in left panel ="+wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li["+i+"]/a")).getText().toLowerCase());
		Thread.sleep(3000);
		System.out.println("value in header ="+wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase());
		System.out.println("Value in left panel ="+wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li["+i+"]/a")).getText().toLowerCase());
		
	 if(wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li["+i+"]/a")).getText().toLowerCase().contains(wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase()))
	 {
		
		 wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
	 }
	 else
	 {
		 Assert.fail();
	 }
	 Thread.sleep(2000);
	  }
  }
   else
   {Assert.fail();}
  
   
  //wd.navigate().refresh();
 
  
 }

 
}