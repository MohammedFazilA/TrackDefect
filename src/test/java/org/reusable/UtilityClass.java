package org.reusable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class UtilityClass {
	
	public static WebDriver driver;
	public static Robot r;
	
	public static void launchBrowser(String browserName) {

		switch (browserName) {
		case "Chrome":
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "Edge":
		
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

		case "Flipkart":
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		}
	}
	
	public static void launchUrl(String url) {

		driver.get(url);
	}
	
	public static void implitWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void passTextToTextBox(WebElement element, String testData) {

		element.sendKeys(testData);
	}
	
	public static void clickWebElement(WebElement element) {

		element.click();
	}
	
	public static void pressEnter() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void switchToAnotherWindow(int windowNumber) {

		Set<String> allWin = driver.getWindowHandles();
		
		List<String> l = new LinkedList<>();
		l.addAll(allWin);
		
		driver.switchTo().window(l.get(windowNumber));
		
	}
	
	public static void pageDown() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	
	public static void passTextUsingJs(WebElement element, String testData) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', '"+ testData +"')", element);
	}
	
	public static void selectState(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void closeBrowser() {

		driver.quit();
	}
}
