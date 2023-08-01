package ecommerce.EcommerceProject.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import ecommerce.EcommerceProject.pageobjects.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test
	public void test_Login_with_valid_credential() throws IOException, InterruptedException {
		LoginPage lp = new LoginPage();
		lp.loginWithValidCredential();
	}
}
