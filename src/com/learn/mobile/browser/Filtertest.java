package com.learn.mobile.browser;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.Assert;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class Filtertest extends testconfig {

 public static List<WebElement> elements;
@Test
 public void testSearchPage() throws InterruptedException {

   wd.get("http://live.viddigo.com/#/channels/57a7388e377404f2223c386a?_k=sfdwkq");
   Thread.sleep(5000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[1]/div[1]/div[1]")).click();
   Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[1]/div[1]/div[2]/label/span[1]")).click();
   Thread.sleep(3000);
   String Empty=wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div")).getAttribute("class").toLowerCase();
   
   if(Empty.equalsIgnoreCase("FavriteEmpty"))
	   
   {
	   System.out.println("No favorites");
   }
   else
   {
   elements= wd.findElements(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div"));
   int count=elements.size();
  
   for(int i=1; i<=count; i++)
   {
	   String classvalue=wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div["+i+"]/div[1]/div/span")).getAttribute("class").toLowerCase();
	  System.out.println("value is = "+ classvalue);
	 if(classvalue.equalsIgnoreCase("tile-favorites added"))
	 {
		 System.out.println("ok");
		
	 }
	 else
	 {
		 Assert.fail();
	 }
   }
   
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[1]/div[1]/div[2]/label[2]")).click();
   
   
   

   }
 }

}