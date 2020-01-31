package Utility;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
	
	public static WebDriver driver;
	public String browser ="chrome";
//	public ExtentReports extent;
//	public static ExtentTest scenarioDef;
//	public static ExtentTest features;
//	public static String reportLocation ="C:\\Users\\Balajee\\eclipse-workspace\\com.Kohls\\Reporting";

	
	
public BasePage() {
	
	if(driver==null)
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.kohls.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
}
public boolean ElementFound(WebElement element)
{
	boolean res = false;
	try
	{
	res = element.isDisplayed();
	
}
catch(Exception e)
	{
	e.printStackTrace();
	}
	return res;
}
public String selectFromDropdown(String option,WebElement element)
{
	Select se = new Select(element);
	se.selectByValue(option);
	String selectedValue = se.getFirstSelectedOption().getText();
	return selectedValue;
	
}
public String selectFromDropdownVisibleText(WebElement element, String option)
{
	Select select = new Select(element);
	select.selectByVisibleText(option);
	return select.getFirstSelectedOption().getText();
}
public String getAttribute(WebElement element )
{
return element.getAttribute("value");
}


public void setText(WebElement element,String name)
{
	if(name!=null)
	{
		element.click();
		element.clear();
		element.sendKeys(name);
	}
}
public String getText(WebElement element)
{
	return element.getText();
}
public String getTitle()
{
	return driver.getTitle();
}

public void ActionsElement(WebElement element)
{
Actions ac = new Actions(driver);
ac.moveToElement(element).click().build().perform();
}
public boolean isElementVisible(WebElement element)
{
	boolean res= false;
	try
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(element));
		res = true;
		return res;
		
	}
	catch(Exception e)
	{
	e.printStackTrace();
	
	}
	return res;
	}



public void screenShot(String name) throws Exception 
{
	TakesScreenshot snap = (TakesScreenshot) driver;
	FileHandler.copy(snap.getScreenshotAs(OutputType.FILE), new File("" +name+".png"));
}

}


