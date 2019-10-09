package inheritanceExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		WebElement frm = driver.findElement
				(By.className("result"));
		driver.switchTo().frame(frm);

//		driver.switchTo().frame("result1");

		driver.findElement(By.xpath(".//*[@value='Click me']"))
		.click();

		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();

	}

}
