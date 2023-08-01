package ecommerce.EcommerceProject.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import ecommerce.EcommerceProject.pageobjects.CartPage;

public class CartPageTest extends BaseTest {

	@Test
	public void PurchasePhonesTest() throws IOException, InterruptedException {

		CartPage cp = new CartPage();
		cp.PurchasePhones();
	}
}
