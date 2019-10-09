package inheritanceExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ebay.com");
		WebElement myEbay = driver.findElement(By.className("gh-eb-li-a"));

		Actions act = new Actions(driver);

		WebElement ele1 = driver.findElement
				(By.id("gh-btn"));
		WebElement ele2 = driver.findElement
				(By.id("gf-norton"));

		act.dragAndDrop(ele1, ele2).perform();

//		act.moveToElement(myEbay).perform();
//		Thread.sleep(2000);
//		
//		WebElement messagesLink=driver.findElement
		(By.linkText("Messages"));
//	
//		act.click(messagesLink).perform();
//		
//		act.doubleClick(messagesLink).perform();
//		
//		act.contextClick(messagesLink).perform();
//		

	}

}
