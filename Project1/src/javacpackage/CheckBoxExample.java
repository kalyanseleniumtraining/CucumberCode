package javacpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
//		WebElement link=
//	driver.findElement(By.partialLinkText("Web Usabili"));
//		link.click();
//		

		WebElement firstCheckBox = driver.findElement(By.name("permission"));
		boolean firstCheckboxState = firstCheckBox.isSelected();

		if (firstCheckboxState == true) {
			System.out.println("Already selected not doing any action");
		} else {
			firstCheckBox.click();

		}

	}

}
