package javacpackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSEXample {

	double d = 10.45;
	int a = (int) d;

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("google.com");
		} catch (Exception e) {
			// takesscreenshot
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\S@f'\\Desktop\\kalyan\\chrome.png"));
		}

	}

}
