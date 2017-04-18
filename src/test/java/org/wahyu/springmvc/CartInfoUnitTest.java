package org.wahyu.springmvc;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.wahyu.springmvc.model.CartInfo;
import org.wahyu.springmvc.model.CartLineInfo;
import org.wahyu.springmvc.model.CustomerInfo;
import org.wahyu.springmvc.model.ProductInfo;

public class CartInfoUnitTest {

	@Test
	public void test() {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setPrice(100);
		
		CartLineInfo cartLineInfo = new CartLineInfo();
		cartLineInfo.setProductInfo(productInfo);
		cartLineInfo.setQuantity(10);
		
		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setType("E");
		customerInfo.setJoinDate(new Date());
		
		CartInfo cartInfo = new CartInfo();
		cartInfo.addCartLine(cartLineInfo);
		cartInfo.setCustomerInfo(customerInfo);
		
		double discount = cartInfo.getDiscount();

		
		assertEquals(discount, 350, 0);
	    
	}

}

