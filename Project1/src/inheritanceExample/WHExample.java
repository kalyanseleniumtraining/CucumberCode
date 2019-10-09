package inheritanceExample;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHExample {

	public void closeWindow(WebDriver driver, String titleToClose) {
		Set<String> ids = driver.getWindowHandles();// 2 ids

		for (String id : ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if (title.equals(titleToClose)) {
				driver.close();
			}

		}
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");// 2 windows
		// call the methods

		WHExample obj = new WHExample();
		obj.closeWindow(driver, "Amazon");

	}

}
