package com.learn.mobile.browser;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

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
public class AddRemoveFavoirtesTest extends testconfig{


 
 
@Test
 public void testSearchPage() throws InterruptedException {
	
	String div_before_name_removed;
	String div_after_name_removed;
	 

    wd.get("http://live.viddigo.com/#/favorites?_k=7407kb");
    Thread.sleep(3000);
   div_before_name_removed= wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div/div/div[1]/a/h2")).getText().toString().toLowerCase();
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div/div/div[1]/div/span/i")).click();
  //wd.navigate().refresh();
  div_after_name_removed= wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div/div/div[1]/a/h2")).getText().toString().toLowerCase();
  System.out.print(div_before_name_removed);
Thread.sleep(3000);
  
  if((div_before_name_removed).equalsIgnoreCase ( div_after_name_removed))
  {
	  Assert.fail("Removed Favorite is still appearing");
 }
  
  /*WebElement video= wd.findElement(By.id("videoPlayer"));
  JavascriptExecutor js =( JavascriptExecutor) wd ;
  js.executeScript ("arguments[0].play();",video);
  System.out.print( js.executeScript ("arguments[0].play();",video));*/
  //wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div[1]/a")).click();
  //wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 // WebElement video= wd.findElement(By.id("video"));
  //JavascriptExecutor js =( JavascriptExecutor) wd ;
  //js.executeScript ("arguments[0].play();",video);
 
 

 
  
  /*wd.get("http://live.viddigo.com/#/video/100483?_k=gdm3v1");
  wd.manage().timeouts().pageLoadTimeout( 30,TimeUnit.SECONDS);
  wd.findElement(By.className("CategoryItem-seeall")).click();
*/
  
 }

}