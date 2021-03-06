package stepdef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pageobjects.Login;

public class LoginStepDef 
{
	Login poHP=new Login();
	
	@Given("^Launch application  with \"([^\"]*)\" browser$")
	public void launch_application_with_browser(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String url=poHP.readExcel("ext_Prod_URL");
		poHP.launchApplication(arg1, url);
	}
	
	/*@Given("^Click on English Link$")
	public void click_on_English_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    poHP.clickLangLink();
	}*/

	@Given("^Enter Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void enter_Username_and_Password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  poHP.setUserName(arg1);
	  poHP.setPassword(arg2);
	}

	@Given("^Click on Login$")
	public void click_on_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    poHP.clickLogin();
	}
	
	@After
	public void closeAppAndTakeScreenShot(Scenario name)
	{
		//poHP.takeScreenShot(name.getName());
		//poHP.closeApplication();
	}
	    
}
