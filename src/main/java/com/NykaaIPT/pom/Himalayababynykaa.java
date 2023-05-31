package com.NykaaIPT.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class Himalayababynykaa extends BaseClass {
	public Himalayababynykaa(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//img[@class='css-11gn9r6'])[1]")
	private WebElement babypowderclick;

	public WebElement getBabypowderclick() {
		return babypowderclick;
	}
	
	
	
	
}
