package stepdef;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pageobjects.CreateDeclaration;

public class CreateDeclarationStepDef 
{
	CreateDeclaration poCD=new CreateDeclaration();
	@Given("^Click on Declaration Menu$")
	public void click_on_Declaration_Menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		poCD.clickonDeclarationMenu();
	}

	@Given("^Click on Create Declaration$")
	public void click_on_Create_Declaration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		poCD.clickonCreateDeclarationLink();
	}
	
	@Given("^Select declaration type \"([^\"]*)\"$")
	public void select_declaration_type(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^Select Land Port$")
	public void select_Land_Port() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^Click on Save Header$")
	public void click_on_Save_Header() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
