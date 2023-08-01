package ecommerce.EcommerceProject.pageobjects;

import java.io.IOException;

public class CartPage extends BasePage {

	public void PurchasePhones() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage();
		lp.loginWithValidCredential();
		WebdriverWait("//a[@id='logout2']", 30);
		click("//div[@id='contcont']//a[2]", "Click on Phones button of product category");
		click("//a[normalize-space()='Samsung galaxy s6']", "Click on Samsung galaxy s6");
		WebdriverWait("//a[@class='btn btn-success btn-lg']", 30);
		click("//a[@class='btn btn-success btn-lg']", "Click on Add to cart button");
		Thread.sleep(10);
		getWindowAlertText();
		acceptWindowAlertText();
		click("//a[@id='cartur']", "click on the cart button from the Top Header");
		WebdriverWait("//button[normalize-space()='Place Order']", 30);
		click("//button[normalize-space()='Place Order']", "click on Place Order Button");
		WebdriverWait("//button[normalize-space()='Place Order']", 30);
		type("//input[@id='name']", "mranjan", "Enter Name on the Place order form");
		type("//input[@id='country']", "India", "Enter Country Name on the Place order form");
		type("//input[@id='city']", "Gurgaon", "Enter City Name on the Place order form");
		type("//input[@id='card']", "4242424242424242", "Enter Credit Card Number on the Place order form");
		type("//input[@id='month']", "03", "Enter Credit Card Number on the Place order form");
		type("//input[@id='year']", "2028", "Enter Year on the Place order form");
		click("//button[normalize-space()='Purchase']", "Click on purchase button on the Place order form");
		getText("// h2[normalize-space()='Thank you for your purchase!']");
		capturescreenshot();
		click("//button[normalize-space()='OK']", "click on ok button of Thank you pop up after purchase");

	}

}
