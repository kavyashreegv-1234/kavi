package com.mpokket_assesment.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Search_product {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchtext;

	public WebElement getSearchtext() {
		
		return searchtext;
	}
	 public Search_product(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//input[@type='submit']")
	 private WebElement searchbutton;

	 
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public void search_product(String product) {
		searchtext.sendKeys(product);
		searchbutton.click();
		
	}
	
	
	
}
