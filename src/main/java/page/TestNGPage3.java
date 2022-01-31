package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TestNGPage3 {

WebDriver driver;
	
	@FindBy(how= How.XPATH, using = "//select[@name=\"due_month\"]" )	WebElement MONTH_DROPLIST;
	@FindBy(how= How.XPATH, using = "//*[@id=\"extra\"]/select[3]" )	WebElement CLICK_MONTH_DROPLIST;
	
	
	public void clickDueMonth() {
		
		CLICK_MONTH_DROPLIST.click();
	}
	
	
	public void validateMonthDropList() {
		
		String[] arr = {"Month","Jan","Feb","Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		Select sel = new Select(MONTH_DROPLIST);
		
		List<WebElement> months = sel.getOptions();
		
		for(WebElement we : months){
		     for(int i = 1; i<arr.length; i++){
		         if(we.getText().equals(arr[i])){
		        	 System.out.println("list of months: " + arr[i]  +  "  Matched" );
		             break;
		         }
		     }
			
		}
		
	}
	
	
}
