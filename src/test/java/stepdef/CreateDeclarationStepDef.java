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
	
	@Given("^Select declaration type$")
	public void select_declaration_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		poCD.selectDeclarationType();
		
	}

	@Given("^Select Land Port$")
	public void select_Land_Port() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		poCD.selectPortType();
	}

	@Given("^Click on Save Header$")
	public void click_on_Save_Header() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    poCD.saveHeader();
	}
	//=============Code For Party Tab
	@Given("^Click on Party Tab$")
	public void click_on_Party_Tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^Click on Search of Importer/Exporter$")
	public void click_on_Search_of_Importer_Exporter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Given("^Enter Custome Code$")
	public void enter_Custome_Code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^Click on Search of Popup$")
	public void click_on_Search_of_Popup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^click on item came in Search$")
	public void click_on_item_came_in_Search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^Enter Exporter Name$")
	public void enter_Exporter_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^Click on save of Party Tab$")
	public void click_on_save_of_Party_Tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	
}
