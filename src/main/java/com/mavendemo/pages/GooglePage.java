package com.mavendemo.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
	
	@FindBy(name = "q")
	private WebElement searchBar;
	
	@FindBy(xpath = ".//*[@class='sbsb_b']/li")
	private List<WebElement> autoSuggestions;
	
	@FindBy(xpath = "//*[@id='gbwa']/div[1]/a")
	private WebElement appIcon;
	
	@FindBy(xpath = ".//li/a/span[@class='gb_3']")
	private List<WebElement> allAppIcon;
	
	public void searchIn() {
		searchBar.clear();
		searchBar.sendKeys("Selenium");
	}
	
	public void getAutoSearchInList() {
		for (WebElement webElement : autoSuggestions) {
			System.out.println("AutoSuggestion are : "+webElement.getText());
		}
	}
	
	public void clickApIcon() {
		appIcon.click();
	}
	
	public void getAllAppIcon() {
		for (WebElement webElement : allAppIcon) {
			System.out.println("AutoSuggestion are : "+webElement.getText());
		}
	}
}
