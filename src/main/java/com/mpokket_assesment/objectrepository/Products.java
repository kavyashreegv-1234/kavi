package com.mpokket_assesment.objectrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
	@FindBy(xpath="//span[contains(text(),'Redmi')]")
	private WebElement product;
	
	@FindBy(xpath="//span[contains(text(),'Redmi')]")
	private List<WebElement> products;
	
	public Products(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getProduct() {
		return product;
	}


	public List<WebElement> getProducts() {
		return products;
	}


	public void getAllItems() {
		for(WebElement x:products) {
			x.getText();
		}
	}
}
