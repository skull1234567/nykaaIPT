package com.NykaaIPT.base;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseClass {
	
	public static WebDriver driver;
	static String urlll;
	static JavascriptExecutor js;
	static Actions a;
	static Robot r;
	public static void Browselaunch(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get(url);
	}
	public static void clickonelement(WebElement element) {
		if(element.isDisplayed()) {
			element.click();
		}
	}
	public static void sendkeyyss(WebElement element ,String value) {
		if(element.isDisplayed()) {
			element.sendKeys(value);
		}
	}
	
	public static void screensshott(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\navee\\eclipse-workspace\\NykaaIPT\\screenshots\\"+filename+".png");
		FileHandler.copy(src, dest);
	}
	
	
	public static void dropddownn(WebElement element,String option,String value) {
		Select s = new Select(element);
		if(option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
		else if(option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}
	
	}
	
	public static void jsSendkeys(String txtbox, WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + txtbox + "')", target);
	}
	
	public static void jsexecutorclick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	public static void executeJavaScript(String scriptToExecute) {
		 js = (JavascriptExecutor) driver;
		js.executeScript(scriptToExecute);
	}
	public static void Mouseactionclick(WebElement element) {
		a = new Actions(driver);
		a.click(element).build().perform();
	}
	
	public static void Mouseactioncontextclick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	
	public static void Mouseactionmovetoelement(WebElement element) {
		a = new Actions(driver);

		a.moveToElement(element).build().perform();
	}
	
	public static void Mouseactiondraganddrop(WebElement element,WebElement element1) {
		a = new Actions(driver);
		a.dragAndDrop(element, element1).build().perform();
			
	}
	
	public static void Mouseactiondoubleclick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	
	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}
	public static void confirmalert(String option) {
		if(option.equals("accept")) {
			driver.switchTo().alert().accept();
		}
		else if(option.equals("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}
	
	public static void promptalert(String input,String option) {
		Alert alert =driver.switchTo().alert();
		alert.sendKeys(input);
		if(option.equals("accept")) {
			alert.accept();
		}
		else if(option.equals("dismiss")) {
			alert.dismiss();
		}
	}
	
	public static void implicittwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void explicittwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void windowswitch(int index) {
	Set <String> tabidset =	driver.getWindowHandles();
	List <String> id_list = new LinkedList<>(tabidset);
	String string = id_list.get(index);
	driver.switchTo().window(string);
	}
	
	public static void frameindex(int index) {
		driver.switchTo().frame(index);
	}
	public static void frameidorname(String value) {
		driver.switchTo().frame(value);
	}
	public static void elementss(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void Robott() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


