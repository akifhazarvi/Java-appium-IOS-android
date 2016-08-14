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
import org.testng.annotations.BeforeSuite;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class LiveTVCategorypagesTest extends testconfig {
 
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
 public void livetvcategory() throws InterruptedException {
	
    wd.get("http://live.viddigo.com/#/?_k=d66m0l");
    wd.navigate().refresh();
    Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[1]/a")).click();
   Thread.sleep(3000);
   // check Live Tv show all page
   showall = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/div/div[2]/a")).getText().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/div/div[2]/a")).click();
  
  if(wd.findElement(By.xpath(" //*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase("live tv"))
		  
  		{
	  System.out.println("Live tv page");
		  }
  else
  {
	  Assert.fail();
  }
  Thread.sleep(2000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   entertainment = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[1]/a")).getText().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[1]/a")).click();
   Thread.sleep(3000);
   if(wd.findElement(By.xpath(" //*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase(entertainment))
	  {
      System.out.println("Live tv page");
	  }
   else
   {
	   Assert.fail();
   }
   Thread.sleep(2000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   sports = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[2]/a")).getText().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[2]/a")).click();
   Thread.sleep(3000);
   if(wd.findElement(By.xpath(" //*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase(sports))
	  {
   System.out.println("Live tv page");
	  }
   else
   {
	   Assert.fail();
   }
   Thread.sleep(2000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   kids = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[3]/a")).getText().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[3]/a")).click();
   Thread.sleep(3000);
   if(wd.findElement(By.xpath(" //*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase(kids))
	  {
	   System.out.println("Live tv page");
	  }
   else
   {
	   Assert.fail();
   }
   Thread.sleep(2000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   learning = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[4]/a")).getText().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[4]/a")).click();
   Thread.sleep(3000);
   if(wd.findElement(By.xpath(" //*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase(learning))
	  {
	   System.out.println("Live tv page");
	  }
   else
   {
	   Assert.fail();
   }
   Thread.sleep(2000);
   
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   music = wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[5]/a")).getText().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[5]/a")).click();
   Thread.sleep(3000);
   if(wd.findElement(By.xpath(" //*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase(music))
	  {
	   System.out.println("Live tv page");
	  }
else
{
	   Assert.fail();
}
   Thread.sleep(2000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   news= wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[6]/a")).getText().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[6]/a")).click();
   Thread.sleep(3000);
   if(wd.findElement(By.xpath(" //*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase(news))
	  {
	   System.out.println("Live tv page");
	  }
else
{
	   Assert.fail();
}
   Thread.sleep(2000);
   
   }

 
}