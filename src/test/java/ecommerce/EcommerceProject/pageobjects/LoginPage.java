package ecommerce.EcommerceProject.pageobjects;

import java.io.IOException;

import ecommerce.EcommerceProject.testcases.BaseTest;

public class LoginPage extends BasePage {

	public void loginWithValidCredential() throws IOException, InterruptedException {
		driver.get(BaseTest.prop.getProperty("url"));
		click("//a[@id='login2']", "Click on login button");
		type("//input[@id='loginusername']", "mranjan", "Enter Username");
		type("//input[@id='loginpassword']", "12345", "enter password");
		click("//button[normalize-space()='Log in']", "Click on login button on login form");
		Thread.sleep(5000);
		verifyEquals("//a[@id='nameofuser']", "Welcome mranjan");
	}
}
