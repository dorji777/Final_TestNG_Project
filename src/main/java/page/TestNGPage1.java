package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestNGPage1 {

	WebDriver driver;
	String categoryName="TestNG";
	String duplicateCategory = (categoryName + randomNumber(999));
	
	
	@FindBy(how= How.XPATH, using = "//input[@name=\"categorydata\"]" )	WebElement ADD_CATAGORY_ELEMENT;
	@FindBy(how= How.XPATH, using = "//input[@value=\"Add category\"]" )	WebElement ADD_CATAGORY;
//	@FindBy(how= How.XPATH, using = "div.controls>:nth-last-child(3)")	WebElement NEW_ADD_CATAGORY;
	@FindBy(how = How.CSS,using = "div.controls>:nth-last-child(3)") WebElement NEW_ADD_CATAGORY;
	
	
	
	public int randomNumber(int No) {
		Random rnd= new Random();
		int rndNo = rnd.nextInt(No);
		return rndNo;

	}
	
	public void addCategory() throws Exception {
		ADD_CATAGORY_ELEMENT.sendKeys(categoryName + randomNumber(999) );
		Thread.sleep(2000);
	}
	
	public void clickOnAddCategory() {
		ADD_CATAGORY.click();
		String newEnteredCategory=NEW_ADD_CATAGORY.getText();
		System.out.println(newEnteredCategory);
		
	}
}
