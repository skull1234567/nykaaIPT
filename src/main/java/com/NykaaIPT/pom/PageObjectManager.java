package com.NykaaIPT.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class PageObjectManager extends BaseClass {
	public PageObjectManager(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	private homepagenykaa hp;
	
	private Himalayababynykaa hb;
	
	private CartthreeNykaa ct;

	public homepagenykaa getHp() {
		hp = new homepagenykaa(driver);
		return hp;
	}

	public Himalayababynykaa getHb() {
		hb = new Himalayababynykaa(driver);
		return hb;
	}

	public CartthreeNykaa getCt() {
		ct = new CartthreeNykaa(driver);
		return ct;
	}

}
