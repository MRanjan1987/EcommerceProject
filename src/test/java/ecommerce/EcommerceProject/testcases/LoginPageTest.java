package ecommerce.EcommerceProject.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import ecommerce.EcommerceProject.pageobjects.LoginPage1;

public class LoginPageTest extends BaseTest {

	@Test
	public void test_Login_with_valid_credential() throws IOException, InterruptedException {
		driver.get(BaseTest.prop.getProperty("url"));
		LoginPage1 lp = new LoginPage1();
		lp.loginWithValidCredential();
	}
}
