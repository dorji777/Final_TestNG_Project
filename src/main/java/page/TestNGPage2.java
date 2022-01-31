package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class TestNGPage2 {

	WebDriver driver;
	String categoryName="TestNG";
	
	
	@FindBy(how= How.XPATH, using = "//select[@name=\"due_month\"]" )	WebElement MONTH_DROPLIST;
	@FindBy(how= How.XPATH, using = "//input[@name=\"categorydata\"]" )	WebElement ADD_CATAGORY_ELEMENT;
	@FindBy(how= How.XPATH, using = "//input[@value=\"Add category\"]" )	WebElement ADD_CATAGORY;
	@FindBy(how = How.CSS,using = "div.controls>:nth-last-child(3)") WebElement NEW_ADD_CATAGORY;
	
	
	
//	Validate a user is not able to add a duplicated category. If it does then the following message will 
//  display: "The category you want to add already exists: <duplicated category name>."
	
	
	
	public void validateDupicateCategory() throws Exception {
		TestNGPage1 TestNG1 = PageFactory.initElements(driver, TestNGPage1.class); 
		String newEnteredCategory=NEW_ADD_CATAGORY.getText();
		ADD_CATAGORY_ELEMENT.sendKeys(newEnteredCategory);
		Thread.sleep(2000);
		ADD_CATAGORY.click();
		System.out.println("The category you want to add already exists: " + newEnteredCategory );
	
	}
	
	


	//The category you want to add already exists: <duplicated category name>.
	
	
}
