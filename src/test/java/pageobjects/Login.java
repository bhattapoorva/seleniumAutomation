package pageobjects;

import base.GenericSelenium;

public class Login extends GenericSelenium 
{
	String xpathLangLink="//a[contains(text(),'English')]";
	String idUsername = "j_username";
	String idPassword ="j_password";
	String xpathLoginButton = "//input[@value='Login']";
	
	public void clickLangLink()
	{
		super.performAction(super.identifyElement(locators.xpath, xpathLangLink), "click", null);
	}
	
	public void setUserName(String uName)
	{
		super.performAction(super.identifyElement(locators.id,idUsername), "setText", uName);
	}
	
	public void setPassword(String password)
	{
		super.performAction(super.identifyElement(locators.id,idPassword), "setText", password);
	}
	
	public void clickLogin()
	{
		super.performAction(super.identifyElement(locators.xpath, xpathLoginButton), "click", null);
	}
}
