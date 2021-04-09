package com.mpokket_assesment.test;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.mpokket_assesment.genericutility.BaseClass;
import com.mpokket_assesment.objectrepository.AddToCart;
import com.mpokket_assesment.objectrepository.Products;
import com.mpokket_assesment.objectrepository.Search_product;

public class SearchProduct_verify_Test extends BaseClass {
	@Test
	public void search() throws Throwable {
		String ExpData="Xiaomi Redmi Note 9 Pro";
		Search_product s=new Search_product(driver);
		s.search_product(ExpData);
		Products p=new Products(driver);
		List<WebElement> list = p.getProducts();
		for(WebElement x:list) {
			//System.out.println(x.getText());
		}
		
		list.get(3).click();
		Set<String> handls = driver.getWindowHandles();
		for(String t:handls) {
			driver.switchTo().window(t);
		}
		
		AddToCart add=new AddToCart(driver);
		add.getProductAddtoCart().click();
		add.getCartBtb().click();
		String price=add.getAmount().getText();
		System.out.println(price);
		add.getQuantitybtn().click();
		add.getQuntity8().click();
		String newPrice=add.getAmount().getText();
		System.out.println(newPrice);
		Assert.assertFalse(price.equals(newPrice));
		}
}
