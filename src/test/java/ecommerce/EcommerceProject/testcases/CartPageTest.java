package ecommerce.EcommerceProject.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import ecommerce.EcommerceProject.pageobjects.LoginPage;

public class CartPageTest extends BaseTest {

	@Test
	public void PurchasePhonesTest() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage();
		lp.loginWithValidCredential().PurchasePhones();
	}
}
