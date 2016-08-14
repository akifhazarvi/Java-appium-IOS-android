package com.learn.mobile.browser;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import junit.framework.Assert;
import org.testng.annotations.BeforeTest;
import java.util.List;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class Brokenlinktest {
 public WebDriver wd ;
 private int invalidLinksCount;

@Test
 public void testSearchPage() throws InterruptedException {
	wd.get("http://live.viddigo.com");
	
	try {
		invalidLinksCount = 0;
		List <WebElement> anchorTagsList = wd.findElements(By.tagName("a"));
		System.out.println("Total no. of links are "
				+ anchorTagsList.size());
		for (WebElement anchorTagElement : anchorTagsList) {
			System.out.println(anchorTagElement.getAttribute("outerHTML"));
			if (anchorTagElement != null) {
				String url = anchorTagElement.getAttribute("href");
				System.out.println(url);
				if (url != null && !url.contains("javascript")) {
					verifyURLStatus(url);
				} else {
					invalidLinksCount++;
				}
			}
		}

		System.out.println("Total no. of invalid links are "
				+ invalidLinksCount);

	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
  
 
  
 
 }
 @BeforeTest
 public void beforeTest() throws MalformedURLException { //set capabilities required
  DesiredCapabilities capabilities = new DesiredCapabilities();
  capabilities.setCapability("deviceName", "iPhone 6");
  capabilities.setCapability("platformName", "iOS");
  capabilities.setCapability("platformVersion", "9.3"); 
  capabilities.setCapability("BROWSER_NAME", "safari");
  wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//instantiate driver
  //wd.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
 }

 @AfterTest
 public void afterTest() {
  //wd.close();
 }
 public void verifyURLStatus(String URL) {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URL);
		try {
			org.apache.http.HttpResponse response = client.execute(request);
			// verifying response code and The HttpStatus should be 200 if not  ,
			// increment invalid link count
			////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
			if (response.getStatusLine().getStatusCode() != 200)
				{
				invalidLinksCount++;
				System.out.println(URL);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}