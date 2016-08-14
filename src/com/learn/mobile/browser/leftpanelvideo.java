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
import org.testng.annotations.BeforeSuite;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class leftpanelvideo extends testconfig {

 String style;
 String showall_video;
 String [] name_list= {"show all","80'90's","african drama","cartoon tv" ,"cartoon tv (arabic)","cooking tv","cooking tv (arabic)","english club tv","fight tv","fitness tv", "fitness tv (arabic)","football tv (arabic)", "football tv",
		 "gaming tv", "gossip","how to","joke tv","karaoke tv kids","mad tv","movies news", "one tv","scream tv","series zone","short films tv","speed tv","sports tv","sports tv (arabic)","street tv"};
 
@Test
 public void leftpanelvideo() throws InterruptedException {
	
    wd.get("http://live.viddigo.com");
    Thread.sleep(5000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[2]/a")).click();
   wd.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
   showall_video = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/div/div[2]/a")).getText().toLowerCase();

  
	
 
  if ( showall_video.equalsIgnoreCase (name_list[0]))
  {
	  for (int i=1;i<name_list.length; i++)
	  {
		  System.out.println( "value = "+wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li["+i+"]/a")).getText().toLowerCase());
	  		System.out.println("Value comparisom = "+ name_list[i]);
	 if( wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li["+i+"]/a")).getText().toLowerCase().contains(name_list[i]))
	 {
	
	 }
	 else
	 {
		 Assert.fail();
	 }
	  }
  }
  else
  {
	  Assert.fail();
  }
   
  //wd.navigate().refresh();
 
  
 }


}