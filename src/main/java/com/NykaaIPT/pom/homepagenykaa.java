package com.NykaaIPT.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class homepagenykaa extends BaseClass {
	public homepagenykaa(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//li[@class='MegaDropdownHeadingbox']//child::a[@href='https://www.nykaa.com/sp/mom-and-baby-native/mom-and-baby']")
	private WebElement mombaby;
	
	@FindBy(xpath = "//a[text()='Baby Powder']")
	private WebElement babypowder;

	public WebElement getMombaby() {
		return mombaby;
	}

	public WebElement getBabypowder() {
		return babypowder;
	}
}
