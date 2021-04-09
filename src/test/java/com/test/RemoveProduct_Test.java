package com.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mpokket_assesment.genericutility.BaseClass;
import com.mpokket_assesment.objectrepository.AddToCart;
import com.mpokket_assesment.objectrepository.Search_product;
import com.mpokket_assesment.objectrepository.ShoppingCart;

public class RemoveProduct_Test extends BaseClass {
	@Test
	public void search() throws Throwable {
		
		Search_product s=new Search_product(driver);
		s.getSearchbutton().click();
		AddToCart a=new AddToCart(driver);
		a.getXioamilink().click();
		a.getAddtocartbtn().click();
		a.getAddtocartimg().click();
		ShoppingCart s1=new ShoppingCart();
		s1.getShoppingcart().click();
		WebElement b = s1.getQuantity();
		b.click();
		b.sendKeys("10");
		s1.getQuantity().click();
		s1.getDel().click();
	}}
