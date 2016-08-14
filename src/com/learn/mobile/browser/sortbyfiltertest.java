package com.learn.mobile.browser;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.Assert;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class sortbyfiltertest extends testconfig {

 public static List<WebElement> elements;
 ArrayList<String> ar = new ArrayList<String>();
 String name;
 public static List<WebElement> elements1;
 ArrayList<String> ar1 = new ArrayList<String>();
 String name1;
@Test
 public void testSearchPage() throws InterruptedException {

   wd.get("http://live.viddigo.com/#/channels/57a7388e377404f2223c386a?_k=hfk3o6");
   Thread.sleep(5000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[1]/div[2]/div[1]")).click();
   Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[1]/div[2]/div[2]/ul/li[1]")).click();
   Thread.sleep(3000);
  
   elements= wd.findElements(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div"));
   int count=elements.size();
  
   for(int i=1; i<=count; i++)
   {
	 name=wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div["+ i +"]/div[1]/a/h2")).getText().toLowerCase().toString();
     ar.add(name);
	 System.out.println(wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div["+ i +"]/div[1]/a/h2")).getText().toLowerCase().toString());
	 
   }
   
 
   String previous = ""; // empty string: guaranteed to be less than or equal to any other

   for (final String current: ar) {
       if (current.compareTo(previous) < 0)
       {
       Assert.fail();
       }
           
       previous = current;
   }


   wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[1]/div[2]/div[2]/ul/li[2]")).click();
   Thread.sleep(3000);
  
   elements1= wd.findElements(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div"));
   int count1=elements1.size();
  
   for(int i=1; i<=count1; i++)
   {
	 name1=wd.findElement(By.xpath("//*[@id=\"mount-node\"]/div/div[4]/div/div[3]/div[2]/div["+ i +"]/div[1]/a/h2")).getText().toLowerCase().toString();
     ar1.add(name1);
	
	 
   }
   

   String previous1 = ""; // empty string: guaranteed to be less than or equal to any other

   for (final String current1: ar) {
       if (current1.compareTo(previous) > 0)
       {
       Assert.fail();
       }
           
       previous1 = current1;
   }


   }
@BeforeSuite
public void beforeSuite() throws MalformedURLException {
	 /* DesiredCapabilities capabilities = new DesiredCapabilities();
	   capabilities.setCapability("deviceName", "QA Team (galaxy S5)");
	   capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	   capabilities.setCapability(CapabilityType.VERSION, "6.0");
	   wd = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);*/
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "iPhone 6");
	  capabilities.setCapability("platformName", "iOS");
	  capabilities.setCapability("platformVersion", "9.3"); 
	  capabilities.setCapability("BROWSER_NAME", "safari");
	  wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//instantiate driver
	  //wd.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
	   
}
 

}