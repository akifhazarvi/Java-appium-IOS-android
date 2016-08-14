package com.learn.mobile.browser;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testobject.appium.testng.AppiumDriverProvider;


import org.testobject.appium.testng.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

@Listeners({TestObjectTestNGTestResultWatcher.class})
public class WatcherTestSetup implements AppiumDriverProvider {
	
	private AppiumDriver wd;

  @BeforeMethod
  public void beforeTest() throws MalformedURLException {
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 /* capabilities.setCapability("deviceName", "iPhone");
	  capabilities.setCapability("platformName", "iOS");
	  capabilities.setCapability("platformVersion", "9.3.3");
	  //capabilities.setCapability(MobileCapabilityType.APP, "");*/
	
	 // wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//instantiate driver
	  //wd.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
	  capabilities.setCapability("testobject_api_key","F23AD6BA905B40A59A63F3695FB990BD");
	  capabilities.setCapability("testobject_app_id","1");
	  capabilities.setCapability("testobject_device","iPhone_5_16GB_real");
	  wd = new IOSDriver(new URL("http://appium.testobject.com/wd/hub"), capabilities);//instantiate driver
	  wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	/* capabilities.setCapability("deviceName", "QA Team (galaxy S5)");
	    capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	    capabilities.setCapability(CapabilityType.VERSION, "6.0");
	    wd = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	  */
	
	  
  }
  @Test
  public void f () throws Exception {
	  wd.get("http://live.viddigo.com/#/video/300870?_k=jntun0");

	  
	  Thread.sleep(10000);
	  wd.findElement(By.xpath("//*[@id=\"videoPlayer\"]")).click();

	  Thread.sleep(10000);
  }

  @AfterMethod
  public void afterTest() {
	  wd.quit();
	  }
@Override
public AppiumDriver getAppiumDriver() {
	// TODO Auto-generated method stub
	return this.wd;
}

}
