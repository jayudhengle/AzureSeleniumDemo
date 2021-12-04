package my_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class My_TestNG 
{
    
     public WebDriver driver;

	@BeforeSuite
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayud\\OneDrive\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(description= "This is Google page", priority =2)
	public void test2()
	{
		driver.navigate().to("https://google.com/");
	}
	
	@Test(description= "This is Bing page", priority =1)
	public void test3()
	{
		driver.navigate().to("https://bing.com/");
	}
	
	@AfterSuite
	public void test4()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void test6()
	{
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void test5()
	{
		String a = driver.getTitle();
		System.out.println(a);
	}
}
