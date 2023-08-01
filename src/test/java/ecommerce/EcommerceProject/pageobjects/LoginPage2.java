package ecommerce.EcommerceProject.pageobjects;

import java.io.IOException;

public class LoginPage2 extends BasePage {

	public void loginWithValidCredential() throws IOException, InterruptedException {

		click("//a[@id='login2']", "Click on login button");
		Thread.sleep(10);
		type("//input[@id='loginusername']", "mranjan", "Enter Username");
		Thread.sleep(10);
		type("//input[@id='loginpassword']", "12345", "enter password");
		Thread.sleep(10);
		click("//button[normalize-space()='Log in']", "Click on login button on login form");
		Thread.sleep(5000);
		verifyEquals("//a[@id='nameofuser']", "Welcome mranjan");
		click("//a[@id='logout2']", "Click on log out button");
	}

}
