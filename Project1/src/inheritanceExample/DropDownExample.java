package inheritanceExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");

		WebElement dropDownBox = driver.findElement
				(By.id("gh-cat"));

		//driver.findElement(By.xpath(".//input[@class='LM6RPg']"));
		
		
		Select sel = new Select(dropDownBox);

		List<WebElement> items = sel.getOptions();
		
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		
		
		
		
		
		

//		for (int i = 0; i < items.size(); i++) {
//			System.out.println(items.get(i).getText());
//		}

		// sel.selectByIndex(4);
		// sel.selectByVisibleText("Crafts");
		// sel.selectByValue( "625");
//		WebElement defaultValue = sel.getFirstSelectedOption();
//		String text = defaultValue.getText();
//		if (text.equals("All Categoriess")) {
//			System.out.println("Default value matched");
//		} else {
//			System.out.println("Default value not matched");
//		}

	}

}
