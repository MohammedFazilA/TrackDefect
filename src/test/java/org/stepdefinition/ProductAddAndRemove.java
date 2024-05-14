package org.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.pojo.classes.AddToCartPagePOJO;
import org.pojo.classes.HomePagePOJO;
import org.pojo.classes.ProductPOJO;
import org.reusable.UtilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductAddAndRemove extends UtilityClass{
	
	HomePagePOJO h;
	ProductPOJO p;
	AddToCartPagePOJO a;
	
	@Given("User has to launch the browser and flipkart application")
	public void user_has_to_launch_the_browser_and_flipkart_application() {

		launchBrowser("Edge");
		launchUrl("https://www.flipkart.com/");
		implitWait();
	}

	@When("User has to search the product through search box")
	public void user_has_to_search_the_product_through_search_box() throws AWTException {

		h = new HomePagePOJO();
		passTextToTextBox(h.getSearchBox(), "iphone");
		pressEnter(); 
	}

	@When("User has to select and adding product into cart")
	public void user_has_to_select_and_adding_product_into_cart() {
	    
		p = new ProductPOJO();
		driver.navigate().refresh();
		clickWebElement(p.getProduct());
		switchToAnotherWindow(1);
		driver.navigate().refresh();
		clickWebElement(p.getAddToCart());	
	}

	@When("User has to place order and login to the application")
	public void user_has_to_place_order_and_login_to_the_application() throws AWTException, InterruptedException {
	    
		pageDown();
		a = new AddToCartPagePOJO();
		Assert.assertTrue("Wrong Product Added Into Card", a.getProductCheck().getText().contains("iPhone"));
		clickWebElement(a.getPlaceOrder());
		passTextToTextBox(a.getPhNo(), "8925775089");
		clickWebElement(a.getContinueBtn());
		
		// If i attempt multiple times login it shows error message - "Something's not right. Please try again."
		
		// Thread.sleep(10000);
		// clickWebElement(a.getSignUp());
	}

	@When("User has to selecting address and payment option")
	public void user_has_to_selecting_address_and_payment_option() {
	   
//		passTextUsingJs(a.getName(), "Mohammed");
//		passTextUsingJs(a.getPhNo(), "892575089");
//		passTextUsingJs(a.getPinCode(), "600100");
//		passTextUsingJs(a.getLocality(), "Indian");
//		passTextUsingJs(a.getAddress(), "Pallikaranai, Near Velachery");
//		passTextUsingJs(a.getCity(), "Chennai");
//		selectState(a.getStateDd(), "Tamil Nadu");
//		clickWebElement(a.getSelectHome());
//		clickWebElement(a.getSaveAddress());
	}

	@When("User has to remove the product from the cart")
	public void user_has_to_remove_the_product_from_the_cart() {
	    
		
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() throws InterruptedException {
	    
		Thread.sleep(5000);
		closeBrowser();
	}

}
