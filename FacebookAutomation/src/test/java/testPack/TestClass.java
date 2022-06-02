package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.LoginPage;

public class TestClass {

	public static void main(String[]arg)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\New folder\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.facebook.com/");
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.InsertEmail();
		loginpage.InsertPassword();
		loginpage.ClickOnLogin();
		
		String url = driver.getCurrentUrl();
	
		
				
		
	}
	
	
	
}
