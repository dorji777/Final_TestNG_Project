package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TestNGPage1;
import util.BrowserFactory;

public class TesNGTest1 {
	
	WebDriver driver;
	/*
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\TF_TestData.xlsx");
	String username = exlread.getCellData("LoginInfo", "UserName", 2);
	String password = exlread.getCellData("LoginInfo", "Password", 2);
	*/
	
	@Test
	public void validUserShouldBeAbleToLogin() throws Exception {
		
		driver = BrowserFactory.init();
				//object variable
		TestNGPage1 TestNG = PageFactory.initElements(driver, TestNGPage1.class); 

//		Validate a user is able to add a category and once the category is added it should display.
		TestNG.addCategory();
		TestNG.clickOnAddCategory();
		
		
		/*Validate a user is not able to add a duplicated category. If it does 
		then the following message will display: "The category you want to add already exists: <duplicated category name>."*/		


		
		
		
//		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
//		dashboardPage.verifyDashboardPage();

		
	//	BrowserFactory.tearDown();
		
	}

}
