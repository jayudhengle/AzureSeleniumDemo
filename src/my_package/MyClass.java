package my_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyClass {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayud\\OneDrive\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		//driver.get("https://www.calculator.net/gas-mileage-calculator.html");
		
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

		
		driver.findElement(By.id("isAgeSelected")).click();
		
		driver.findElement(By.xpath("(//input[ @class='cb1-element'])[1]")).click();
		
		boolean a = driver.findElement(By.xpath("(//input[ @class='cb1-element'])[1]")).isSelected();
		boolean b = driver.findElement(By.xpath("(//input[ @class='cb1-element'])[2]")).isSelected();

		
		if(a == false)
		{
			System.out.println("Option 1 is selected");
		}
		
		if(b == false)
		{
			System.out.println("Option 2 is deselected");
		}
		
		

	}

}
