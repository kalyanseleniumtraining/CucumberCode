import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailExample {
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new FirefoxDriver();
//		driver.get("http://gmail.com");
//		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit
		                                           .SECONDS);
//		WebElement email=driver.findElement
		(By.id("identifierId"));
//		email.sendKeys("kalyan");
//		
//		WebElement nextButton=driver.
		findElement(By.xpath(".//span[text()='Next']"));
//		nextButton.click();
//		//pause the prog 
//	
//		WebDriverWait wait=new WebDriverWait(driver, 15);
//		
//		WebElement password=wait.until
		(ExpectedConditions.visibilityOfElementLocated
				(By.name("password")));
//		password.sendKeys("abcd");//5 sec
//		
//		
//		
		
		
		
		
		
		
	}

}
