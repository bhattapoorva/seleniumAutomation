package pageobjects;
import org.openqa.selenium.By;

import base.GenericSelenium;

public class CreateDeclaration extends GenericSelenium 
{
	String linktextDEclarationMenu="Declaration";
	String linktextCreateDeclaration="Create";
	String idDeclarationType="declarationCreateForm:selectDeclareType";
	String idPort="declarationCreateForm:selectPorOfEntryWFreezone";
	String xpathSave="//input[@value=' Save ']";
	
	public void clickonDeclarationMenu()
	{
		super.performAction(super.identifyElement(locators.linktext, linktextDEclarationMenu), "click", null);
	}
	
	public void clickonCreateDeclarationLink()
	{
		super.performAction(super.identifyElement(locators.linktext, linktextCreateDeclaration), "click", null);
	}
	
	public void selectDeclarationType()
	{
		String xl_DeclType=super.readExcel("import_Decl_Type");
		super.performAction(super.identifyElement(locators.id, idDeclarationType), "selectbyvisibletext", xl_DeclType);
	}
	
	public void selectPortType()
	{
		super.explicitWait(By.id(idPort));
		String xl_PortName=super.readExcel("land_Port_Discharge");
		super.performAction(super.identifyElement(locators.id, idPort), "selectbyvisibletext", xl_PortName);
	}
	
	public void saveHeader()
	{
		super.performAction(super.identifyElement(locators.xpath,xpathSave),"click",null);
	}
	
	//=============Code For Party Tab
	String idPartyTab="declarationViewForm:partyTab_lbl";
	String idSearchImpExpButton="declarationViewForm:importerBtn";
	
}
