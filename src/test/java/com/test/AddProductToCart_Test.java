package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mpokket_assesment.genericutility.BaseClass;
import com.mpokket_assesment.objectrepository.AddToCart;
import com.mpokket_assesment.objectrepository.Search_product;

public class AddProductToCart_Test extends BaseClass {
		@Test
		public void search() throws Throwable {
			String exp="Xiaomi Redmi Note 9 Pro Smartphone - 6.67\" DotDisplay,6 GB + 128 GB, 64 MP AI Quad Camera, 5020 mAh (type) NFC, Grigio (Interstellar Grey)";
			Search_product s=new Search_product(driver);
			s.getSearchbutton().click();
			AddToCart a=new AddToCart(driver);
			a.getXioamilink().click();
			a.getAddtocartbtn().click();
			a.getAddtocartimg().click();
			Assert.assertEquals("Xiaomi Redmi Note 9 Pro Smartphone - 6.67\" DotDisplay,6 GB + 128 GB, 64 MP AI Quad Camera, 5020 mAh (type) NFC, Grigio (Interstellar Grey)", exp);
			
			

}}
