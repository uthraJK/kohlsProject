package Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;
import junit.framework.Assert;

public class HomePageObj extends BasePage{

HomePageObj hp;
	
	public HomePageObj()
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath ="//*[@id=\"search\"]")
private WebElement searchTextBox;


public void clicksearchTextBox()
{
	searchTextBox.click();
}

public void enterProductSearchTextBox(String name)
{
	searchTextBox.sendKeys(name);
}

@FindBy(xpath ="//*[@id=\"site-search\"]/fieldset/input[1]")
private WebElement searchIcon;

public void clickSearchIcon()
{
searchIcon.click();	
}
@FindBy(xpath = "//*[contains(@class,'result_count')]")
private WebElement countofSearchResults;

public void displaycountofSearchResults()
{
System.out.println(hp.getText(countofSearchResults));
}
@FindBy(xpath = "//*[@id=\"kohls_logo\"]/a/svg")
private WebElement kohlsIcon;
public void navigateToHomePage()
{
	kohlsIcon.click();	
}
@FindBy(xpath ="//a[@class=\"kohls-charge-link menu-icons-bar\"]//p//span")	
private WebElement shopByDepartment;
public void clickshopByDepartment()
{
shopByDepartment.click();
}	
@FindBy(xpath = "//*[@id=\"navigation\"]/li[8]/h2/a")
private WebElement shopByDepartmentMen;
public void selectShopByDepartmentMen()
{
	
	shopByDepartmentMen.click();
	
}
@FindBy(xpath = "//*[@id=\"navigation\"]/li[4]/h2/a")
private WebElement shopByDepartmentWomen;
public void selectShopByDepartmentWomen()
{
	
	shopByDepartmentWomen.click();
	
}
@FindBy(xpath = "//*[@id=\"navigation\"]/li[9]/h2/a")
private WebElement shopByDepartmentKids;
public void selectShopByDepartmentKids()
{
	
	shopByDepartmentKids.click();
	
}
@FindBy(xpath = "//*[@id=\"navigation\"]/li[10]/h2/a")
private WebElement shopByDepartmentBaby;
public void selectShopByDepartmentBaby()
{
	
	shopByDepartmentBaby.click();
	
}
@FindBy(xpath = "//*[@id=\"navigation\"]/li[11]/h2/a")
private WebElement shopByDepartmentToys;
public void selectShopByDepartmentToys()
{
	//hp.ActionsElement(shopByDepartmentMen);
	shopByDepartmentToys.click();
	
}

}
