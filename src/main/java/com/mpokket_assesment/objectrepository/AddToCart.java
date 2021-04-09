package com.mpokket_assesment.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	@FindBy(xpath="(//a[@class='a-link-normal a-text-normal'])[1])")
	private WebElement xioamilink;

	public WebElement getXioamilink() {
		return xioamilink;
	}

   public AddToCart(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//input[@aria-labelledby=\"comparison_add_to_cart_button-announce\"]")
		private WebElement addtocartbtn;

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}
	@FindBy(xpath="//span[@id='nav-cart-count']")
	private WebElement addtocartimg;

	public WebElement getAddtocartimg() {
		return addtocartimg;
	}
	
	@FindBy(id="add-to-cart-button")
	private WebElement productAddtoCart;

	public WebElement getProductAddtoCart() {
		return productAddtoCart;
	}
	
	@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
	private WebElement cartBtb;

	public WebElement getCartBtb() {
		return cartBtb;
	}
	
	@FindBy(xpath="//span[@data-a-class='quantity']")
	private WebElement quantitybtn;
	
	@FindBy(xpath="aria-labelledby")
	private WebElement quntity8;

	public WebElement getQuantitybtn() {
		return quantitybtn;
	}

	public WebElement getQuntity8() {
		return quntity8;
	}
	@FindBy(xpath="//span[@id='sc-subtotal-amount-activecart']")
	private WebElement amount;

	public WebElement getAmount() {
		return amount;
	}

	

}
