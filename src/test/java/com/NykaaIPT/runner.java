package com.NykaaIPT;

import java.awt.AWTException;
import java.io.IOException;

import com.NykaaIPT.base.BaseClass;
import com.NykaaIPT.pom.PageObjectManager;

public class runner extends BaseClass {
	public static void main(String[] args) throws Exception {
		PageObjectManager pom = new PageObjectManager(driver);
		Browselaunch("https://www.nykaa.com/");
		Thread.sleep(2000);
		Mouseactionmovetoelement(pom.getHp().getMombaby());
		jsexecutorclick(pom.getHp().getBabypowder());
		windowswitch(1);
		executeJavaScript("window.scrollBy(0,500);");
		Mouseactionclick(pom.getHb().getBabypowderclick());
		windowswitch(2);
		dropddownn(pom.getCt().getDropdown(), "index", "1");
		jsexecutorclick(pom.getCt().getAddtobag());
		clickonelement(pom.getCt().getCart());
		
		Thread.sleep(2000);
		elementss(pom.getCt().getFrame1());
		jsexecutorclick(pom.getCt().getQuantity());
		Mouseactionclick(pom.getCt().getQuantityc());
		clickonelement(pom.getCt().getProceed());
		Thread.sleep(5000);
		clickonelement(pom.getCt().getLogin());
		Mouseactionclick(pom.getCt().getGoogle());
		jsSendkeys("naveenr28706@gmail.com", pom.getCt().getGmail());
		clickonelement(pom.getCt().getNextbutton());
		Thread.sleep(2000);
		jsSendkeys("Naveen@1234567890", pom.getCt().getPassword());
		Robott();
		implicittwait();
		Mouseactionclick(pom.getCt().getDeliverb());
		Thread.sleep(4000);
		clickonelement(pom.getCt().getUpi());
		clickonelement(pom.getCt().getOtherupi());
		sendkeyyss(pom.getCt().getUppiidenter(), "anything@payu");
		Thread.sleep(2000);
		clickonelement(pom.getCt().getButtonpay());
		Thread.sleep(6000);
		screensshott("errorpayment");
		Thread.sleep(6000);
		clickonelement(pom.getCt().getCloseb());
		clickonelement(pom.getCt().getBagc());
		clickonelement(pom.getCt().getEditc());
		clickonelement(pom.getCt().getDeletec());
		Thread.sleep(2000);
		clickonelement(pom.getCt().getRemove());
		Thread.sleep(2000);
		driver.quit();
		
	
		
		
	}

}
