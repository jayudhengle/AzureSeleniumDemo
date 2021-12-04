package my_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script1 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayud\\OneDrive\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
		WebElement val = driver.findElement(By.xpath("//label[@for='radio2']"));
		String value =  val.getText();
		
		driver.findElement(By.id("autocomplete")).sendKeys(value);
		
		//Select d = new Select((WebElement) By.id("dropdown-class-example"));
		
		Select d = new Select(driver.findElement(By.id("dropdown-class-example")));
		d.selectByValue("option3");

		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
				
		
	}

}
