package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TestNGPage3;
import util.BrowserFactory;

public class TestNGTest3 {
	
	WebDriver driver;
	
	@Test
	public void validateMonthDropList() {
		
	driver = BrowserFactory.init();

    TestNGPage3 TestNG3 = PageFactory.initElements(driver, TestNGPage3.class); 
	
    TestNG3.clickDueMonth();
    TestNG3.validateMonthDropList();
    
    
	}
}
