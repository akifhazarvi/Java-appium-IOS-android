package com.learn.mobile.browser;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class tvguide extends testconfig {


@Test
 public void testSearchPage() throws InterruptedException {
	
    wd.get("http://live.viddigo.com");
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[1]")).click();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[3]/a")).click();
   
  if( wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/header/div[2]/h1")).getText().toLowerCase().equalsIgnoreCase( wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/nav/ul/li[3]/a")).getText().toLowerCase()))
   
  {
	  wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[1]/div[2]/div/h3/a")).click();
      Thread.sleep(3000);

	  if(wd.findElement(By.xpath("//*[@id=\"videoPlayer\"]")).getTagName().equalsIgnoreCase("video"))
	  {
		  System.out.println("New page has been loaded");
	  }
	  else
	  {
		  Assert.fail();
	  }
	  
  }
  else
  {
	  Assert.fail("Wrong page has been loaded. Title missmatch with leftpanel");
  }
 
  
 }

}