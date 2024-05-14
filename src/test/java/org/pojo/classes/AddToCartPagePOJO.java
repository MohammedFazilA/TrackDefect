package org.pojo.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.UtilityClass;

public class AddToCartPagePOJO extends UtilityClass {
	
	public AddToCartPagePOJO() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement placeOrder;

	@FindBy(xpath="//input[@type='text']")
	private WebElement phNo;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//span[text()='Signup']")
	private WebElement signUp;
	
	@FindBy(xpath="//form//child::label[text()='Name']")
	private WebElement name;
	
	@FindBy(xpath="//form//child::label[contains(text(),'10')]")
	private WebElement contact;
	
	@FindBy(xpath="//form//child::label[text()='Pincode']")
	private WebElement pinCode;
	
	@FindBy(xpath="//form//child::label[text()='Locality']")
	private WebElement locality;
	
	@FindBy(xpath="//form//child::label[contains(text(),'Address')]")
	private WebElement address;
	
	@FindBy(xpath="//form//child::label[contains(text(),'Town')]")
	private WebElement city;
	
	@FindBy(tagName="select")
	private WebElement stateDd;
	
	@FindBy(xpath="//span[contains(text(),'All day')]")
	private WebElement selectHome;
	
	@FindBy(xpath="//button[text()='Save and Deliver Here']")
	private WebElement saveAddress;
	
	@FindBy(xpath="//div[contains(text(),'Laptop')]")
	private WebElement orderSummary;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	private WebElement sumContinue;
	
	@FindBy(xpath="//button[text()='Accept & Continue']")
	private WebElement accept;

	@FindBy(xpath="//div[@id='container']//child::a[contains(text(), 'iPhone')]")
	private WebElement productCheck;
	
	
		
	public WebElement getProductCheck() {
		return productCheck;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getLocality() {
		return locality;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getStateDd() {
		return stateDd;
	}

	public WebElement getSelectHome() {
		return selectHome;
	}

	public WebElement getSaveAddress() {
		return saveAddress;
	}

	public WebElement getOrderSummary() {
		return orderSummary;
	}

	public WebElement getSumContinue() {
		return sumContinue;
	}

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public WebElement getPhNo() {
		return phNo;
	}
	
	public WebElement getContact() {
		return contact;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getSignUp() {
		return signUp;
	}
	
	

}
