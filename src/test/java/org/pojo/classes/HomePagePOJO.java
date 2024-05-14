package org.pojo.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.UtilityClass;

public class HomePagePOJO extends UtilityClass {
	
	public HomePagePOJO() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")
	private WebElement searchBox;


	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
	

}
