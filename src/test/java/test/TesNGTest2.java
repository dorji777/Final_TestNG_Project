						package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TestNGPage2;
import util.BrowserFactory;

public class TesNGTest2 {

	WebDriver driver;

	
	@Test
	
	public void pageDupicateCategory() throws Exception {
		
		driver = BrowserFactory.init();
		TestNGPage2 TestNG2 = PageFactory.initElements(driver, TestNGPage2.class);
		
		TestNG2.validateDupicateCategory();
						
	}
	
}
