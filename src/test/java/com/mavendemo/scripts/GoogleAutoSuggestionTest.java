package com.mavendemo.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mavendemo.pages.GooglePage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class GoogleAutoSuggestionTest {
  @Test
  public void googleTest() {
	  
	  ChromeDriverManager.getInstance().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  GooglePage ggPage = PageFactory.initElements(driver, GooglePage.class);
	  
	  ggPage.searchIn();
	  ggPage.getAutoSearchInList();
	  
	  driver.close();
  }
}
