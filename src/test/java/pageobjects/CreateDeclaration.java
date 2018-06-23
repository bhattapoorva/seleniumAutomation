package pageobjects;
import base.GenericSelenium;

public class CreateDeclaration extends GenericSelenium 
{
	String linktextDEclarationMenu="Declaration";
	String linktextCreateDeclaration="Create";
	
	public void clickonDeclarationMenu()
	{
		super.performAction(super.identifyElement(locators.linktext, linktextDEclarationMenu), "click", null);
	}
	
	public void clickonCreateDeclarationLink()
	{
		super.performAction(super.identifyElement(locators.linktext, linktextCreateDeclaration), "click", null);
	}
}
