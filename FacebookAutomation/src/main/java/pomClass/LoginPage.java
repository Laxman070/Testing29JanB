package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement Email ;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement Password ;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement Login ;
	
	public LoginPage (WebDriver driver)
	{
        	
		PageFactory.initElements(driver,this);
	}
	
      public void InsertEmail() {
    	  Email.sendKeys("8421978756");
      }
      
      public void InsertPassword()
      {
    	  Password.sendKeys("Laxman@123");
      }
      
      public void ClickOnLogin()
      {
    	  Login.click();
      }
}
