package com.mpokket_assesment.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	private WebElement shoppingcart;

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	 public void search_productTest(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//a[.='10+']")
		private WebElement quantity;

		public WebElement getQuantity() {
			return quantity;
		}
		
	
      @FindBy(xpath="(//a[@role='button'])[2]")
	  private WebElement update;

	   public WebElement getUpdate() {
		return update;
		}
	   @FindBy(xpath="//input[@value='Delete']")
		  private WebElement del;

		   public WebElement getDel() {
			return del;
			}

	 
}

