package ecommerce.EcommerceProject.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import ecommerce.EcommerceProject.pageobjects.LoginPage1;

public class CartPageTest extends BaseTest {

	@Test
	public void PurchasePhonesTest() throws IOException, InterruptedException {

		LoginPage1 lp = new LoginPage1();
		lp.loginWithValidCredential().PurchasePhones();
	}
}
