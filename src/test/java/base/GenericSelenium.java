package base;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class GenericSelenium extends GenericCommon 
{
	static WebDriver driver;
	WebElement element;
	protected enum locators{id,name,linktext,partiallinktext,tagname,css,xpath,className};
	public void launchApplication(String browserName,String url)
	{
		//it will launch brower and open url
		
		String utilPath;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			utilPath="\\src\\test\\java\\utils\\chromedriver.exe";
			utilPath = this.getAndConcatCurrentPath(utilPath);
			System.setProperty("webdriver.chrome.driver",utilPath);
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			utilPath="\\src\\test\\java\\utils\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",utilPath);
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			utilPath="\\src\\test\\java\\utils\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",utilPath);
			driver=new InternetExplorerDriver();
		}
		else
		{
			//for incorrect parameter
			assert(false);
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	public void closeApplication()
	{
		driver.close();
	}
	
	public void takeScreenShot(String fileName)
	{
		TakesScreenshot tShot;
		tShot=(TakesScreenshot) driver;
		File srcFile=tShot.getScreenshotAs(OutputType.FILE);
		String targetPath=this.getAndConcatCurrentPath("\\target\\screenshots");
		File destFile=new File(targetPath+"\\"+fileName+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public WebElement identifyElement(locators type,String address)
	{
		switch(type)
		{
			case id:return driver.findElement(By.id(address));
			case name:return driver.findElement(By.name(address));
			case linktext:return driver.findElement(By.linkText(address));
			case partiallinktext:return driver.findElement(By.partialLinkText(address));
			case tagname:return driver.findElement(By.tagName(address));
			case css:return driver.findElement(By.cssSelector(address));
			case xpath:return driver.findElement(By.xpath(address));
			case className:return driver.findElement(By.className(address));
			
		}
		return null;
	
	}
	
	public List<WebElement> identifyElements(locators type,String address)
	{
		switch(type)
		{
			case id:return driver.findElements(By.id(address));
			case name:return driver.findElements(By.name(address));
			case linktext:return driver.findElements(By.linkText(address));
			case partiallinktext:return driver.findElements(By.partialLinkText(address));
			case tagname:return driver.findElements(By.tagName(address));
			case css:return driver.findElements(By.cssSelector(address));
			case xpath:return driver.findElements(By.xpath(address));
			case className:return driver.findElements(By.className(address));
			
		}
		return null;
		
	}
	
	public String performAction(WebElement element,String type,String value)
	{
		String returnValue=null;
		//perform required actions on present controls 
		if(type.equalsIgnoreCase("click"))
		{
			element.click();
		}
		else if(type.equalsIgnoreCase("setText"))
		{
			element.sendKeys(value);
		}
		else if(type.equalsIgnoreCase("getText"))
		{
			returnValue=element.getText();
		}
		else if(type.equalsIgnoreCase("getTitle"))
		{
			returnValue=driver.getTitle();
		}
		return returnValue;
	}
}
