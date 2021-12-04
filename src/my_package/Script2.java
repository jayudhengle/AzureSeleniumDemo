package my_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayud\\OneDrive\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		String parentHandle = driver.getWindowHandle();

		driver.findElement(By.id("openwindow")).click();
		
		for (String winHandle : driver.getWindowHandles()) 
		{
		    driver.switchTo().window(winHandle); 
		}
		System.out.println(driver.getTitle());
		driver.close(); 
		
		driver.switchTo().window(parentHandle); 
		
		
		Actions actions = new Actions(driver);
    	WebElement MouseHover = driver.findElement(By.id("mousehover"));
    	actions.moveToElement(MouseHover);
    	
    	Thread.sleep(2000);
    	
    	WebElement Reload = driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
    	System.out.println(Reload.getText());
    	actions.moveToElement(Reload);
    	actions.click().build().perform();

    	

	}

}
