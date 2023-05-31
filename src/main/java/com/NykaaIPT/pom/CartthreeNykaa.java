package com.NykaaIPT.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class CartthreeNykaa extends BaseClass {
	public CartthreeNykaa(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//select[@title='SIZE']")
	private WebElement dropdown;
	
	
	@FindBy(xpath = "//option[text()='200g']")
	private WebElement selectg;
	
	@FindBy(xpath = "(//button[@class=' css-13zjqg6'])[1]")
	private WebElement addtobag;
			
	@FindBy(xpath = "//button[@class='css-aesrxy']")
	private WebElement cart;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/iframe")
	private WebElement frame1;
	
	@FindBy(xpath = "//p[text()='Quantity : 1']")
	private WebElement quantity;
		
	@FindBy(xpath = "(//div[@class='css-m37lhi'])[3]")
	private WebElement quantityc;
	
	@FindBy(xpath = "//div[@class='css-ltzjhp e25lf6d7']")
	private WebElement proceed;
	
	@FindBy(xpath = "//button[@class='css-v61n2j e8tshxd0']")
	private WebElement login;
	
	@FindBy(xpath = "//span[@class='new-login-button new-login-button--google']")
	private WebElement google;
	
	@FindBy(xpath = "//input[@autocapitalize='none']")
	private WebElement gmail;
	
	@FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")
	private WebElement Nextbutton;
	
	@FindBy(xpath = "//input[@autocomplete='current-password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@color='#ffffff']")
	private WebElement deliverb;
	
	@FindBy(xpath = "(//div[@class='css-1qlrij7 e87w9870'])[2]")
	private WebElement upi;
	
	@FindBy(xpath = "(//div[@class='css-wk0uhf e1igvbv81'])[4]")
	private WebElement otherupi;
	
	@FindBy(xpath = "//input[@placeholder='Enter UPI ID']")
	private WebElement uppiidenter;
	
	@FindBy(xpath = "//button[@class='css-v61n2j e8tshxd0']")
	private WebElement buttonpay;
	
	
	@FindBy(xpath = "//button[@class='css-1iwzqhf emgaj5l0']")
	private WebElement closeb;
	
	@FindBy(xpath = "(//p[@class='css-rxufl7 eoygcm00'])[1]")
	private WebElement bagc;
	
	@FindBy(xpath = "//p[@class='css-z7wmhp eka6zu20']")
	private WebElement editc;
	
	@FindBy(xpath = "//div[@class='css-1l5d7z5 e1whhlt1']")
	private WebElement deletec;
	
	@FindBy(xpath = "//button[text()='Remove']")
	private WebElement remove;

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getSelectg() {
		return selectg;
	}

	public WebElement getAddtobag() {
		return addtobag;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFrame1() {
		return frame1;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getQuantityc() {
		return quantityc;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getGoogle() {
		return google;
	}

	public WebElement getGmail() {
		return gmail;
	}

	public WebElement getNextbutton() {
		return Nextbutton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDeliverb() {
		return deliverb;
	}

	public WebElement getUpi() {
		return upi;
	}

	public WebElement getOtherupi() {
		return otherupi;
	}

	public WebElement getUppiidenter() {
		return uppiidenter;
	}

	public WebElement getButtonpay() {
		return buttonpay;
	}

	public WebElement getCloseb() {
		return closeb;
	}

	public WebElement getBagc() {
		return bagc;
	}

	public WebElement getEditc() {
		return editc;
	}

	public WebElement getDeletec() {
		return deletec;
	}

	public WebElement getRemove() {
		return remove;
	}
	

}
